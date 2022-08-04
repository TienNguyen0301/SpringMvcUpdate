<%-- 
    Document   : food-detail
    Created on : Jul 23, 2022, 11:44:46 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center text-info mg-top-header">CHI TIET MON AN</h1>
<div class="row center">
    <div class="col-md-4 col-xs-6">
        <img src="${food.image}" class="img-fluid" />
    </div>
    <div class="col-md-8 col-xs-6">
        <h1>${food.name}</h1>
        <h3>${food.price} VND</h3>
        <div>
            <input type="button" value="Them vao gio" class="btn btn-danger" />
        </div>
    </div>
</div>
<form class="form-comment">
    <div >
        <div class="form-group">
            <textarea class="form-control" id="content" 
                      placeholder="Nhap noi dung binh luan"></textarea>
        </div>
        <div class="btn-submit">
            <input type="submit" 
                   onclick="addComment(${p.id})"
                   value="Them binh luan" 
                   class="btn btn-info" />
        </div>
    </div>
</form>

<div class="row center" style="padding-bottom: 15px">
        <div class="col-md-1">
            <img class="rounded-circle img-fluid" src="<c:url value="https://res.cloudinary.com/n-h-t/image/upload/v1658302147/mon2_bzl1eh.png" />" alt="image"/>
        </div>
        <div class="col-md-11">
            <p>Tuyet voi!!!</p>
            <i>26/07/2022 19:54</i>
        </div>
</div>                   

<div class="row center">
        <div class="col-md-1">
            <img class="rounded-circle img-fluid" src="<c:url value="https://res.cloudinary.com/n-h-t/image/upload/v1658302147/mon2_bzl1eh.png" />" alt="image"/>
        </div>
        <div class="col-md-11">
            <p>Qua te!!!</p>
            <i>26/07/2022 19:55</i>
        </div>
</div>   