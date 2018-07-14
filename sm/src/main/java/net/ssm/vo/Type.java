package net.ssm.vo;

import java.util.List;

public class Type {
	
	private int id;
	private String name;                  //类型名称
	private Boolean enable;				  //是否可用
	private List<Book> books;             //级联书表多对多
	
	
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
}
