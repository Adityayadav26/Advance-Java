package com.rays.jdbc.transcation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTranscation {
	public static void main(String[] args) throws Exception {

		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root", "root");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate(
					"insert into st_user values(9,'uday','dabi','uday@gmail.com','uday123','2003-04-07')");

			i = stmt.executeUpdate(
					"insert into st_user values(10,'kana','dabi','kana@gmail.com','kana123','2003-04-07')");

			i = stmt.executeUpdate(
					"insert into st_user values(11,'neha','dabi','neha@gmail.com','neha123','2003-04-07')");

			conn.commit();
			System.out.println("records inserted....");

			conn.close();
			stmt.close();

		} catch (Exception e) {

			conn.rollback();
			e.printStackTrace();

		}
	}

}
