package net.ssm.service;

import java.util.List;

import net.ssm.vo.Book;
import net.ssm.vo.User;

public interface UserService extends CommonService<User> {
	public  User getUserById(int id);

	public User findExist(String username, String password);

	public List<Book> findBookIndex();
}
