package jdbcapp;

import java.sql.*;

public class JDBCDemo {
	public static void main(String[] args) {
		try {
			// JDBC driver name and database register to database
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Open connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdatabase","root","");  
			System.out.println("Connect to database successfully.");
			//Execute query
			Statement st = con.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
