/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uiteco.auth;

import java.util.regex.Pattern;
import com.uiteco.main.App;

/**
 *
 * @author nddmi
 */
public class AuthModel implements Permissible {

    /**
     * Implementation for Permissible interface
     */
    private byte[] accessKey;

    @Override
    public byte[] getAccessKey() {
        return this.accessKey;
    }

    @Override
    public void setAccessKey(byte[] accessKey) {
        this.accessKey = accessKey;
    }

    public static final int MIN_USERNAME_LEN = 4;
    public static final int MAX_USERNAME_LEN = 40;
    public static final int MIN_PASSWORD_LEN = 8;
    public static final int MAX_PASSWORD_LEN = 32;
    public static final String EMAIL_POSTFIX = "uit.edu.vn";

    private String email;
    private String username;
    private String password;
    private boolean loggedIn;

    public AuthModel() {
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void loginWithEmail(String email, String password) throws Exception {
        boolean hasEmail = (email != null && !email.equals(""));
        boolean hasPassword = (password != null && !password.equals(""));

        if (!(hasEmail && hasPassword)) {
            throw new MissingCredentialsException();
        }

        try {
            setEmailOrThrow(email);
            setPasswordOrThrow(password);
            Session retSession = AuthDAO.login(getUsername(), getEmail(), getPassword());
            _postLogin(retSession);
        } catch (Exception e) {
            throw e;
        }
    }

    public void loginWithUsername(String username, String password) throws Exception {
        boolean hasUsername = (username != null && !username.equals(""));
        boolean hasPassword = (password != null && !password.equals(""));

        if (!(hasUsername && hasPassword)) {
            throw new MissingCredentialsException();
        }

        // Verify and set credentials
        try {
            setUsernameOrThrow(username);
            setPasswordOrThrow(password);
            Session retSession = AuthDAO.login(getUsername(), getEmail(), getPassword());
            _postLogin(retSession);
        } catch (Exception e) {
            throw e;
        }
    }

    private void _postLogin(Session retSession) throws PermissibleNotPermittedException {
        App.getSession().setEmail(retSession.getEmail(), this);
        App.getSession().setUsername(retSession.getUsername(), this);
        App.getSession().setAccountID(retSession.getAccountID(), this);
        App.getSession().setAccountType(retSession.getAccountType(), this);
        App.getSession().setPermitted(true, this);
    }

//    public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
//        this.propertyChangeSupport = propertyChangeSupport;
//    }
    private void setEmailOrThrow(String inputEmail) throws BadCredentialsFormatException {
        int len = inputEmail.length();

        // Email must ends with 'uit.edu.vn'
        if (len <= EMAIL_POSTFIX.length()) {
            throw new BadCredentialsFormatException(BadCredentialsFormatException.BAD.EMAIL);
        }

        String postfix = inputEmail.substring(len - EMAIL_POSTFIX.length(), len);
        if (!postfix.equals("uit.edu.vn")) {
            throw new BadCredentialsFormatException(BadCredentialsFormatException.BAD.EMAIL);
        }

        this.email = inputEmail;
    }

    private void setUsernameOrThrow(String inputUsername) throws BadCredentialsFormatException {
        int len = inputUsername.length();
        if (!(len >= MIN_USERNAME_LEN && len <= MAX_USERNAME_LEN)) {
            throw new BadCredentialsFormatException(BadCredentialsFormatException.BAD.USERNAME);
        }

        String regex = "^[a-zA-Z0-9]*$";
        if (!Pattern.matches(regex, inputUsername)) {
            throw new BadCredentialsFormatException(BadCredentialsFormatException.BAD.USERNAME);
        }

        this.username = inputUsername;
    }

    private void setPasswordOrThrow(String inputPassword) throws BadCredentialsFormatException {
        int len = inputPassword.length();
        if (!(len >= MIN_PASSWORD_LEN && len <= MAX_PASSWORD_LEN)) {
            throw new BadCredentialsFormatException(BadCredentialsFormatException.BAD.PASSWORD);
        }

        this.password = inputPassword;
    }
}
