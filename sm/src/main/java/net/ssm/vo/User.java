package net.ssm.vo;

import java.sql.Timestamp;

public class User {
	
	private int id;                             
	private Timestamp dateDepent;						//创建时间
	private String username;							//用户名
	private String password;							//密码
	private String mobile;								//电话
	private String email;								//邮箱
	private Boolean sex;								//性别
	private Double money;								//押金
	private Boolean eanble;								//是否可用
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Timestamp getDateDepent() {
		return dateDepent;
	}
	public void setDateDepent(Timestamp dateDepent) {
		this.dateDepent = dateDepent;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Boolean getEanble() {
		return eanble;
	}
	public void setEanble(Boolean eanble) {
		this.eanble = eanble;
	}



}
