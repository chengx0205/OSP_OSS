<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title> 
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script>
	$(function(){
		$(".context").each(function(){
			$(this).mouseenter(function(){
				$(this).addClass("style");
			}).mouseleave(function(){
				$(this).removeClass("style");
				})
			})
		$(".title").siblings(this).css("display","none"); 
		$(".title").each(function(e){ 
		$(".i"+e).toggle(function(){   
			$(".title").siblings(this).css("display","none"); 
			$(this).parent().children("li").css("display","block");		
			},
			function(){ 
				$(this).siblings(this).css("display","none");		
			}
			);
		});
		})
	
	function head(ss){   
		$(".title").each(function(e){ 
		<!--获取参数对比文本信息相同则展开--> 
	  if(ss==$(this).text()){  
		 $(".i"+e).parent().children("li").css("display","block"); 
	 $(this).parent().siblings().children(".context").css("display","none");	
	  }  
			});
			 
	}
</script>
<style>
body {
	font:12px/22px Verdana, Geneva, sans-serif;
	background:#fff;
	color:#333;
	border:2px solid #CCC;
}
body, p, ul, ol, li, dl, dt, dd, input, h1, h2, h3, h4, form, hr {
	padding:0;
	margin:0;
}
#index_left_div {
	background:#EEE;
	margin-left:8px;
	height:700px;
	width:243px;
	
}
a {
	text-decoration:none
}
ul {
	width:200px;
	margin-top:5px;
	margin-bottom:-5px
	
}
.title {
	font-size:20px;
	width:218px;
	padding-left:20px;
	border:2px solid #CCC;
}
li {
	list-style:none;
	line-height:50px;
}
.context {
	font-size:16px;
	padding-left:80px;
	width:163px;
}
a {
	color:#333;
}
.style {
	background-color: #ddd;
}
</style>
</head>
<body>
<div id="index_left_div">
        <c:forEach var="auth" items="${Auth}" varStatus="status">
       		 <ul>
                 <li class="title i${status.index+1}">
                 ${auth.authName}
                 </li>    
                 <li class="context" >${status.index+1}</li>
            </ul>	
        </c:forEach>
</div>
</body>
</html>
