<%@ page import="java.util.Date" errorPage="errorPage.jsp" %><%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date date = new Date();
        System.out.println(date);
    %>

    <%
        String str = null;
        char ch = str.charAt(0);  // 에러 발생 시키는 코드
    %>
</body>
</html>
