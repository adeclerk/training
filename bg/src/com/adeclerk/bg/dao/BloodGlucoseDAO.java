package com.adeclerk.bg.dao;

import java.sql.Connection;

import com.adeclerk.bg.beans.BloodGlucoseBean;

public class BloodGlucoseDAO {
	private static Connection conn = null;
	
	public BloodGlucoseDAO() {
		if(conn == null) {
			conn = Database.getConnection();
		}
	}
	
	public void persist(BloodGlucoseBean user) {
		
	}
	
}
