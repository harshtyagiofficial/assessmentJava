package com.mydemos.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconn {

	public static Connection getConnection() {
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxc", "pass");
			System.out.println("Connected");
			return con;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
