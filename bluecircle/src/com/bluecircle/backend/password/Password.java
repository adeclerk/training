/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluecircle.backend.password;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class Password {
    private String value;
    
    public Password(String value) throws PasswordException {
        byte[] bytes = Password.encrypt(value);
        this.value = (String) bytes;
    }
    
    public static byte[] encrypt(String password) throws PasswordException{
        try {
            byte[] messageBytes = password.getBytes();
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(messageBytes);
            
            return digest;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, ex);
            throw new PasswordException("No such digest algorithm");
        }
    }
}
