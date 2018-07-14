<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bootstrap 101 Template</title>
<link href="<%=path%>/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

		<jsp:include page="/WEB-INF/web/inc/header.jsp"></jsp:include>
		<div class="row">
		  <c:forEach items="${books}" var="book">
		  	<div class="col-xs-6 col-md-3" >
		  	 <span>${book.name }</span>
		     <a  href="#" class="thumbnail">
		       <img name="${book.id}" onclick="findBook(this);"  src="<%=path %>/images/${book.indexPic}"  style="width: 200px;height: 200px;" >
		     </a>
		   </div>
		  
		  </c:forEach>

		</div>

		<jsp:include page="/WEB-INF/web/inc/footer.jsp"></jsp:include>


<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="<%=path%>/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	
	
})

function findBook( book ){
	var id = book.name;
	location.href ="<%=path%>/book/details?id="+id;
	
}

</script>
</body>
</html>