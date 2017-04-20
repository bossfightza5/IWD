<%-- 
    Document   : book
    Created on : Apr 14, 2017, 11:43:02 AM
    Author     : Amoeba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/incart.js"></script>
        
    </head>
    <body>
        <div id="product">
            
                        <c:forEach var="row" items="${result.rows}" begin="<%= i %>" end="<%= i+19 %>" >
                            <form action="AddCartServlet" method="POST">
                            <div id="productitem">
                            <div id="producthumbimg">
                                <input type="hidden" name="id" value="${row.book_id}"/>
                                <input type="hidden" name="name" value="${row.book_name}"/>
                                <input type="hidden" name="describe" value="${row.book_describe}"/>
                                <input type="hidden" name="type" value="${row.type}"/>
                                <input type="hidden" name="price" value="${row.price}"/>
                                <input type="hidden" name="picture" value="${row.picture}"/>
                                <input type="hidden" name="weight" value="${row.weight}"/>
                                <a href="./book.jsp?category=${row.book_id}">
                                    <img src="${row.picture}" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p> ${row.book_name}</p>
                                </a>
                                <p>ราคา ${row.price} บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" onclick="incart()" />
                            </div>
                            
                        </div>
                            </form>
                    </c:forEach>
            
        </div>
    </body>
</html>
