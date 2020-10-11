package edu.balu.app.jsf.mvn.sample.service;

import edu.balu.app.jsf.mvn.sample.model.User;

public interface UserService {
	void persistUser(User user);
	User findUserById(int id);
	void updateUser(User user);
	void deleteUser(User user);
}
