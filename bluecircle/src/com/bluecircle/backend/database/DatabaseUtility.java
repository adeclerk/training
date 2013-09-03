/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluecircle.backend.database;

import java.sql.Connection;

/**
 *
 * @author Alex
 */
public class DatabaseUtility {
    
    private static Connection conn = null;
    
    public static Connection getConnection() {
        if(DatabaseUtility.conn == null) {
            DatabaseUtility.conn = 
        }
    }
}
