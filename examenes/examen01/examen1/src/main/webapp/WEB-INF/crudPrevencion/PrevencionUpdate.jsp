<%--
  Created by IntelliJ IDEA.
  User: migue
  Date: 09/02/2020
  Time: 09:30 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Update</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <a class="navbar-brand" href="/login/LoginAction.action">Home</a>
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="/delegacion/">Delegacion</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/zona/">Zona</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/riesgo/">Riesgo</a>
        </li>
        <li class="nav-item active">
            <a class="nav-link" href="/prevencion/">Prevencion</a>
        </li>
    </ul>
</nav>
<h2>update</h2>

<a href="Report"><button class="button-report" type="button">Reporte</button></a>

<form action="updatedetails" method="post">

        <label>Nombre:   </label>
        <input name="nombre" value='${nombre}'>
        <label>Descripcion:         </label>
        <input type="text" name="descripcion" value='${nombre}'>
		<button name="submitType" value="UPDATE" type="submit">Update</button>

</form>
<s:if test="ctr>0">
    <span style="color: red;">${msg}</span>
</s:if>
<s:else>
    <span style="color: red;">${msg}</span>
</s:else>
</body>
</html>