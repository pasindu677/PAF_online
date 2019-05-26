package com.anjuc.utils.buyer.Connection;



import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection createConnection() {
	Connection con = null;
	String url ="jdbc:mysql://localhost:3306/user";
	String username = "root";
	String password = "root";
	
	
	try {
		try {
			Class.forName("cpm.mysql.jdbc.Drive");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Printing connection object " + con);
		}
		catch (Exception e) {
		e.printStackTrace();
		
	}
	return con;
}
	
}
