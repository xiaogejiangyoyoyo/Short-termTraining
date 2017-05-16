<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#register").click(function(){
		var form=$("form").get(0);
		form.action="register.jsp";
		form.submit();
		
	})
})

</script>
</head>
<body>
<form action="login" method="post">
<table>
   <caption><h3>管理员登录</h3></caption>
<tr>
<td align="right">账号：</td>
<td><input type="text" name="account"></td>
</tr>
<tr>
<td align="right">密码：</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td align="center" colspan="2">
<input type="submit" value="登录">
<input id="register" type="button" value="注册">
</td>
</tr>
</table>
</form>
</body>
</html>