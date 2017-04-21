<%-- 
    Document   : main
    Created on : Apr 8, 2017, 10:14:33 PM
    Author     : Amoeba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet" type="text/css" />
        <script src="js/searchbox.js"></script>
        <sql:setDataSource var="dokfah" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql:///dokfah" user="root" password="9999" />
    </head>
    <body>

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
                    <li><a href="how_to_buy.jsp
                           ">วิธีการสั่งซื้อ<span></span></a></li>
                    <li><a href="product.jsp">สินค้าทั้งหมด</a></li>
                    <li><a href="register.jsp">สมัครสมาชิก</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <div style="float: right; cursor: pointer;">
                            <span class="glyphicon glyphicon-shopping-cart my-cart-icon"><span class="badge badge-notify my-cart-badge"></span></span>
                        </div>
                    </li>
                    <li><a href="confirm_transaction.jsp
                           ">แจ้งโอนเงิน</a></li>
                    <li><a href="contact.jsp
                           ">ติดต่อ</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
            <!-- /.container-fluid -->
        </nav>
        <div class="l_cont">
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
                                    <a href="register.jsp">สมัครสมาชิก</a> | <a hisf="forgot_pwdjsp">ลืมรหัสผ่าน</a>
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
                                    welcome <% out.println(session.getAttribute("username"));%>
                                </p>
                            </ul>
                            <ul>
                                <img src="img/icon/user.png" height="17" width="17"><a href="profile.jsp
                                                                                       ">ข้อมูลสมาชิก</a>
                            </ul>
                            <ul>
                                <img src="img/icon/cart.png" height="17" width="17"><a href="cart.jsp
                                                                                       ">ตะกร้าสินค้า</a>
                            </ul>
                            <ul>
                                <img src="img/icon/bill.png" height="17" width="17"><a href="history.jsp
                                                                                       ">ประวัติการสั่งซื้อ</a>
                            </ul>
                            <ul>
                                <img src="img/icon/pay.png" height="17" width="17"><a href="report_transter.jsp
                                                                                      ">แจ้งโอนเงิน</a>
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
                <form action="search" method="POST">
                    <div class="menucontent">
                        <div class="label">
                            <select id="type" name="type" onchange="tagtype()" >
                                <option value="">เลือกประเภทหนังสือ</option>
                                <option value="manga">การ์ตูน</option>
                                <option value="novel">นิยาย</option>
                                <option value="magazine">นิตยสาร</option>
                                <option value="etc.">อื่นๆ</option>
                            </select>
                        </div>
                        <div id="publisher" class="label">

                        </div>

                        <div id="tag" class="label">


                        </div>
                        <div class="label" style="text-align: center;">
                            <input type="submit" name="search" value="Search" class="button" style=" margin-right: 10px" />
                        </div>
                    </div>
                </form>
                <div class="menubottom">
                </div>
            </div>
        </div>
        <%--- <c:choose>
             <c:when >
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
                     <a href="etc.jsp
">
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
         </c:choose>
     </div> ---%>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script type='text/javascript' src="js/jquery.mycart.js"></script>
        <script type="text/javascript">
            $(function () {

                var goToCartIcon = function ($addTocartBtn) {
                    var $cartIcon = $(".my-cart-icon");
                    var $image = $('<img width="30px" height="30px" src="' + $addTocartBtn.data("image") + '"/>').css({"position": "fixed", "z-index": "999"});
                    $addTocartBtn.prepend($image);
                    var position = $cartIcon.position();
                    $image.animate({
                        top: position.top,
                        left: position.left
                    }, 500, "linear", function () {
                        $image.remove();
                    });
                }

                $('.my-cart-btn').myCart({
                    currencySymbol: '$',
                    classCartIcon: 'my-cart-icon',
                    classCartBadge: 'my-cart-badge',
                    classProductQuantity: 'my-product-quantity',
                    classProductRemove: 'my-product-remove',
                    classCheckoutCart: 'my-cart-checkout',
                    affixCartIcon: true,
                    showCheckoutModal: true,
                    cartItems: [
                        {id: 1, name: 'product 1', summary: 'summary 1', price: 10, quantity: 1, image: 'images/img_1.png'},
                        {id: 2, name: 'product 2', summary: 'summary 2', price: 20, quantity: 2, image: 'images/img_2.png'},
                        {id: 3, name: 'product 3', summary: 'summary 3', price: 30, quantity: 1, image: 'images/img_3.png'}
                    ],
                    clickOnAddToCart: function ($addTocart) {
                        goToCartIcon($addTocart);
                    },
                    afterAddOnCart: function (products, totalPrice, totalQuantity) {
                        console.log("afterAddOnCart", products, totalPrice, totalQuantity);
                    },
                    clickOnCartIcon: function ($cartIcon, products, totalPrice, totalQuantity) {
                        console.log("cart icon clicked", $cartIcon, products, totalPrice, totalQuantity);
                    },
                    checkoutCart: function (products, totalPrice, totalQuantity) {
                        var checkoutString = "Total Price: " + totalPrice + "\nTotal Quantity: " + totalQuantity;
                        checkoutString += "\n\n id \t name \t summary \t price \t quantity \t image path";
                        $.each(products, function () {
                            checkoutString += ("\n " + this.id + " \t " + this.name + " \t " + this.summary + " \t " + this.price + " \t " + this.quantity + " \t " + this.image);
                        });
                        alert(checkoutString)
                        console.log("checking out", products, totalPrice, totalQuantity);
                    },
                    getDiscountPrice: function (products, totalPrice, totalQuantity) {
                        console.log("calculating discount", products, totalPrice, totalQuantity);
                        return totalPrice * 0.5;
                    }
                });

            });
        </script>
    </body>
</html>
