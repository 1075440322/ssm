package net.ssm.vo;

import java.util.Date;
import java.sql.Timestamp;

public class Borrow {
	
	private int id;
	private Date startDate;             //借书起始时间
	private Date endDate;				//还书时间
	private Timestamp dateDepend;       //创建时间
	private Date returnDate;            //实际还书时间
	private Boolean state;			    //是否还书
	private Boolean enable;			    //是否可用	
	private User user;					//级联用户表多对一			
	private Book book;				    //级联书   一对一
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Timestamp getDateDepend() {
		return dateDepend;
	}
	public void setDateDepend(Timestamp dateDepend) {
		this.dateDepend = dateDepend;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
}
