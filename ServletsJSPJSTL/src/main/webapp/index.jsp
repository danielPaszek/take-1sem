<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>HTML form</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
</head>
<body>
<form action="hello-servlet" method="get">
    <table>
        <tr><td>Imię:</td><td><input type="text" name="name"/></td></tr>
        <tr><td>Wiek: </td><td><input type="text" name="age" size="2"/></td></tr>
        <tr><td colspan="2"><input type="submit" value="Powitaj"/></td></tr>
    </table>
</form>
</body>
</html>