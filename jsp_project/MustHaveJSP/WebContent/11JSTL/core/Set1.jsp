<%@ page import="java.util.Date"%>
<%@ page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 1번 -->
<html>
<head><title>JSTL - set 1</title></head>
<body>
    <!-- 변수 선언  2번 -->
    <c:set var="directVar" value="100" />    <!-- 3번 -->
    <c:set var="elVar" value="${ directVar mod 5}" /> <!-- 4번 -->
    <c:set var="expVar" value="<%= new Date() %>" /> <!-- 5번 -->
    <c:set var="betweenVar">변수값 요렇게 설정</c:set><!-- 6번 -->

    <h4>EL을 이용해 변수 출력</h4> <!-- 7번 -->
    <ul>
        <li>directVar : ${ pageScope.directVar }</li>
        <li>elVar : ${ elVar }</li>
        <li>expVar : ${ expVar }</li>
        <li>betweenVar : ${ betweenVar }</li>
    </ul>
    
    <h4>자바빈즈 생성 1 - 생성자 사용</h4>
    <c:set var="personVar1" value='<%= new Person("박문수", 50) %>'
           scope="request" /> <!-- 8번 -->
    <ul>
        <li>이름 : ${ requestScope.personVar1.name }</li> <!-- 9번 -->
        <li>나이 : ${ personVar1.age}</li>
    </ul>
 
    <h4>자바빈즈 생성 2 - target, property 사용</h4>
    <c:set var="personVar2" value="<%= new Person() %>" scope="request" /> <!-- 10번 -->
    <c:set target="${personVar2 }" property="name" value="정약용" /> <!-- 11번 -->
    <c:set target="${personVar2 }" property="age" value="60" /> <!-- 11번 -->
    <ul>
        <li>이름 : ${ personVar2.name }</li>
        <li>나이 : ${ requestScope.personVar2.age }</li>
    </ul>
</body>
</html>