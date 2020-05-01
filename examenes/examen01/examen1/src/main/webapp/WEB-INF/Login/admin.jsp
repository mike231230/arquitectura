<%--
  Created by IntelliJ IDEA.
  User: migue
  Date: 17/04/2020
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>login admin</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav"></ul>
</nav>
<div class="jumbotron">
    <center>
        <h2 class="display-1">codigo de autenficacion</h2>
    </center>
    <s:form action="LoginAction" method="POST">
        <s:property value="usuario"/>
        <s:property value="psw"/>
        <s:textfield label="codigo" type="number" name="codigo"/>
        <s:submit label="btn btn-submit"/>
    </s:form>

<div/>
</body>
</html>
