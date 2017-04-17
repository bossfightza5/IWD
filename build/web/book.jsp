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


                <% session.setAttribute("book_id", request.getParameter("category"));%>
                <sql:query var="result" dataSource="${dokfah}" >
                    SELECT * FROM books WHERE book_id = "${book_id}";
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
                        <div class="menuhead">
                            <h4>เล่มอื่นๆ</h4>
                        </div>
                        <div class="bookcont">
                            <div id="productitem">
                                <div id="producthumbimg">
                                    <a href=""> <img src="img/manga/Citrus2.jpg" width="130px" height="170px" /></a>
                                </div>
                                <div id="describe">
                                    <a href="">
                                        <p>Citrus2</p>
                                    </a>
                                    <p>ราคา 55 บาท</p>
                                </div>
                                <div class="label" style="text-align: center;">
                                    <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                                </div>
                            </div>
                            <div id="productitem">
                                <div id="producthumbimg">
                                    <a href=""> <img src="img/manga/Citrus3.jpg" width="130px" height="170px" /></a>
                                </div>
                                <div id="describe">
                                    <a href="">
                                        <p>Citrus3</p>
                                    </a>
                                    <p>ราคา 60 บาท</p>
                                </div>
                                <div class="label" style="text-align: center;">
                                    <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                                </div>
                            </div>
                            <div id="productitem">
                                <div id="producthumbimg">
                                    <a href=""> <img src="img/manga/Citrus4.jpg" width="130px" height="170px" /></a>
                                </div>
                                <div id="describe">
                                    <a href="">
                                        <p>Citrus4</p>
                                    </a>
                                    <p>ราคา 65 บาท</p>
                                </div>
                                <div class="label" style="text-align: center;">
                                    <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                                </div>
                            </div>                        
                        </div>
                    </div>
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
