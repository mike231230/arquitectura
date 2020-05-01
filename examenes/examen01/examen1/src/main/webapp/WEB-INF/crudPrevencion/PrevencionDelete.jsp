<%--
  Created by IntelliJ IDEA.
  User: migue
  Date: 09/02/2020
  Time: 09:27 p. m.
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Delete</title>
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
<h2>delete</h2>
<span>${msg}</span><br><br>
<a href="PrevencionReport">
    <button type="button">Report</button>
</a>
</body>
</html>