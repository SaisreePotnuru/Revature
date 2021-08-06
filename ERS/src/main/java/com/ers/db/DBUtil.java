package com.ers.db;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {

	public static  Connection getConnection()  throws Exception{
		
		FileInputStream fileStream = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\ERS\\target\\classes\\jdbc.properties");
		Properties properties = new Properties(); //resource bundle 
		properties.load(fileStream);
		String url = properties.getProperty("url");	
		String id = properties.getProperty("id"); 
		String pwd = properties.getProperty("pwd"); 
	     Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/revature","root","Saisree@31"); 
	            return con;
	}
}

