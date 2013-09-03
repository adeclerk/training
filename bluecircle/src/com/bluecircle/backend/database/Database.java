/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluecircle.backend.database;

/**
 *
 * @author Alex
 */
public interface Database {
    
    public abstract void connect();
    public abstract void disconnect();
    
    public abstract void insert(String table, );
    public abstract void update();
    public abstract void delete();
    
}
