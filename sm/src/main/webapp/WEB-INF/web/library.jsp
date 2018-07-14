<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<nav aria-label="Page navigation">
  <ul class="pagination">
    <li>
      <a href="<%=path%>/book/findAll?pagerId=${pager.prevPageNo}" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    
    <c:forEach begin="${(pager.pageNo-2)<1?1:(pager.pageNo-2) }" end="${(pager.pageNo+2)>((pager.dataCount-1)/pager.pageSize+1)?((pager.dataCount-1)/pager.pageSize+1):(pager.pageNo+2) }" var="s">
    <c:if test="${pager.pageNo == (s)}" var="aaa">
    <li><a href="#" style="background-color:#d9edf7;">${s}</a></li>
    </c:if>
    <c:if test="${not aaa }">
    <li><a href="<%=path%>/book/findAll?pagerId=${s}">${s}</a></li>
    </c:if>
    

    </c:forEach>
    <li>
    
      <a href="<%=path%>/book/findAll?pagerId=${pager.nextPageNo}" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>

<jsp:include page="/WEB-INF/web/inc/footer.jsp"></jsp:include>
<script type="text/javascript">
function findBook( book ){
	var id = book.name;
	location.href ="<%=path%>/book/details?id="+id;
	
}
</script>
