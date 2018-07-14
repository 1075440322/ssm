package net.ssm.util;

public class Pager {

	private int pageNo;//第几页
	private int pageSize;//一页显示条数
	private int dataCount;//总条数
	private int nextPageNo;
	private int prevPageNo;
	private int pageNoCount;//当前页是第几条
	
	
	public void setPageNoCount(int pageNoCount) {
		this.pageNoCount = pageNoCount;
	}
	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}
	public void setPrevPageNo(int prevPageNo) {
		this.prevPageNo = prevPageNo;
	}
	
	public int getPageNoCount() {
		if(pageNo<1) pageNo=1;
		pageNoCount = (pageNo-1)*pageSize;
		return pageNoCount;
	}

	public int getPageNo() {
		if(pageNo<1) pageNo=1;
		if(pageNo>this.getPageCount()) pageNo=this.getPageCount();
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		if(pageSize<=0) pageSize=10;
		return pageSize;
	}
	public void setPageSize(int pageSize) {			
		this.pageSize = pageSize;
	}
	public int getDataCount() {
		
		return dataCount;
	}
	public void setDataCount(int dataCount) {		
		this.dataCount = dataCount;
	}
	//总页数
	public int getPageCount() {		
		return (dataCount-1)/this.getPageSize()+1;		 
	}
	
	//获得上一页
	public int getPrevPageNo()
	{
		if(this.getPageNo()==1){ prevPageNo=this.getPageNo();}
		else{ prevPageNo=this.getPageNo()-1;}
		return prevPageNo;
	}
	//获得下一页
	public int getNextPageNo()
	{
		if(this.getPageNo()==this.getPageCount()) nextPageNo= this.getPageNo();
		else nextPageNo=this.getPageNo()+1;
		return nextPageNo;
	}
	
	
}




