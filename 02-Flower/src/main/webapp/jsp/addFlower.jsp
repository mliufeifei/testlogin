<%--
  Created by IntelliJ IDEA.
  User: 18505
  Date: 2019/1/16
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/addFlower">
    花蕊名称：<input type="text" name="name"><br/>
    花蕊价格：<input type="text" name="price"><br/>
    花蕊产地：<input type="text" name="production"><br/>
    <input type="submit" value="确认添加">
</form>
</body>
</html>
