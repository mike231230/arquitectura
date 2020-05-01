<%--
  Created by IntelliJ IDEA.
  User: migue
  Date: 16/02/2020
  Time: 03:01 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Zona Report</title>
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
        <li class="nav-item active">
            <a class="nav-link" href="/zona/">Zona</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/riesgo/">Riesgo</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/prevencion/">Prevencion</a>
        </li>
    </ul>
</nav>
    <div class="jumbotron">
    <h2>Reporte de zonas</h2>
    <a href="zonaregistro"><button class ="btn btn-success" type="button">Registrar</button></a>
    <div style="margin-top: 40px;">
        <s:if test="noData==true">
            <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>Action</th>
                </tr>
                </thead>
                <s:iterator value="beanlist">
                    <tr>
                        <td>${idzona}</td>
                        <td>${nombre} </td>
                        <td>
                            <a href="zonaupdate?nombre=${nombre}& idzona=${idzona}">
                               <button class="btn btn-primary">Actualizar</button>
                        </a>
                            <a href="zonaDelete?idzona=${idzona}">
                                <button class="btn btn-danger">Borrar</button>
                        </a>
                     </td>
                    </tr>
                </s:iterator>
            </table>
        </s:if>
        <s:else>
            <div style="color: red;">No Data Found.</div>
        </s:else>
    </div>
    </div>
</body>
</html>
