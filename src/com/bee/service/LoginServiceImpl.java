package com.bee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bee.dao.LoginDao;
import com.bee.model.Login;

@Service("loginService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void add(Login login) {
		loginDao.add(login);
		
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
		
		return loginDao.getUser(username);
	}

}
