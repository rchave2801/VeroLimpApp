package com.verolimp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	private static final String url = "jdbc:mysql://localhost:3306/verolimp";
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String username = "rchave";
	private static final String password = "bigboss_2801";
	private static Connection connect = null;
	
	public static Connection createConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
		return connect;
	}
	
	public static void closeConnection(Connection connect) throws SQLException {
		connect.close();
	}
}
