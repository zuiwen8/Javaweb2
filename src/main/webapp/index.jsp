<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" session="true" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<h1>当前网站的有<%=request.getSession().getServletContext().getAttribute("Count")%>人访问</h1>
<%--<%--%>
<%--    HttpSession session1 = request.getSession();--%>
<%--    session1.setAttribute("username","zs");--%>
<%--    session1.removeAttribute("username");--%>
<%--    session1.setAttribute("username","ls");--%>
<%--    session1.setAttribute("username","ww");--%>
<%--%>--%>
</html>
