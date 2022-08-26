<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="pb" items="${list}">
<li style="list-style-type: none" onclick="getPhonebook('${pb.idx}')">
<img src="https://i.gifer.com/origin/b1/b1f952e16ed826bd7a04023db9477d52_w200.gif" style="width:30px;height:30px">
<c:out value="${pb.name}"/><br>
<c:out value="${pb.hp}"/><br>
<c:out value="${pb.memo}"/><br>
</li>
</c:forEach>