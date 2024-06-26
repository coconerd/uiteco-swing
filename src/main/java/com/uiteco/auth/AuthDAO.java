/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uiteco.auth;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import com.uiteco.database.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.uiteco.auth.Session.ACCOUNT_TYPE;

/**
 *
 * @author nddmi
 */
public class AuthDAO {

    public static final String PBE_DERIVATION_ALGORITHM = "PBKDF2WithHmacSHA256";
    public static final int PBE_DERIVATION_SALT_LENGTH = 16; // bytes;
    public static final int PBE_DERIVATIONKEY_KEY_LENGTH = 16; // bytes

    public static class LoginResult {

    }

    /**
     *
     * @param username
     * @param email
     * @param password
     * @throws MissingCredentialsException if required credentials aren't
     * provided
     * @throws InvalidCredentialsException if required credentials are provided
     * but is invalid or has bad format
     */
    public static void login(String username, String email, String password) throws Exception {
        boolean hasEmail = (email != null && !email.equals(""));

        try {
            // Query from db
            Connection conn = ConnectionManager.getConnection();
            PreparedStatement statement;
            String sql;
            if (hasEmail) {
                sql = "SELECT * FROM TAIKHOAN WHERE EMAIL = ?";
                statement = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                statement.setString(1, email);
            } else {
                sql = "SELECT * FROM TAIKHOAN WHERE USERNAME = ?";
                statement = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                statement.setString(1, username);
            }
            ResultSet rs = statement.executeQuery();
            if (!rs.next()) {
                throw new InvalidCredentialsException();

            }

            // Password verification
            byte[] passwordHash = rs.getBytes("MATKHAU");
            byte[] salt = rs.getBytes("PBKDF2_SALT");
            byte[] toBeVerified = deriveKey(password, salt);
            if (compareKeys(toBeVerified, passwordHash) == false) {
                throw new InvalidCredentialsException();
            }

            // Save user info to Session
            ACCOUNT_TYPE accountType = null;
            int accountID;
            int a = rs.getInt("LOAITK");
            switch (a) {
                case 1:
                    accountType = ACCOUNT_TYPE.admin;
                    break;
                case 2:
                    accountType = ACCOUNT_TYPE.sinhvien;
                    break;
                case 3:
                    accountType = ACCOUNT_TYPE.cuusinhvien;
                    break;
                case 4:
                    accountType = ACCOUNT_TYPE.giangvien;
                    break;
            }

            if (hasEmail) {
                username = rs.getString("USERNAME");
            } else {
                email = rs.getString("EMAIL");
            }

            accountID = rs.getInt("MATK");
            com.uiteco.main.App.getSession().setUsername(username);
            com.uiteco.main.App.getSession().setEmail(email);
            com.uiteco.main.App.getSession().setAccountType(accountType);
            com.uiteco.main.App.getSession().setAccountID(accountID);
            
            // Cleanup
            statement.close();
            rs.close();
            conn.close();

        } catch (Exception e) {
            throw e;
        }
    }

    private static byte[] deriveKey(String password, byte[] salt) throws InvalidKeySpecException, NoSuchAlgorithmException {
        int iterations = 65536;
        PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, PBE_DERIVATIONKEY_KEY_LENGTH * 8);

        SecretKeyFactory factory = SecretKeyFactory.getInstance(PBE_DERIVATION_ALGORITHM);
        SecretKey sk = factory.generateSecret(spec);

        return sk.getEncoded();
    }

    private static boolean compareKeys(byte[] key1, byte[] key2) {
        if (key1.length != key2.length) {
            return false;
        }

        int result = 0;
        for (int i = 0; i < key1.length; i++) {
            result |= key1[i] ^ key2[i];
        }

        return result == 0;
    }

    private static byte[] genSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        return salt;
    }

    // This function is only for testing purpose
    private static void register(String email, String username, String password, int accountType) {
        /* Verify email, username, password, accountType */
        try {
            Connection conn = ConnectionManager.getConnection();
            byte[] salt = genSalt();
            byte[] passwordHash = deriveKey(password, salt);

            String sql = "INSERT INTO TAIKHOAN (EMAIL, USERNAME, MATKHAU, PBKDF2_SALT, LOAITK) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, username);
            statement.setBytes(3, passwordHash);
            statement.setBytes(4, salt);
            statement.setInt(5, accountType);
            statement.executeUpdate();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Register successful");
    }

    // This function is meant for testing purpose
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Username: ");

            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            try {
                login(username, email, password);
                System.out.println("Login successful");
                break;
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
