<%@page import="edu.htu.upskilling.web.models.User"%>
<%@page import="edu.htu.upskilling.web.models.UsersDao"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String userName=request.getParameter("username");
String message="";
String action=request.getParameter("action");
if(action!=null && action.equals("logout")){
	session.invalidate();
}else if(userName!=null){
	String password=request.getParameter("password");
	UsersDao dao=new UsersDao();
	User user=dao.find(userName);
	if(user==null){
		message="Invalid username or password (87653)";
	}else if(!user.getPassword().equals(password)){
		message="Invalid username or password (77650)";
	}else{
		session.setAttribute("currentUser", userName);
		response.sendRedirect("home.jsp");
	}
}


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
input {
	display: block;
	width: 90%; 
	margin: 2px; 
}
.error-message{
color: red;
text-align: center;
}
</style>
</head>
<body>
	Login
	<div class="error-message">
		<%=message %>
	</div>
	<form method="post">
		<fieldset style="width: 300px; margin: auto;">
			<legend>Users Information</legend>
			<label>Username</label>
			<input type="text" name="username">
			<label>Password</label>
			<input type="password" name="password">
			<input type="submit" value="login">
		</fieldset>
	</form>
</body>
</html>