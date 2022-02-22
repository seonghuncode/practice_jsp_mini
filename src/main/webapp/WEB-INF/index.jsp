<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> ${result} 단</h1>
	
	<p>
		 <%
		 int number = (int)request.getAttribute("result");//사용자가 입력한 값을 받아와 int로 형변환
		 
		 for(int i = 1; i <=9; i++){%>
		 <p><%= number%> * <%= i%> = <%= number * i%></p>
		 <% }%>
	</p>
	
</body>
</html>