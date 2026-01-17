package com.rays.jdbc.preparedstatement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testUpdate();
		// testDelete();
		// testfindbylogin();
		// testfindbypk();
		// testauthenticate();
		 testsearch();
		//testSearch1();
	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		bean.setId(8);
		bean.setFirstName("abii");
		bean.setLastName("sahu");
		bean.setLogin("abii@gmail.com");
		bean.setPassword("abii123");
		bean.setDob(sdf.parse("2024-03-10"));

		model.add(bean);

	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		bean.setId(6);
		bean.setFirstName("vedik");
		bean.setLastName("sahu");
		bean.setLogin("abii@gmail.com");
		bean.setPassword("abii123");

		bean.setDob(sdf.parse("2002-03-10"));

		model.Update(bean);

	}

	public static void testDelete() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		bean.setId(5);

		model.Delete(bean);

	}

	public static void testfindbylogin() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		bean = model.findByLogin("alok@gmail.com");

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
	}

	public static void testfindbypk() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		bean = model.findBypk(7);

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
	}

	public static void testauthenticate() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		bean = model.authenticate("alok@gmail.com", "alok123");

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());

	}

	public static void testsearch() throws Exception {
		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		 bean.setFirstName("Aditya");
		//bean.setLastName("yadav");
		List list = model.search(bean);

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());

			model.search(bean);
		}
	}

	public static void testSearch1() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		bean.setFirstName("ajay");


		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());

		model.search1(bean);

	}
}
