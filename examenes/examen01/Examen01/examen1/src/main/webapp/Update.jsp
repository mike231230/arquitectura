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
</head>
<body>
<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h2>
<form action=updatedetails method="post">
		<pre>
<b>Name:         </b><input type="text" name="nombre" value='<s:property value="nombre"/>'>


<b>iddelegacion:        </b><input type="id"  name="iddelegacion" value='<s:property value="iddelegacion"/>'>
		            <input type="hidden" name="idhidden" value='<s:property value="iddelegacion"/>'>


		<button name="submitType" value="update" type="submit">Update</button>
		</pre>
</form>
<s:if test="ctr>0">
    <span style="color: red;"><s:property value="msg" /></span>
</s:if>
<s:else>
    <span style="color: red;"><s:property value="msg" /></span>
</s:else>
</body>
</html>