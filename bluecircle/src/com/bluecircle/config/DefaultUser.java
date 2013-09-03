/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluecircle.config;

/**
 *
 * @author Alex
 */
public class DefaultUser {
    private String username;
    private String password;
    
    public DefaultUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    
}
