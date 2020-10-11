package edu.balu.app.jsf.mvn.sample.dao;

import edu.balu.app.jsf.mvn.sample.model.User;

public interface UserDao {
	void persistUser(User user);
	User findUserById(int id);
	void updateUser(User user);
	void deleteUser(User user);
}
