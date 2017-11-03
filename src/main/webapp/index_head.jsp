<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title> 
</head>
<link type="text/css" rel="stylesheet" href="css/cgxManage.css" />
<script src="js/Time.js"></script>
<script src="js/jquery-1.8.3.js"></script>
<script>
 $(function(){      
	  $(".title").click(function(){  
	 	 window.parent.frames[1].head($(this).text());  
		  });
	}) ;
</script>    
<body>
<div>
<div id="header" class="wrap">
	<div id="logo" style="padding-right:20px;"><img src="images/logo.jpg" width="166" height="50"/>
    </div>
	<div class="help">
    <p>你好,admin   系统管理员<a href="点卡通后台登录.html" target="_parent">注销</a></p>
    </div>
    <div class="navbar">
	  <ul class="clearfix"> 
        	<li class="title i0"><a href="#">我的面板</a></li>
            <li class="title i1"><a href="#">内容管理</a></li>
			<li class="title i2"><a href="#">产品中心</a></li>
			<li class="title i3"><a href="#">订单管理</a></li>
			<li class="title i4"><a href="#">会员管理</a></li>
            <li class="title i5"><a href="#">报表统计</a></li> 
            <li class="title i6"><a href="#">其他</a></li>
		</ul>
	</div>
</div>
<div id="childNav">
	<div class="wrap">	
		<div id="myclock"></div>
</div>
</div>
</div>	
</body>
</html>
