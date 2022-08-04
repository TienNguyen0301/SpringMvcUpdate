<%-- 
    Document   : cart
    Created on : Aug 1, 2022, 10:01:40 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center text-info mg-top-header">GIO HANG</h1>

<c:if test="${carts == null}">
    <h4 class="text-danger">Khong co san pham nao trong gio</h4>
</c:if>
    
<c:if test="${carts != null}">
    <table class="table">
        <tr>
            <th>Ma mon an</th>
            <th>Ten mon an</th>
            <th>Don gia</th>
            <th>So luong</th>
        </tr>
        <c:forEach items="${carts}" var="c">
            <tr id="food${foodId}">
                <td>${c.foodId}</td>
                <td>${c.foodName}</td>
                <td>${c.price}</td>
                <td>
                    <div class="form-group">
                        <input type="number" 
                               value="${c.quantity}" 
                               class="form-control"
                               onblur="updateCart(this, ${c.foodId})"/>
                    </div>
                </td>
                 <td>
                    <input type="button"
                           value="Xoa" 
                           class="btn btn-danger"
                           onclick="deleteCart(${c.foodId})"/>
                </td>
            </tr>
        </c:forEach>
    </table>
    
    <div>
        <h4 class="text-info">Tong tien hoa don: <span id="amountCart">${cartStats.amount}</span> VND</h4>
    </div>
    
    <input type="button" value="Thanh toan" class="btn btn-danger"/>
    <br> <br>
</c:if>