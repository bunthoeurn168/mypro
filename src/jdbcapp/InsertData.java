package jdbcapp;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		try{  
			// register to database
			Class.forName("com.mysql.jdbc.Driver");  
			//Open connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SwingDatabase","root","");  
			//Execute query
			 Statement st = con.createStatement();
		      st.executeUpdate("INSERT INTO person (first_name, last_name, reg_dtime) "
		          +"VALUES ('Teb', 'Kanha', now())");
		      System.out.println("insert success");
		      con.close();   
			  
			}catch(Exception e){ System.out.println(e);}
	}

}
