<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page isErrorPage="true"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Display Single Book </title>
    <%--    <link rel="stylesheet" type="text/css" href="/css/style.css">--%>
    <%--    <script type="text/javascript" src="js/app.js"></script>--%>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <p> <c:out value="${showBook.title}"/> </p>
    <p> <c:out value="${showBook.description}"/> </p>
    <p> <c:out value="${showBook.language}"/></p>
    <p> <c:out value="${showBook.numberOfPages}"/> </p>
    <p> <a href="/books">Home</a> </p>

</body>
</html>
