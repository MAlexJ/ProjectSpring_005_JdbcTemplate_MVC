<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Tables
        </h1>
        <ol class="breadcrumb">${titleContent}</ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-6">
        <table class="table table-bordered table-hover">
            <thead>
            <tr>
                <th></th>
                <th>Name</th>
                <th>Path</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${contents}" var="item">
                <tr class="info">
                    <td><input type="checkbox" value="${item.id}"></td>
                    <td><c:out value="${item.name}"/></td>
                    <td><c:out value="${item.path}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="col-lg-6">
        <h3>RequestMapping for Controller</h3>
        <ul>
            <li> /</li>
            <li> /menu</li>
            <li> /content</li>
            <li> /contact</li>
            <li> /help</li>
        </ul>
    </div>
</div>
<div class="row">
    <div class="col-lg-4">
        <a href="#spoiler_insert" class="btn btn-info" data-toggle="collapse"> Insert</a>

        <div class="collapse" id="spoiler_insert">
            <div class="well">
                <form method="post" accesskey="tratata">
                    Name: <input type="text" class="form-control" name="name" placeholder="name">
                    <br>
                    Path: <input type="text" class="form-control" name="path" placeholder="path">
                    <br>
                    <button type="submit" class="btn btn-info">Enter</button>
                </form>
            </div>
        </div>
    </div>
</div>
<br>

<div class="row">
    <div class="col-lg-4">
        <button class="btn btn-info"> Update</button>
    </div>
</div>
<br>

<div class="row">
    <div class="col-lg-4">
        <button class="btn btn-info"> Delete</button>
    </div>
</div>
<br>

<div class="row">
    <div class="col-lg-4">
        <button class="btn btn-info"> Clear</button>
    </div>
</div>
<br>