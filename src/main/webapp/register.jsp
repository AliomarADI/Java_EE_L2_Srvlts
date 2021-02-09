<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register page</title>
</head>
<body>
<center>
    <h1>Register</h1>
    <form action="register" method="get">
        <label>
            Name:<input class="form-control" name="name" type="text">
        </label><br><br>

        <label>
            Login:<input class="form-control" name="login" type="text">
        </label><br><br>

        <label>
            Password:<input class="form-control" name="pass" type="password" >
        </label><br><br>

        <label>
            Password_2:<input class="form-control" name="repass" type="password">
        </label><br><br>

        <a href="login.jsp" class="btn btn-primary"><button>Submit</button></a>
    </form>
</center>
</body>
</html>
