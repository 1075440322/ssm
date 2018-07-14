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
	<div style="width: 1200px; margin: auto; height: 1000px;">
		<div class="page-header">
		  <h1>爱cold,爱66,爱素素,爱莉莉     <small>欢迎来到小绿帽的图书馆</small></h1>
		</div>
		<div>
			<ul class="nav nav-tabs">
			  <li role="presentation" <c:if test="${empty lable}">class="active"</c:if>><a href="<%=path%>/user/index">首页</a></li>
			  <li role="presentation" <c:if test="${lable =='2' }">class="active"</c:if>><a href="<%=path%>/book/findAll?pagerId=1">图书馆</a></li>
			  <li role="presentation"><a href="#">图书商店</a></li>
			  <li role="presentation"><a href="#">登录</a></li>
			</ul>
		</div>
		
		<div class="jumbotron">
		  <h3>广告	</h3>
		</div>