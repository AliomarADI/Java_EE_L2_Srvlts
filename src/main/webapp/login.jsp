<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<center>
    <h1>Login</h1>
    <form action="login" method="post">
        <label>
            Login:<input class="form-control" type="text" name="login">
        </label></br>
        <label>
            Password:<input class="form-control" type="password" name="password">
        </label></br>
        <button type="submit" value="login">Log in</button>
    </form>
</center>
</body>
</html>
