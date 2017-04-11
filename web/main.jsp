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
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="main.css" rel="stylesheet" type="text/css" />
        <title>main</title>
    </head>
    <body>

        <div class="container">
            <div id="header">
                <img src="img/brand.png" height=110 width="100%">
            </div>
            <nav class="navbar navbar-default">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="main.jsp">หน้าหลัก</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="how_to_buy.html">วิธีการสั่งซื้อ<span></span></a></li>
                        <li><a href="product.html">สินค้าทั้งหมด</a></li>
                        <li><a href="register.jsp">สมัครสมาชิก</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="confirm_transaction.html">แจ้งโอนเงิน</a></li>
                        <li><a href="contact.html">ติดต่อ</a></li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
                <!-- /.container-fluid -->
            </nav>
            <div id="l_cont">
                <c:choose>
                    <c:when test="${sessionScope.username==null}">
                <form action="LoginServlet" method="POST">
                    <div class="menubox">
                        <div class="menuhead">
                            <h3>เข้าสู่ระบบ</h3>
                        </div>
                        <div class="menucontent">
                            <div class="label">
                                <label style="float: left;">username : </label>
                                <input type="text" name="username" class="textinput" />
                            </div>
                            <div class="label">
                                <label style="float: left;">password : </label>
                                <input type="password" name="password" class="textinput" />
                            </div>
                            <div class="label" style="text-align: center; margin-right:10px">
                                <input type="submit" class="button" value="Login" />
                            </div>
                            <div class="label" style="text-align: center; margin-right:10px">
                                <a href="register.jsp">สมัครสมาชิก</a> | <a hisf="forgot_pwd.html">ลืมรหัสผ่าน</a>
                            </div>
                        </div>
                        <div class="menubottom">
                        </div>
                    </div>
                </form>
                    </c:when>
                    <c:otherwise>
                        <div class="menubox">
                <div class="menuhead">
                    <h3>เข้าสู่ระบบ</h3>
                </div>
                <div class="menucontent">
                    <ul>
                        <p>
                            welcome <% out.println(session.getAttribute("username")); %>
                        </p>
                    </ul>
                    <ul>
                        <img src="img/icon/user.png" height="17" width="17"><a href="profile.html">ข้อมูลสมาชิก</a>
                    </ul>
                    <ul>
                        <img src="img/icon/cart.png" height="17" width="17"><a href="cart.html">ตะกร้าสินค้า</a>
                    </ul>
                    <ul>
                        <img src="img/icon/bill.png" height="17" width="17"><a href="history.html">ประวัติการสั่งซื้อ</a>
                    </ul>
                    <ul>
                        <img src="img/icon/pay.png" height="17" width="17"><a href="report_transter.html">แจ้งโอนเงิน</a>
                    </ul>
                    <ul>
                        <a href="logout">ออกจากระบบ</a>
                    </ul>
                </div>
                <div class="menubottom">
                </div>
            </div>
                    </c:otherwise>
                </c:choose>
                <div class="menubox">
                    <div class="menuhead">
                        <h3>ค้นหาหนังสือ</h3>
                    </div>
                    <div class="menucontent">
                        <div class="label">
                            <select name="category">
                                <option value="">เลือกประเภทหนังสือ</option>
                                <option value="manga">การ์ตูน</option>
                                <option value="novel">นิยาย</option>
                                <option value="magazine">นิตยสาร</option>
                                <option value="knowledge">ความรู้</option>
                            </select>
                        </div>
                        <div class="label">
                            <select name="publisher">
                                <option value="">เลือกสำนักพิมพ์</option>
                                <option value="siam">สยามอินเตอร์คอมิค</option>
                                <option value="luck">ลัคพิมพ์</option>
                                <option value="bongkoch">บงกช</option>
                                <option value="zenshu">เซนชู</option>
                                <option value="vibul">วิบูลย์กิจ</option>
                            </select>
                        </div>
                        <div class="label">
                            <label style="float: left;font-size:15px;color:black;">ความรู้</label>
                            <br>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> เทคโนโลยี </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> วิทยาศาสตร์ </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> ศิลปะ </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> ภาษา </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> คณิตศาตร์ </input>
                            <br>
                            <br>
                            <label style="float: left;font-size:15px;color:black;">นิยายและการ์ตูน</label>
                            <br>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> คอเมดี้ </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> ดราม่า </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> โรแมนติค </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> เลิฟ-คอเมดี้ </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> เแอคชั่น </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> แฟนตาซี </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> สืบสวนสอบสวน </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> สยอง </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> น่ากลัว </input>
                            <br>
                            <br>
                            <label style="float: left;font-size:15px;color:black;">นิตยสาร</label>
                            <br>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> ทำอาหาร </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> แฟชั่น </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> บ้านและเฟอร์นิเจอร์ </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> วัยรุ่น </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> พระเครื่อง </input>
                            <br>
                            <input type="checkbox" name="genre" value="IT"> การ์ตูน </input>
                            <br>
                            <br>
                            <input type="text" name="searchinput" style="width:160px; text-align: center; height:25px;border-radius: 3px" />
                            <br>
                            <br>
                        </div>
                        <div class="label" style="text-align: center;">
                            <input type="submit" name="search" value="Search" class="button" style=" margin-right: 10px" />
                        </div>
                    </div>
                    <div class="menubottom">
                    </div>
                </div>
            </div>
            <div id="r_cont">
                <a id="linkcategory" href="manga.jsp">การ์ตูน</a>
                
                
                <sql:setDataSource var="dokfah" driver="com.mysql.jdbc.Driver"
                       url="jdbc:mysql:///dokfah" user="root" password="9999" />
                
                <div id="product">
                    <sql:query var="result" dataSource="${dokfah}">
                        SELECT * FROM books WHERE type='Manga';
                    </sql:query>
                    <sql:query var="result2" dataSource="${dokfah}">
                        SELECT * FROM each_book WHERE book_id IN (SELECT book_id FROM books WHERE type="manga");
                    </sql:query>
                        
                        <div id="product">
                    <c:forEach var="row" items="${result2.rows}" begin="0" end="4" >    
                        
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="">
                                    <img src="${row.picture}" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>  ${row.number}</p>
                                </a>
                                <p>ราคา ${row.price} บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </c:forEach>
                        <a href="manga.jsp" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div><br>
                    <a id="linkcategory" href="novel.html">นิยาย</a>
                    <div id="product">
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="">
                                    <img src="img/novel/konosuba1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
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
                                <a href=""> <img src="img/novel/B.A.D.1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
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
                                <a href=""> <img src="img/novel/goldentime2.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
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
                                <a href=""> <img src="img/novel/hidan no aria1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>อาเรียกระสุนแดงเดือด1</p>
                                </a>
                                <p>ราคา 75 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/novel/zero no tsukaima13.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>อสูรรับใช้ของยัย0สนิท</p>
                                </a>
                                <p>ราคา 95 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <a href="novel.html" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div><br>
                    <a id="linkcategory" href="magazine.html">นิตยสาร</a>
                    <div id="product">
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="">
                                    <img src="img/magazine/aday198.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>a day ฉบับที่ 198</p>
                                </a>
                                <p>ราคา 120 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/magazine/hamburger75.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>HAMBURGER ฉบับที่ 75</p>
                                </a>
                                <p>ราคา 75 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/magazine/praew899.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>แพรว ฉบับที่ 899</p>
                                </a>
                                <p>ราคา 75 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/magazine/tv magazine.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>ทีวีแมกกาซีน ฉบับที่ 297</p>
                                </a>
                                <p>ราคา 60 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/magazine/zenshu106.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>zenshu ฉบับที่ 106</p>
                                </a>
                                <p>ราคา 60 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <a href="magazine.html" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div><br>
                    <a id="linkcategory" href="knowledge.html">ความรู้</a>
                    <div id="product">
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="knowledge.html">
                                    <img src="img/knowledge/minna no nihongo1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>มินนะ โนะ นิฮงโกะ1</p>
                                </a>
                                <p>ราคา 237 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/knowledge/html5.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>คู่มือสร้างเว็บไซด์ด้วย HTML 5 CSS 3 & JavaScript ฉบับสมบูรณ์</p>
                                </a>
                                <p>ราคา 246 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/knowledge/gatpat.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>รู้ทัน gat/pat</p>
                                </a>
                                <p>ราคา 124 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/knowledge/drawing&sketching basic.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>drawing&sketching ฉบับปูพื้นฐาน</p>
                                </a>
                                <p>ราคา 256 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href=""> <img src="img/knowledge/drawing&sketching moe.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>drawing&sketching ฉบับวาดสาวน้อยโมเอะ</p>
                                </a>
                                <p>ราคา 256 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                        <a href="knowledge.html" style="font-size: 10.5px; float:left;">ดูทั้งหมด</a>
                    </div>
                    <br>
                    <label style="font-size: 30px; color: rgb(100, 100, 100);">แนะนำสำหรับคุณ</label>
                    <div id="product">
                        <div id="productitem">
                            <div id="producthumbimg">
                                <a href="">
                                    <img src="img/novel/konosuba1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
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
                                <a href=""> <img src="img/novel/B.A.D.1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
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
                                <a href=""> <img src="img/novel/goldentime2.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
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
                                <a href="">
                                    <img src="img/manga/Citrus4.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
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
                                <a href="knowledge.html">
                                    <img src="img/knowledge/minna no nihongo1.jpg" width="130px" height="170px" /></a>
                            </div>
                            <div id="describe">
                                <a href="">
                                    <p>มินนะ โนะ นิฮงโกะ1</p>
                                </a>
                                <p>ราคา 237 บาท</p>
                            </div>
                            <div class="label" style="text-align: center;">
                                <input type="submit" class="incart" value="หยิบใส่ตะกร้า" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
            <!-- Include all compiled plugins (below), or include individual files as needed -->
            <script src="js/bootstrap.min.js"></script>
    </body>
</html>
