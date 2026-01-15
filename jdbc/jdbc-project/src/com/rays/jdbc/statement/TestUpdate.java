package com.rays.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("Com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql:// localhost:3306/jdbcproject","root","root");
		
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate(
				"Update st_user set firstName = 'Pankaj',lastName ='Yadav',login ='pankaj@gmail.com',Password = 'Pankaj123',where id =3");
		
		System.out.println(i + "row affected..(records updated)");
		
		conn.close();
	}

}
