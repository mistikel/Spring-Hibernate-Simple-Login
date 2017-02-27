package com.bee.dao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bee.model.Login;
@Repository("loginDao")
public class LoginDaoIml implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Login login) {
		sessionFactory.getCurrentSession().saveOrUpdate(login);
	}

	@Override
	public void edit(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Login> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Login getUser(String username) {
		Login login = (Login)sessionFactory.getCurrentSession()
				.get(Login.class, username);
		return login;
	}

}
