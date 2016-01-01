<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Spring JdbcTemplate</title>
    <link href="${pageContext.request.contextPath}/resources/img/favicon.ico" rel="icon" type="image/x-icon"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.css" media="screen">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
<c:choose>
    <c:when test="${currentPage eq 'admin'}">
        <jsp:include page="admin.jsp" flush="true"/>
    </c:when>
    <c:otherwise>
        <jsp:include page="index_navbar.jsp" flush="true"/>
        <header class="header">
        <jsp:include page="index_home.jsp" flush="true"/>
        </header>
    </c:otherwise>
</c:choose>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script-jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
