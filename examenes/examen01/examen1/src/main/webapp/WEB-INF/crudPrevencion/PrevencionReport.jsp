<%--
  Created by IntelliJ IDEA.
  User: migue
  Date: 09/02/2020
  Time: 09:29 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    <title>PrevencionReport</title>



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

<h2>Reporte prevencion</h2>
<a href="PrevencionRegister"><button class="btn btn-success" type="button">Registro</button></a>

<div class="container">

    <s:if test="noData==true">
       <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th>nombre</th>
                <th>descripcion</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="Prevencionlist">
                <tr>

                    <td>${nombre}</td>
                    <td>${descripcion}</td>
                    <td>
                        <a href="Prevencionupdatedetails?nombre=${nombre} &descripcion${descripcion}&idPrevencion=${idPrevencion}">
                            <button class="btn btn-primary">Update</button>
                        </a>
                        <a href="Prevenciondeleterecord?idprevencion=${idprevencion}">
                            <button class="btn btn-danger">Delete</button>
                        </a>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
       </div>
    </s:if>
    <s:else>
        <div style="color: red;">No Data Found.</div>
    </s:else>

</div>
</body>
</html>