<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Tables
        </h1>
        <ol class="breadcrumb"> Tables: ${titleContent} </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-6">
        <jsp:include page="admin_content.jsp" flush="true"/>
    </div>
    <div class="col-lg-6"></div>
</div>
<div class="row">
    <div class="col-lg-12">
        <ol class="breadcrumb"> Tables: ${titleSection} </ol>
    </div>
</div>
<div class="row">
    <div class="col-lg-6">
        <jsp:include page="admin_section.jsp" flush="true"/>
    </div>
    <div class="col-lg-6"></div>
</div>

<div class="row">
    <div class="col-lg-12">
        <ol class="breadcrumb"> Tables: ${titleContentSection}  </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-6">
        <jsp:include page="admin_content_section_select.jsp" flush="true"/>
    </div>
    <div class="col-lg-6"></div>
</div>

<div class="row">
    <div class="col-lg-12">
        <ol class="breadcrumb"> Tables: ${titleAdmin}  </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-8">
        <jsp:include page="admin_admin.jsp" flush="true"/>
    </div>
    <div class="col-lg-4"></div>
</div>

