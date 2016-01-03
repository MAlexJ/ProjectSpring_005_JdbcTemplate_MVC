<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-hover">
    <thead>
    <tr>
        <th>Name</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${get_tables_name}" var="item">
        <tr class="info">
            <td><c:out value="${item}"/></td>
            <td><a href="${pageContext.request.contextPath}/admin/modify/${item}" class="btn-info btn-sm">Modify</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
