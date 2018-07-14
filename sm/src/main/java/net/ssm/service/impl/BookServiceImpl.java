package net.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.ssm.dao.BookDao;
import net.ssm.service.BookService;
import net.ssm.util.Pager;
import net.ssm.vo.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Resource
	private BookDao bookDao;

	public void save(Book object) {
	}

	public void delete(Book object) {
	}

	public void delete(Integer id) {
	}

	public void delete(String ids) {
	}

	public void update(Book object) {
	}

	public Book findById(Integer id) {
		return bookDao.findById(id);
	}

	public List<Book> findAll() {
		return bookDao.findAll();
	}

	public List<Book> findAll(Book object) {
		return null;
	}

	public List<Book> findAll(Pager pager) {
		return bookDao.findAllPager(pager);
	}

	public List<Book> findAll(Pager pager, Book object) {
		return null;
	}

	public int getDataCount() {
		return bookDao.getDataCount();
	}

	public int getDataCount(Book object) {
		return 0;
	}


	
	
	

}
