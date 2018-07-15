package net.ssm.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.ssm.service.BookService;
import net.ssm.service.UserService;
import net.ssm.util.Pager;
import net.ssm.vo.Book;
import net.ssm.vo.Picture;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {

	@Resource
	private UserService userService;
	@Resource
	private BookService bookService;

	/*@Test
	public void findById() {
		User user  = userService.getUserById(1);
		System.out.println(user.getUsername());
	}
	@Test
	public void findAll() {
		List<User> users = userService.findAll();
		for (User user : users) {
			System.out.println("!!!!!!!!"+user.getId());
		}
	}
	@Test
	public void findAllBook() {
		List<Book> books = bookService.findAll();
		for (Book book : books) {
			System.out.println("@@@@@@@@"+book.getName());
		}
	}*/
	
/*	@Test
	public void findByBookId() {
		Book book = bookService.findById(1);
		System.out.println(book.getPrice());
		System.out.println(book.getIndexPic());
		System.out.println(book.getName());
		List<Picture> list = book.getPictures();
		System.out.println(list.size()+"@@@@@@@@@@@@");
		for (Picture picture : list) {
			System.out.println(picture.getPicName());
		}
		
	}
	@Test
	public void getDataCount() {
		int a  = bookService.getDataCount();
		System.out.println(a+"这是所有book");
	}*/
	@Test
	public void findAllPage() {
		//我爱cold!!!!!
        //我爱莉莉丝!!!!!!!!
		Pager pager = new Pager();
		pager.setPageSize(2);
		pager.setPageNo(2);
		pager.setDataCount(8);
		List<Book> books = bookService.findAll(pager);
		for (Book book : books) {
			System.out.println(book.getName());
		}
	}

	
}
