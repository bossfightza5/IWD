<%-- 
    Document   : manga.jsp
    Created on : Apr 12, 2017, 8:18:06 PM
    Author     : Amoeba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dokfah</title>
    </head>
    <body>
        <div class="container">
            <%@include file="structure.jsp" %>
            <div class="r_cont">
                
                <sql:query var="result" dataSource="${dokfah}">
                        SELECT * FROM books ORDER BY update_date DESC;
                    </sql:query>
                        <c:choose >
                            <c:when test="${param.page.matches('[0-9]+')}">
                       <% int i = (Integer.parseInt(request.getParameter("page"))-1)*10; %>
                       <h3>การ์ตูน</h3>
                        <div id="product">
                        <c:forEach var="row" items="${result.rows}" begin="<%= i %>" end="<%= i+9 %>" >    
                        
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="">
                                    <img src="${row.picture}" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p> ${row.book_name} ${row.number}</p>
                                </a>
                                <p>ราคา ${row.price} บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </c:forEach>
                    </div>
                       </c:when>
                        <c:otherwise>
                            <script>location="./manga.jsp?page=1";</script>
                        </c:otherwise>
                        </c:choose>
            </div>
        </div>
    </body>
</html>
