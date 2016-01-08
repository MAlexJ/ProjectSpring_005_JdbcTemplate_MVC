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
        <table id="table_modify_content" class="table table-bordered table-hover">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Path</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${contents}" var="item">
                <tr class="info">
                    <td><c:out value="${item.id}"/></td>
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
                <form method="post">
                    Name: <input type="text" class="form-control" name="insert_name" placeholder="name">
                    <br>
                    Path: <input type="text" class="form-control" name="insert_path" placeholder="path">
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
        <a href="#spoiler_update" class="btn btn-info" data-toggle="collapse"> Update</a>

        <div class="collapse" id="spoiler_update">
            <div class="well">
                <form method="post">
                    Id: <input type="text" class="form-control" name="update_id" placeholder="id">
                    <br>
                    Name: <input type="text" class="form-control" name="update_name" placeholder="name">
                    <br>
                    Path: <input type="text" class="form-control" name="update_path" placeholder="path">
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
        <a href="#spoiler_delete" class="btn btn-info" id="btn_delete_content_modify" data-toggle="collapse"> Delete</a>

        <div class="collapse" id="spoiler_delete">
            <div class="well">
                <form method="post">
                    Id: <input type="text" class="form-control" name="delete_id" placeholder="id">
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
        <a href="#spoiler_clear" class="btn btn-info" data-toggle="collapse"> Clear</a>

        <div class="collapse" id="spoiler_clear">
            <div class="well">
                <form method="post">
                    <label> Enter command "clear"</label>
                    <br>
                    Command: <input type="text" class="form-control" name="command_clear" placeholder="clear">
                    <br>
                    <button type="submit" class="btn btn-info">Enter</button>
                </form>
            </div>
        </div>

    </div>
</div>
<br>