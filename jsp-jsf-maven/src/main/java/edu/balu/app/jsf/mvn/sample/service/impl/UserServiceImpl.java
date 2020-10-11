package edu.balu.app.jsf.mvn.sample.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.balu.app.jsf.mvn.sample.dao.UserDao;
import edu.balu.app.jsf.mvn.sample.model.User;
import edu.balu.app.jsf.mvn.sample.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Transactional
	public void persistUser(User user) {
		userDao.persistUser(user);
		
	}
	@Transactional
	public User findUserById(int id) {
	
		return userDao.findUserById(id);
	}
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}
	@Transactional
	public void deleteUser(User user) {
		userDao.deleteUser(user);
		
	}

}
