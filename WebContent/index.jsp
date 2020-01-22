<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cool login page</title>
</head>
<body>

<form action="AuthServlet" method="post">
Välkommen!<br>
Logga in med dina uppgifter nedanför.<br>
Användarnamn:<br><input type="text" name="username" required><br>
Lösenord:<br><input type="password" name="password" required><br>

Vilken kaka är din favoritkaka:<br><input type="text" name="kaka"><br>
					 
<br><input type="submit" value="Logga in">
</form>

</body>
</html>