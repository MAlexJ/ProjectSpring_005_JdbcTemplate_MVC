<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="form-group">
    <label for="sel1">${titleContentSection} list:</label>
    <select class="form-control" id="sel1">
        <c:forEach items="${contents_sections}" var="item">
            <option><c:out value="${item.name}"/></option>
        </c:forEach>
    </select>
    <br>
    <br>
</div>
