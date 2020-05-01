<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
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
    <h2 class="display-1">Formulario de autenticacion</h2>
    </center>
<div class="container form d-flex justify-content-center mt-5">
        <s:form action="LoginAction" cssClass="form-group" method="loginuser">
            <s:textfield cssClass="form-control" label="Username" key="username" name="user"/>
            <s:password cssClass="form-control mt-2" label="Password" key="password" name="pswd" />
            <div class="row pl-5">
                <s:checkbox cssClass="form-check-input" name ="admin" fieldValue="true" label="administrador"/>
            </div>
            <s:submit class="btn btn-success"   />
        </s:form>
</div>
   <a href="#demo" class="btn btn-primary" data-toggle="collapse">Registro</a>
    <div id="demo" class="collapse">
    <s:form action="RegisterUserAction" method="POST">
       <s:textfield key="username" name="user"/>
       <s:password key="password" name="password"/>
       <s:submit/>
    </s:form>
    </div>
</div>

</body>
</html>
