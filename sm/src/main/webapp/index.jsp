<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="UTF-8">
<title>ocod后台管理</title>
<link href="<%=path%>/css/admin_login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=path%>/js/jquery-3.2.1.min.js"></script>
</head>

<body>
	<div class="admin_login_wrap">
		<h1>后台管理</h1>
		<div class="adming_login_border">
			<div class="admin_input">
				<form action="index.html" method="post">
					<ul class="admin_items">
						<li>
							<label for="user">用户名：</label> 
							<input type="text" name="username" id="username" size="30" class="admin_input_style" />
						</li>
						<li>
							<label for="pwd">密码：</label> 
							<input type="password" name="pwd" id="password" size="30" class="admin_input_style" />
						</li>
					<%-- 	<li>
							<label for="pwd">验证码：</label> 
							<img id="captchaImg" src="<%=path%>/code_create.action" /> 
							<input type="text" name="pwd" id="code" size="10" class="admin_input_style" />
						</li> --%>
						<li>
							
						</li>
						<li>
							<input id="sub" type="button" tabindex="3" value="提交" class="btn btn-primary" />
						</li>
						<li>
							<p id="sp"></p>
						</li>
					
					</ul>
				</form>
			</div>
			
			
		</div>
		<p class="admin_copyright">
			<a tabindex="5" href="http://www.mycodes.net/" target="_blank">返回首页</a>
			&copy; 2018 Powered by <a href="http://www.mycodes.net/"
				target="_blank">源码之家</a>
		</p>
	</div>


</body>
<script type="text/javascript"> 
$(function(){
	$("#sub").click(function(){
		
		var username = $("#username").val();
		var password =$("#password").val();
		
		$.ajax({
			   type: "POST",
			   url: "<%=path%>/user/login",
			   data: "username="+username+"&password="+password,
			   success: function(msg){
			     if(msg=="fail"){
			    	 $("#sp").css("color","red");
			    	 $("#sp").html("用户名密码错误");
			     }
			     else{
			    	 $("#sp").html("");
			    	 alert("登陆成功");
			    	 window.location.href="<%=path%>/user/index";
			     }
			   }
			});
	});
	
	
})
</script>



</html>