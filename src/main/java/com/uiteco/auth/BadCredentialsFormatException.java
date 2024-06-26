/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uiteco.auth;

/**
 *
 * @author nddmi
 */
public class BadCredentialsFormatException extends Exception {
    public static enum BAD {EMAIL, USERNAME, PASSWORD};
    private BAD creds;
    
    public BadCredentialsFormatException(BAD creds) {
        super("Thông tin đăng nhập không đúng format");
        this.creds = creds;
    }

    public BAD getCreds() {
        return creds;
    }
    
    @Override
    public String getMessage() {
        String error;
        if (getCreds() == BAD.EMAIL) {
            error = "Email phải có định dạng *@*uit.edu.vn";
        } else if (getCreds() == BAD.USERNAME) {
            error = "Username phải có độ dài " + String.valueOf(AuthModel.MIN_USERNAME_LEN) + " - " + String.valueOf(AuthModel.MAX_USERNAME_LEN) + " ký tự và chỉ có chữ/số";
        } else {
            error = "Mật khẩu phải có độ dài từ " + String.valueOf(AuthModel.MIN_PASSWORD_LEN) + " - " + String.valueOf(AuthModel.MAX_PASSWORD_LEN) + " ký tự";
        }
        
        return error;
    }
    
    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println(getMessage());
    }
}
