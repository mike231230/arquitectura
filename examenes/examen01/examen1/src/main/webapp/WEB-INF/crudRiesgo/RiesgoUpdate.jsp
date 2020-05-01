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
        <li class="nav-item active">
            <a class="nav-link" href="/riesgo/">Riesgo</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/prevencion/">Prevencion</a>
        </li>
    </ul>
</nav>
<h2>actualizacion de riesgo</h2>

<a href="Report"><button class="button-report" type="button">Reporte</button></a>

<form action="Riesgoupdatedetails" method="POST">

        <label>Riesgo:   </label>
        <input type="number"  readonly="readonly" name="idriesgo" value='<s:property value="idriesgo"/>'>
        <label>Name:         </label>
        <input type="text" name="nombre" value='<s:property value="nombre"/>'>
        <label>Descripcion:  </label>
        <input type="text" name="descripcion" value=${descripcion}>
		<button name="submitType" value="UPDATE" type="submit">Update</button>

</form>
<s:if test="ctr>0">
<div class="alert alert-danger alert-dismissable">
    <button type="button" class="close" data-dismiss="alert">&times;</button>
    <span>${msg}</span>
</div>
</s:if>
<s:else>
    <div class="alert alert-success alert-dismissable">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <span>${msg}</span>
    </div>
</s:else>
</body>
</html>