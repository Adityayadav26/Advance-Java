package com.rays.jdbc.preparedstatement;

import java.sql.SQLException;

public class TestMarksheetModel {
	public static void main(String[] args) throws Exception{
		testadd();
	}
	
	public static void testadd() throws Exception{
		MarksheetModel model = new  MarksheetModel();
		MarksheetBean bean      = new MarksheetBean();
		
		bean.setId(19);
		bean.setRollNo(121);
		bean.setName("Bhanu");
		bean.setPhy(45);
		bean.setChem(90);
		bean.setMath(65);
		
		model.add(bean);
		
		
		
	}
	

}
