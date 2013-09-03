package com.adeclerk.bg.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	private static Connection conn = null;
	
	private Database() { }
	
	public static Connection getConnection() {
		if(conn == null) {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:bg.db");
		}
	}
}
