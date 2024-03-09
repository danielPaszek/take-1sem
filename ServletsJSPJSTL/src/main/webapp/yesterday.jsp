<%@taglib uri="jakarta.tags.core" prefix="c"%>
<%@taglib uri="jakarta.tags.fmt" prefix="fmt"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Yesterday</title>
    <style type="text/css">
        body { background: ${bean.backgroundColor};
            color: ${bean.foregroundColor} }
    </style>
</head>
<body>
<h2>Yesterday</h2>

Yesterday,<br/>
All my troubles seemed so far away,<br/>
Now it looks as though they're here to stay,<br/>
Oh, I believe in yesterday.<br/>
<br/>
Suddenly,<br/>
I'm not half the man I used to be,<br/>
There's a shadow hanging over me,<br/>
Oh, yesterday came suddenly.<br/>
<br/>
Why she<br/>
Had to go I don't know, she wouldn't say.<br/>
I said,<br/>
Something wrong, now I long for yesterday.<br/>
<p>
    Released: <fmt:formatDate value="${releaseDate}" type="date" dateStyle="long"/>
</p>
<c:if test="${!empty members}">
    <table <c:if test="${bean.tableBorder}">border</c:if> >
        <tr><th>The Beatles</th></tr>
        <c:forEach var="member" items="${members}">
            <tr><td>${member}</td></tr>
        </c:forEach>
    </table>
</c:if>

<a href="yesterday.html">Back</a>
</body>
</html>