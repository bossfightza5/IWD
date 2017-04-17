<%-- 
    Document   : main
    Created on : Apr 8, 2017, 10:14:33 PM
    Author     : Amoeba
--%>

<%@page import="javax.management.Query"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dokfah</title>
        
    </head>
    <body>
        <div class="container">
        <%@include file="structure.jsp" %>
            <div id="r_cont">
                <a id="linkcategory" href="manga.jsp?page=1">การ์ตูน</a>               
                
                    <sql:query var="result" dataSource="${dokfah}">
                        SELECT * FROM books WHERE type="manga" ORDER BY update_date DESC;
                    </sql:query>
                        
                        <div id="product">
                    <c:forEach var="row" items="${result.rows}" begin="0" end="4" >    
                        
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <img src="${row.picture}" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p> ${row.book_name} ${row.number}</p>
                                </a>
                                <p>ราคา ${row.price} บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </c:forEach>
                        <a href="manga.jsp?page=1" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div><br>
                    <a id="linkcategory" href="novel.jsp?page=1">นิยาย</a>
                    
                    <sql:query var="result" dataSource="${dokfah}">
                        SELECT * FROM books WHERE type="novel" ORDER BY update_date DESC;
                    </sql:query>
                        
                        <div id="product">
                    <c:forEach var="row" items="${result.rows}" begin="0" end="4" >    
                        
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <img src="${row.picture}" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p> ${row.book_name} ${row.number}</p>
                                </a>
                                <p>ราคา ${row.price} บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </c:forEach>
                        <a href="novel.jsp?page=1" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div><br>
                     <a id="linkcategory" href="magazine.jsp">นิตยสาร</a>   
                    
                    <sql:query var="result" dataSource="${dokfah}">
                        SELECT * FROM books WHERE type="magazine" ORDER BY update_date DESC;
                    </sql:query>
                        
                        <div id="product">
                    <c:forEach var="row" items="${result.rows}" begin="0" end="4" >    
                        
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <img src="${row.picture}" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p> ${row.book_name} ${row.number}</p>
                                </a>
                                <p>ราคา ${row.price} บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </c:forEach>
                        <a href="magazine.jsp" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div><br>
                    <a id="linkcategory" href="etc.jsp">อื่นๆ</a>
                    <div id="product">
                    
                    <sql:query var="result" dataSource="${dokfah}">
                        SELECT * FROM books WHERE type="magazine" ORDER BY update_date DESC;
                    </sql:query>
                        
                        <div id="product">
                    <c:forEach var="row" items="${result.rows}" begin="0" end="4" >    
                        
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <img src="${row.picture}" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p> ${row.book_name} ${row.number}</p>
                                </a>
                                <p>ราคา ${row.price} บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </c:forEach>
                        <a href="etc.jsp" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div><br>
                   <%--- <c:choose>
                        <c:when >
                    <label style="font-size: 30px; color: rgb(100, 100, 100);">แนะนำสำหรับคุณ</label>
                    <div id="product">
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <img src="img/novel/konosuba1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p>ขอให้โชคดีมีชัยในโลกแฟนตาซี1</p>
                                </a>
                                <p>ราคา 120 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}"> <img src="img/novel/B.A.D.1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p>B.A.D.1</p>
                                </a>
                                <p>ราคา 100 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}"> <img src="img/novel/goldentime2.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p>Golden Time2</p>
                                </a>
                                <p>ราคา 90 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <img src="img/manga/Citrus4.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p>Citrus4</p>
                                </a>
                                <p>ราคา 55 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="etc.jsp">
                                    <img src="img/etc/minna no nihongo1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="./book.jsp?category=${row.book_id}">
                                    <p>มินนะ โนะ นิฮงโกะ1</p>
                                </a>
                                <p>ราคา 237 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </div>
                    </c:choose>
                </div> ---%>
            </div>
                    </div>
        </div>
            <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
            <!-- Include all compiled plugins (below), or include individual files as needed -->
            <script src="js/bootstrap.min.js"></script>
    </body>
</html>
