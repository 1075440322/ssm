package net.ssm.dao;

import java.util.List;

import net.ssm.util.Pager;
import net.ssm.vo.Book;

public interface BookDao {

	List<Book> findAll();

	Book findById(Integer id);

	int getDataCount();

	List<Book> findAllPager(Pager pager);	

}
