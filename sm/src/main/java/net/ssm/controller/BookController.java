package net.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.ssm.service.BookService;
import net.ssm.util.Pager;
import net.ssm.vo.Book;

@Controller
@RequestMapping("book")
public class BookController {
	@Resource
	private BookService bookService;
	
	@RequestMapping("details")
	public ModelAndView findBookById(String id) {
		Book book = bookService.findById(Integer.valueOf(id));
		ModelAndView mv = new ModelAndView();
		mv.addObject("book",book);
		mv.setViewName("/web/details");
		return mv;
	}
	
	
	@RequestMapping("findAll")
	public ModelAndView findAll(String pagerId) {
		ModelAndView mv = new ModelAndView();
		Pager pager = new Pager();
		pager.setPageSize(2);
		pager.setPageNo(Integer.valueOf(pagerId));
		//pager.setPageNo(5);
		pager.setDataCount(bookService.getDataCount());
		List<Book> books = bookService.findAll(pager);
		mv.addObject("books",books);
		mv.addObject("pager",pager);
		mv.addObject("lable",2);
		mv.setViewName("/web/library");
		return mv;
	}
	
}
