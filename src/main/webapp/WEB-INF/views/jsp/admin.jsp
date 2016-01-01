<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div>
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-5">
            <jsp:include page="admin_content.jsp" flush="true"/>
        </div>
        <div class="col-sm-6"></div>
    </div>
</div>
<br>

<div>
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-4">
            <jsp:include page="admin_section.jsp" flush="true"/>
        </div>
        <div class="col-sm-7"></div>
    </div>
</div>
<br>

<div>
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-2">
            <jsp:include page="admin_content_section_select.jsp" flush="true"/>
        </div>
        <div class="col-sm-4"></div>
        <div class="col-sm-5"></div>
    </div>
</div>

