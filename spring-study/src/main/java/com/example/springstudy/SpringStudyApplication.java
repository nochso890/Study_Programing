package com.example.springstudy;

import com.example.springstudy.chapter1.user.dao.NCompanyDao;
import com.example.springstudy.chapter1.user.dao.UserDao;
import com.example.springstudy.chapter1.user.domain.User;
import java.sql.SQLException;

public class SpringStudyApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		UserDao userDao = new NCompanyDao();

		User user = new User();
		user.setId("testID");
		user.setName("testName");
		user.setPassword("testPassword");

		userDao.addUser(user);

		System.out.println(user.getId() + "등록 성공");

		User user1 = userDao.get(user.getId());

		System.out.println(user1.getId());
	}

}
