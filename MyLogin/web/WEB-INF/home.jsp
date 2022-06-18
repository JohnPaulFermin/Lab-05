
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${username}.</h2>
                <form method="get" action="average">
                   
                    <input type="hidden" name="operation" value="reset">
        </form>
    </body>
</html>

