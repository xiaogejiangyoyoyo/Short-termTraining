<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2017/5/16
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>学生列表页面</title>
</head>
<body>
<div>
    欢迎你，${NAME}!
</div>
<div>
    <table width="960" border="1">
        <caption><h2>学生列表</h2></caption>
        <tr>
            <th width="10%">序号</th>
            <th width="15%">姓名</th>
            <th width="15%">账号</th>
            <th width="10%">性别</th>
            <th width="15%">电话</th>
            <th width="15%">生日</th>
            <th width="20%">操作</th>
        </tr>
        <tr>
            <c:forEach items="${studentList}" var="student" varStatus="hehe">
                <tr>
        <td align="center">${status.name}</td>
        <td align="center">${status.account}</td>
        <td align="center">${status.gender?'男':'女'}</td>
        <td align="center">${status.phone}</td>
        <td align="center">${status.birthday}</td>
        <td align="center">
            <fmt:formatDate value="${student.birthday}" type="date" pattern="yyyy-mm-dd"/></td>
            <a href="student_detail">明细</a>&nbsp;&nbsp;
            <a href="student_toedit">编辑</a>&nbsp;&nbsp;
            <a href="student_delete" onclick="return confirm('确定','取消')">删除</a>
    </tr>
            </c:forEach>
    </table>
</div>
</body>
</html>
