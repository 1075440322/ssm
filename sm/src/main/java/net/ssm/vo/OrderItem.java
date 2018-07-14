package net.ssm.vo;

import java.sql.Timestamp;



public class OrderItem {
	
	private int id;                    
	private Timestamp dateDepend;       //创建时间
	private Boolean enable;				//是否可用
	private Order order;				//级联订单多对一
	private Book book;					//级联书一对一
	

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public Timestamp getDateDepend() {
		return dateDepend;
	}
	public void setDateDepend(Timestamp dateDepend) {
		this.dateDepend = dateDepend;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}
