package com.rays.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("insert into student_marksheet values(?,?,?,?,?,?)");

		pstmt.setInt(1, bean.getId());
		pstmt.setInt(2, bean.getRollNo());
		pstmt.setString(3, bean.getName());
		pstmt.setInt(4, bean.getPhy());
		pstmt.setInt(5, bean.getChem());
		pstmt.setInt(6, bean.getMath());
		
		int i = pstmt.executeUpdate();
		
		System.out.println(i +"row affected(records inserted)");
		
		conn.close();
		pstmt.close();
	}

}
