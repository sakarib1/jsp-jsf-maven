package edu.balu.app.jsf.mvn.sample.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import edu.balu.app.jsf.mvn.sample.model.User;
import edu.balu.app.jsf.mvn.sample.service.UserService;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
	
	@ManagedProperty(value="#{userService}")
	UserService userService;
	
	private String name;
	private String surname;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void persistUser(){
		User user = new User();
		user.setName(getName());
		user.setSurname(getSurname());
		userService.persistUser(user);
	}
	
	
	
}
