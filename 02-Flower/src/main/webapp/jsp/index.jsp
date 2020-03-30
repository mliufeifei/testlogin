<%--
  Created by IntelliJ IDEA.
  User: 18505
  Date: 2019/1/16
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示所有花卉信息</title>
    <style type="text/css">
        #aa{
            text-decoration: none;
            color: black;
            align:center;
        }
        #aa{
            color: red;
        }
    </style>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>价格</td>
            <td>地址</td>
        </tr>
        <c:forEach items="${list}" var="li">
            <tr>
                <td>${li.id}</td>
                <td>${li.name}</td>
                <td>${li.price}</td>
                <td>${li.production}</td>
            </tr>
        </c:forEach>

    </table>
    <a href="<%=request.getContextPath() %>/insFlowerInfo" id="aa">添加花蕊信息</a>
</body>
</html>
