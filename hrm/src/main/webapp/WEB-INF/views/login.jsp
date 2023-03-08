<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <body>
        <form action="login" method="post" name="loginForm">
            User Name: <input type="text" name="userName">
            Password: <input type="password" name="password">
            <input type="submit" value="Login">
        </form>
    </body>

</html>