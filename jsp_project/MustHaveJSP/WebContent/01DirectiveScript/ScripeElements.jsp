<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! public int add(int num1, int num2){
	 return num1 + num2;
}
	 %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
</head>
<body>
<%
  int result = add(10,20);
%>

덧샘 결과 : <%= result %><br />
덧샘 결과 : <%= add(30,40) %>
</body>
</html>