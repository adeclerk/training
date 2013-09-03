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
public class BlueCircleDatabase {
    private static BlueCircleDatabase dbConn = null;
    public static Connection getConnection() {
        
    }
    
    public static void open() {
        if(dbConn != null){
           
        }
    }
    
    public static void close() {
        
    }
}
