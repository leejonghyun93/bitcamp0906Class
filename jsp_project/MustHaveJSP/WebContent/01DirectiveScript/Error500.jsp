<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>errorPage, isErrorPage 속성</title>
</head>
<body>
	<%
		int myAge = Integer.parseInt(request.getParameter("age")) + 10;
        out.println("10년 후 당신의 나이는 " + myAge + "입니다.");
	%>
</body>
</html>