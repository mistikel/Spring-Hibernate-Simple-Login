package com.bee.dao;

import java.util.List;

import com.bee.model.Login;

public interface LoginDao {
	void add(Login login);
	void edit(Login login);
	void delete(String username);
	Login getUser(String username);
	List<Login> getAllUser();
}
