package net.ssm.dao;

import java.util.List;

import net.ssm.vo.User;

public interface UserDao {
	public User findById(int id);

	public User findExist(String username, String password);
	
	public List<User> findAll();
}
