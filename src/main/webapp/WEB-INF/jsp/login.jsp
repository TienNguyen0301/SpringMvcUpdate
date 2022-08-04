<%-- 
    Document   : login
    Created on : Jul 26, 2022, 9:26:00 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/login" var ="action" />
<h1 class="text-center text-danger title-login">DANG NHAP</h1>

<c:if test="${param.error != null}">
    <div class="alert alert-danger">
        Da co loi xay ra!!! Vui long quay lai sau!
    </div>
</c:if>

<form method="post" action="${action}" class="form-login container">
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" class="form-control"/>
    </div>
      <div class="form-group btn-login">
          <input class="btn btn-danger" type="submit" value="Dang nhap"/>
    </div>
</form>
