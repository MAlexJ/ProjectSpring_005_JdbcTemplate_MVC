<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation" id="nav_id">
    <div class="container">
        <div class="navbar-collapse">
            <ul class="nav navbar-nav pull-right" id="text_header">
                <c:forEach items="${contents}" var="item">
                    <li><a href="${pageContext.request.contextPath}${item.path}"><c:out value="${item.name}"/></a></li>
                </c:forEach>
                <li><a href="${pageContext.request.contextPath}/admin">Administrator</a></li>
            </ul>
        </div>
    </div>
</div>