package net.ssm.vo;

import java.sql.Timestamp;
import java.util.List;

public class Order {
	
	private int id;        
	private Timestamp dateDepend;            //创建时间
	private Double amount;                   //订单总额
	private Boolean enable;					 //是否可用
	private User user;						 //级联用户多对一						
	private List<OrderItem> orderITems;		 //级联订单详情一对多
	
	
	
	//orderITem
	//userId
	public List<OrderItem> getOrderITems() {
		return orderITems;
	}
	public void setOrderITems(List<OrderItem> orderITems) {
		this.orderITems = orderITems;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
