<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/web/inc/header.jsp"></jsp:include>
		
		<p class="navbar-text">${book.name}</p>
		
	
		<div class="row">
			
		  	<div class="col-xs-6 col-md-3" >
		     <a  href="#" class="thumbnail">
		       <img onclick="findBook(this);"  src="<%=path %>/images/${book.indexPic}"  style="width: 200px;height: 200px;" >
		     </a>
		   </div>
		  

		</div>
			<div class="row">
		  <c:forEach items="${book.pictures}" var="books">
		  	<div class="col-xs-6 col-md-3" >
		  	
		     <a  href="#" class="thumbnail">
		       <img onclick="findBook(this);"  src="<%=path %>/images/${books.picName}"  style="width: 200px;height: 200px;" >
		     </a>
		   </div>
		  
		  </c:forEach>

		</div>
	<table>
		<tr>
			<td>简介</td>
		</tr>
		<tr>	
			<td>${book.brief}</td>
			
		</tr>
		<tr>
			<td>库存</td>
		</tr>
		<tr>
			<td>
				<c:if test="${empty book.amount}" var="aaa"><div style="color:#F00">库存不足</div></c:if>
				<c:if test="${not aaa }">${book.amount}</c:if>
			</td>
		</tr>
	
	
	</table>


<jsp:include page="/WEB-INF/web/inc/footer.jsp"></jsp:include>
</body>
</html>