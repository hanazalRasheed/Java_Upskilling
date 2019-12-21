<% if (session.getAttribute("currentUser") == null) { 
	response.sendRedirect("login.jsp");
} %>

<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); %>