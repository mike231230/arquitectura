<html>
<head>
    <meta name="generator"content="HTML Tidy for Linux/x86 (vers 11 February 2007), see www.w3.org" />
    <title>hola freemarker</title>
</head>
<body>
<div id="header">
    <h2><a href="//www.viralpatel.net"><img height="37" width="236" border="0px" src=
            "https://www.viralpatel.net/wp-content/themes/vp/images/logo.png" align=
                                            "left" /></a> FreeMarker Struts2 Hello World</h2>

</div>

<div id="content">
    <fieldset>
        <legend>addCarro</legend>
        <@s.form action="add" method="post">
            <@s.textfield label="marca" name="carro"/>
            <@s.submit value="save"/>
        </@s.form>

    </fieldset><br/>
    <table class="datatable">
        <tr>
            <th>carro</th>

        </tr>
        <#list carroList as carro>
            <tr>
                <td>${}</td> <td>${user.lastname}</td>
            </tr>
        </#list>
    </table>

</div>



</body>



</html>