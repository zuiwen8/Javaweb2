<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" session="true" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<h1>当前网站的有<%=request.getSession().getServletContext().getAttribute("Count")%>人访问</h1>
</html>
