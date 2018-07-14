package net.ssm.service.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.ssm.dao.BookDao;
import net.ssm.dao.UserDao;
import net.ssm.service.UserService;
import net.ssm.util.Pager;
import net.ssm.vo.Book;
import net.ssm.vo.User;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	@Resource
	private BookDao bookDao;

	public User getUserById(int id) {
		return userDao.findById(id);
	}

	public void save(User object) {
	}

	public void delete(User object) {
	}

	public void delete(Integer id) {
	}

	public void delete(String ids) {
	}

	public void update(User object) {
	}

	public User findById(Integer id) {
		return null;
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public List<User> findAll(User object) {
		return null;
	}

	public List<User> findAll(Pager pager) {
		return null;
	}

	public List<User> findAll(Pager pager, User object) {
		return null;
	}

	public int getDataCount() {
		return 0;
	}

	public int getDataCount(User object) {
		return 0;
	}

	public User findExist(String username, String password) {
		
		return userDao.findExist(username, password);
	}

	public List<Book> findBookIndex() {
		return bookDao.findAll();
	}
	
}
