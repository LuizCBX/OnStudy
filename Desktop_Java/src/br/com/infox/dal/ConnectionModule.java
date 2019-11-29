package br.com.infox.dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionModule {

	public static Connection conector() {
		
		java.sql.Connection conection =null;
		String driver = "com.mysql.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/db_ead?useSSL=false";
		
		String user = "root";
		
		String password = "";

		try {
			Class.forName(driver);
			conection = DriverManager.getConnection(url,user,password);
			return conection;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
}
