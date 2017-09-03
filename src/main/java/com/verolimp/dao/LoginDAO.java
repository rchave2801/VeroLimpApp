package com.verolimp.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	private Connection con;
	
	public boolean authneticateUser(String user, String pass) {
		String query = "SELECT ID FROM USER U WHERE U.USERNAME = ? AND U.PASSWORD = ? ";
		con = DBManager.createConnection();
		CallableStatement cstmt = null;
		ResultSet resultSet = null;
		
		try {
			cstmt = con.prepareCall(query);
			
			cstmt.setString(1, user);
			cstmt.setString(2, pass);
			
			resultSet = cstmt.executeQuery();
			
			if(resultSet.next())
				return true;
			else
				return false;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
