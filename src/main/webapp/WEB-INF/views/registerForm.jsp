<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form method="post" action="/register">
    <form:errors path="user.*"/>
    <table>
        <tr>
            <td>
                <label>Full name:</label>
            </td>
            <td>
                <input type="text" name="fullName">
            </td>
        </tr>
        <tr>
            <td>
                <label>Email: </label>
            </td>
            <td>
                <input type="text" name="email">
            </td>
        </tr>
        <tr>
            <td>
                <label>Username:</label>
            </td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>
                <label>Password:</label>
            </td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
    </table>
    <button type="submit">Register</button>
</form>

<p>Common data: ${commonData}</p>

</body>
</html>
