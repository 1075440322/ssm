package net.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.ssm.service.UserService;
import net.ssm.vo.Book;
import net.ssm.vo.User;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	private UserService userService;
	
	//这里应该在userService中再注入一个bookDao而不应该在action中加入
	//@Resource
	//private BookService bookService;
	/**
	 * 简单的用户登录;
	 */
	@RequestMapping(value="login")
	@ResponseBody
	public String login(User user) {
		
		String username = user.getUsername();
		String password = user.getPassword();
		User user2 = userService.findExist(username,password);
		if(user2 == null) {
			return "fail";
		}else {
			return "true";
		}
		
	}
	/**
	 *登录成功跳转首页 
	 */
	@RequestMapping(value="index")
	public ModelAndView index() {
		List<Book> books = userService.findBookIndex();
		ModelAndView mv  = new ModelAndView();
		mv.addObject("books",books);
		mv.setViewName("/web/hello");
		return mv;
	}
}
