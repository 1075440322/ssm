package net.ssm.vo;

import java.sql.Timestamp;

public class MoneySource {
	private int id;
	private Double price;                    //缴费金额
	private Timestamp dateDepend;            //缴费时间
	private boolean enable;                  //是否可用
	private User  user;                      //级联用户  多对一
	
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Timestamp getDateDepend() {
		return dateDepend;
	}
	public void setDateDepend(Timestamp dateDepend) {
		this.dateDepend = dateDepend;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
}
