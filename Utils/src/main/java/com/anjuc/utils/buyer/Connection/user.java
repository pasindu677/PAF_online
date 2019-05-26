package com.anjuc.utils.buyer.Connection;




import java.sql.*;


public class user {
	
	public String  login(String userN , String passW) {
		
		Connection con = null;
		Statement statement = null;
		ResultSet resultset =null;
		
		String fNameDB ="";
		String lNameDB ="";
		String passwordDB = "";
		String emailDB = "";
		
		
		try {
			con = DBConnection.createConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery("select fname ,lname, passworld,emal ");
			
			while(resultset.next()) {
				fNameDB = resultset.getString("fname");
				lNameDB =resultset.getString("fname");
				passwordDB = resultset.getString("passworld");
				emailDB =resultset.getString("passworld");
				
				if(userN.equals(fNameDB) && passW.equals(passwordDB)) {
					return "suceess";
					
				}
			}
			
			
		}
		catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return "Invalied user details";
		
	}
	
	

}
