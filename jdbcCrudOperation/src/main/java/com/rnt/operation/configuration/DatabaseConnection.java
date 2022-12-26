package com.rnt.operation.configuration;

import java.sql.*;

public class DatabaseConnection 
{
	 static Connection con=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring?useSSL=false","root","root");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}

}
