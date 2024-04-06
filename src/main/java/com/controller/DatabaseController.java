package com.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.User;
import com.util.StringUtil;

public class DatabaseController {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3308/college_app";
		String user = "root";
		String pass = "";
		
		return DriverManager.getConnection(url,user, pass);
		
		
	}
	
	
	public int addUser(User user) {
		
		try (Connection conn = getConnection()){
			PreparedStatement st = conn.prepareStatement(StringUtil.INSERT_USER);
			st.setString(1,user.getUsername() );
			st.setString(2,user.getFirstName());
			st.setString(3,user.getLastName());
			st.setDate(4,Date.valueOf(user.getDob()));
			st.setString(5,user.getGender());
			st.setString(6,user.getEmail());
			st.setString(7,user.getPhoneNumber());
			st.setString(8,user.getPassword());
			st.setString(9,user.getAddress());
			
			int result = st.executeUpdate();
			return  result > 0 ? 1: 0;
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		return -1;
	}
	
//	this is the last part done where the data re send to the database

}
