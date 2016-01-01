<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="wrapper">
    <jsp:include page="admin_navbar.jsp" flush="true"/>

    <div id="page-wrapper">
        <div class="container-fluid">
            <c:choose>
                <c:when test="${adminPage eq 'tables'}">
                    <jsp:include page="admin_tables.jsp" flush="true"/>
                </c:when>
                <c:when test="${adminPage eq 'forms'}">
                    <jsp:include page="admin_forms.jsp" flush="true"/>
                </c:when>
                <c:when test="${adminPage eq 'elements'}">
                    <jsp:include page="admin_elements.jsp" flush="true"/>
                </c:when>
                <c:when test="${adminPage eq 'grid'}">
                    <jsp:include page="admin_grid.jsp" flush="true"/>
                </c:when>
                <c:otherwise>
                    <jsp:include page="admin_tables.jsp" flush="true"/>
                </c:otherwise>
            </c:choose>
        </div>
    </div>
</div>


