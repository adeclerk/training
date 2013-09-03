package com.thefax.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.thefax.bean.LoginBean;
import com.thefax.bean.ProductBean;
import com.thefax.bean.UserBean;

public class ShoppingDAO {
	private Connection newConnection() throws SQLException {
		
/*		ResourceBundle bundle = ResourceBundle.getBundle("dbinfo");
		try {
			// alternate way to register driver
			Class.forName(bundle.getString("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection(bundle.getString("url"),bundle.getString("user"),bundle.getString("pass")); */
		Context initCtx;
		Context envCtx;
		try {
			initCtx = new InitialContext();
			envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource dataSrc = (DataSource) envCtx.lookup("jdbc/myds");
			return dataSrc.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		
	}
	
	public boolean persist(UserBean user) {
		String sql = "INSERT INTO users VALUES (?,?,?,?,?,?,?)";
		
		Connection conn = null;
		try {
			conn = newConnection();
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getUserid());
			stmt.setString(2, user.getName());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getEmail());
			stmt.setString(5, user.getCity());
			stmt.setString(6, user.getPhone());
			stmt.setInt(7, user.getAge());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public boolean validate(LoginBean login) {
		String sql = "SELECT * FROM users WHERE user_id=? AND password=?";
		Connection conn = null;
		
		try {
			conn = newConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login.getUserid() );
			stmt.setString(2, login.getPassword());
			ResultSet rs = stmt.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<ProductBean> getCatalog() {
		String sql = "SELECT * FROM products ORDER BY code";
		Connection conn = null;
		
		ArrayList<ProductBean> catalog = null;
		
		try {
			conn = newConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			
			catalog = new ArrayList<ProductBean>();
			while(rs.next()) {
				ProductBean product = new ProductBean();
				product.setCode(rs.getInt(1));
				product.setDescription(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				catalog.add(product);
			}
			return catalog;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public ProductBean getProduct(String code) {
		String sql = "SELECT * FROM products WHERE code=" + code;
		Connection conn = null;
		
		try {
			conn = newConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			ProductBean product = null;
			
			if(rs.next()) {
				product = new ProductBean();
				product.setCode(rs.getInt(1));
				product.setDescription(rs.getString(2));
				product.setPrice(rs.getDouble(3));
			}
			return product;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
