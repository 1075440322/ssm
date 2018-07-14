package net.ssm.vo;

import java.sql.Date;
import java.util.List;


public class Book {
	private int id;
	private String writer;                  //作者
	private Date publicDate;				//发布时间
	private Double amount;					//库存
	private String name;					//书名
	private String brief;					//简介
	private String indexPic;				//首页图片
	private Date borrowDate;				//借阅天数
	private Double price;					//价格
	private Boolean isSale;                 //是否出售    null可卖可租     0可租      1可卖
	private Boolean enable;					//是否可用
	private List<Picture> pictures;         //级联图片表一对多
	private List<Type> types;               //级联图书类型  多对多
	
	
	
	
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Date getPublicDate() {
		return publicDate;
	}
	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
	public String getIndexPic() {
		return indexPic;
	}
	public void setIndexPic(String indexPic) {
		this.indexPic = indexPic;
	}
	
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public Boolean getIsSale() {
		return isSale;
	}
	public void setIsSale(Boolean isSale) {
		this.isSale = isSale;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	

}
