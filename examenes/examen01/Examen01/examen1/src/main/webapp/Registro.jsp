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
    <title>Register</title>
    <style type="text/css">
        .button-register {background-color: green;color: white;}
        .button-report {background-color: #000000;color: white;margin-left: 30%;}
    </style>
</head>
<body>
<h2>create</h2>
<a href="Report"><button class="button-report" type="button">Report</button></a>
<s:form action="register.action" method="post">
    <s:textfield label="delegacion" name="iddelegacion" />
    <s:textfield label="Nombre" name="nombre" /> />
    <s:submit cssClass="button-register" value="Resgister" />
</s:form>
<s:if test="ctr>0">
    <span style="color: green;"><s:property value="msg" /></span>
</s:if>
<s:else>
    <span style="color: red;"><s:property value="msg" /></span>
</s:else>
</body>
</html>
