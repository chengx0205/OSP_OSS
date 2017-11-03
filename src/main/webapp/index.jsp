<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>前台首页</title> 
</head>
	<frameset rows="98px,*"  border="0px" >  
    	<frame src="index_head.jsp" scrolling="no" noresize/>
        <frameset cols="280px,*"  border="0px"  > 
    	<frame name="left" src="richinfo/auth/showAuth" />
    	<frame src="welcome.html" name="right" scrolling="yes" noresize style="padding-left:30px; padding-top:20px;;" />
        </frameset>
    </frameset>	
    <noframes>
		<body>
		</body>
	</noframes>
</html>
