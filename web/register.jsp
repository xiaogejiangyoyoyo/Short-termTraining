<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
<form action="">
<table>
<caption><h3>学生注册</h3></caption>
<tr>
<td align="right">账号：</td>
<td><input type="text" name="account"></td>
</tr>
<tr>
<td align="right">姓名：</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td align="right">密码：</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td align="right">确认密码：</td>
<td><input type="password" name="repassword"></td>
</tr>
<tr>
<td align="right">学号：</td>
<td><input type="text" name="studyNumber"></td>
</tr>
<tr>
<td align="right">性别：</td>
<td><input type="radio" name="gender" value="true" checked="checked">男
<input type="radio" name="gender" value="false">女
</td>
</tr>
<tr>
<td align="right">电话：</td>
<td><input type="text" name="phone"></td>
</tr>
<tr>
<td align="right">Email：</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td align="right">生日：</td>
<td><input type="text" name="birthday"></td>
</tr>
<tr>
<td align="right">兴趣：</td>
<td><input type="checkbox" name="interest" value="sing">唱歌
    <input type="checkbox" name="interest" value="dance">跳舞
    <input type="checkbox" name="interest" value="food">美食
    <input type="checkbox" name="interest" value="study">学习
<br>
    <input type="checkbox" name="interest" value="film">电影
    <input type="checkbox" name="interest" value="sport">运动
    <input type="checkbox" name="interest" value="game">游戏
    <input type="checkbox" name="interest" value="reading">阅读
</td>
</tr>
<tr>
<td align="right">籍贯：</td>
<td><select name="birthPlace">
<option value="0">=请选择=</option>
<option value="1">南京</option>
<option value="2">镇江</option>
<option value="3">常州</option>
<option value="4">无锡</option>
<option value="5">苏州</option>
<option value="6">扬州</option>
<option value="7">泰州</option>
<option value="8">南通</option>
<option value="9">淮安</option>
<option value="10">宿迁</option>
<option value="11">盐城</option>
<option value="12">徐州</option>
<option value="13">连云港</option>

</select></td>
</tr>
<tr>
<td align="right">自我评价：</td>
<td><textarea name="introduction" rows="5" cols="30">随便留下点什么吧。。。。</textarea>
</td>
</tr>
<tr>
<td align="center" colspan="2">
<input type="submit" value="注册">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="返回"
onclick="javascript:window.history.back()">
</td>
</tr>
</table>
</form>
</body>
</html>