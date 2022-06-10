<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--
<c:if test="${empty user}">
<meta http-equiv="Refresh" content="0;URL=index.jsp">
</c:if>
-->
<title>MyPage</title>
<link href="css/commons.css" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
  <div id="app">

    <div class="header">
      <h1 class="site_logo"><a href="timeline">FreeSpace</a></h1>
      <div class="user">
      	<c:if test="${not empty user}">
      		<p class="user_name">${user.name}</p>
    	</c:if>
        
        <form:form class="logout_form" modelAttribute="login" action="logout">
          <form:button class="logout_btn" type="submit">
            <img src="images/ドアアイコン.png">ログアウト</form:button>
        </form:form>
      </div>
    </div>

    <hr>
  </div>
</body>
</html>