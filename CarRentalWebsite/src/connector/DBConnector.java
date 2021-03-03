package connector;

import java.sql.*;
import java.util.*;

public class DBConnector {
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/RentACar";
			String username = "root";
			String password = "23Wiktoria.";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return con;
		}catch(Exception e) {
			System.out.println("Connection failed");
			System.out.println(e.getMessage());
		}
		return null;
	}

}
