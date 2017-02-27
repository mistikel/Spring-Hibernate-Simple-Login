package com.bee.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

public class LoginBean {
	@NotNull
	@NotEmpty(message = "Todak Boleh Kosong")
	@Size(min=4,max=25)
	private String username;
	
	@NotNull
	@NotEmpty(message = "Todak Boleh Kosong")
	@Size(min=4,max=25)
	private String email;
	
	@NotNull
	@NotEmpty(message = "Todak Boleh Kosong")
	@Size(min=4,max=25)
	private String password;
	
	@NotNull
	@NotEmpty(message = "Todak Boleh Kosong")
	@Size(min=4,max=25)
	private String retypePassword;
	
	public void setRetypePassword(String retypePassword){
		this.retypePassword = retypePassword;
	}
	
	public String getRetypePassword(){
		return this.retypePassword;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	
}
