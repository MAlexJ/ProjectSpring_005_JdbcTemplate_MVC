<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<label>${titleSection} page</label>
<table class="table table-bordered table-hover">
    <thead>
    <tr>
        <th>#</th>
        <th>Id</th>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sections}" var="item">
        <tr class="info">
            <td><input type="checkbox" value="${item.id}"></td>
            <td><c:out value="${item.id}"/></td>
            <td><c:out value="${item.name}"/></td>
        </tr>
    </c:forEach>
    <tr>
        <td>
            <button class="btn btn-info btn-block" id="bt_insert" type="button">Insert</button>
        </td>
        <td>
            <button class="btn btn-info btn-block" id="bt_update" type="button">Update</button>
        </td>
        <td>
            <button class="btn btn-info btn-block" id="bt_delete" type="button">Delete</button>
        </td>
    </tr>
    </tbody>
</table>