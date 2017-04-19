<%-- 
    Document   : book
    Created on : Apr 17, 2017, 12:11:18 AM
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
                <sql:query var="result" dataSource="${dokfah}" >
                    SELECT * FROM books WHERE book_id = '<%= request.getParameter("category")%>';
                </sql:query>
                <c:choose>
                    <c:when test="${result.getRowCount()!=0}">
                        <c:forEach var="books" items="${result.rows}">
                            <div class="book_header">
                                <h1>${books.book_name}</h1>
                            </div>
                            <div class="bookcont">
                                <div class="bookpicture">
                                    <img src="${books.picture}" width="300px" height="400px" />
                                </div>          
                                <div class="aboutbook">
                                    <label>
                                        ${books.book_describe}
                                    </label>
                                </div>
                                <div class="bookdetail">
                                    <table class="detail_table">
                                        <div class="menuhead"><h3><strong>รายละเอียดหนังสือ</strong></h3></div>
                                        <tbody>
                                            <tr>
                                                <td class=left>ชื่อผู้แต่ง</td>
                                                <td>: ซาบูโรยูตะ</td>
                                            </tr>
                                            <tr>
                                                <td class=left>แนว</td>
                                                <td>: ยูริ, ดราม่า</td>
                                            </tr>
                                            <tr>
                                                <td class="left">ราคา</td>
                                                <td>: ${books.price} บาท</td>
                                            </tr>
                                            <tr>
                                                <td class="left">น้ำหนัก</td>
                                                <td>: ${books.weight}0 กรัม</td>
                                            </tr>
                                            <tr>
                                                <td class="left">สำนักพิมพ์</td>
                                                <td>: เซนชู</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div style="width:750px; overflow: hidden; padding-top:10px; text-align: left;">
                                    <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                                </div>
                            </c:forEach>
                            <div id="product">
                                <sql:query var="result" dataSource="dokfah">
                                    SELECT * FROM books WHERE book_id LIKE '<%= request.getParameter("category").substring(0, 5)%>%' AND book_id != <%= request.getParameter("category")%> ORDER BY book_id ASC;
                                </sql:query>
                                <c:if test="${result.getRowCount()!=0}">
                                    <div class="menuhead">
                                        <h4>เล่มอื่นๆ</h4>
                                    </div>
                                    <div class="bookcont">
                                        <c:forEach var="row" items="${result.rows}">
                                            <div id="productitem">
                                                <div id="producthumbimg">
                                                    <a href="./book.jsp?category=${row.book_id}"> <img src="${row.picture}" width="130px" height="170px" /></a>
                                                </div>
                                                <div id="describe">
                                                    <a href="./book.jsp?category=${row.book_id}">
                                                        <p>${row.book_name}</p>
                                                    </a>
                                                    <p>ราคา ${row.price} บาท</p>
                                                </div>
                                                <div class="label" style="text-align: center;">
                                                    <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>                     
                                </div>
                            </c:if>
                        </div>
                    </c:when>
                    <c:otherwise>
                        ไม่พบหน้าที่คุณเลือก
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </body>
</html>
