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
    <title>Report</title>
    <style>
        table, td, th {border: 1px solid black;}
        table {border-collapse: collapse;width: 60%;}
        th {height: 30px;}
        .button-update {background-color: #008CBA;color: white;}
        .button-delete {background-color: red;color: white;}
    </style>
</head>
<body>
<h2>READ</h2>
<div style="margin-top: 40px;">
    <s:if test="noData==true">
        <table>
            <thead>
            <tr style="background-color: #E0E0E1;">
                <th>Sr.No.</th>
                <th>nombre/th>
                <th>Action</th>
            </tr>
            </thead>
            <s:iterator value="beanList">
                <tr>
                    <td><s:property value="SrNO" /></td>
                    <td><s:property value="nombre" /></td>
                    <td>
                        <a href="updatedetails.action?submitType=updatedata&uemail=<s:property value="SrNO"/>">
                            <button class="button-update">Update</button>
                        </a>
                        <a href="deleterecord.action?uemail=<s:property value="SrNO"/>">
                            <button class="button-delete">Delete</button>
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
</body>
</html>