<%@page contentType="text/html"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    <title>Bienvenido</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <a class="navbar-brand" href="loginAction">Home</a>
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
        <li class="nav-item">
            <a class="nav-link" href="/prevencion/">Prevencion</a>
        </li>
    </ul>
</nav>

<center>
    <h1>Bienvenido <i>${user}!!!${admin }</i></h1>
</center>
</body>
</html>