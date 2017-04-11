<%-- 
    Document   : register
    Created on : Apr 10, 2017, 12:09:34 PM
    Author     : Amoeba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="main.css" rel="stylesheet" type="text/css" />
        <title>Register</title>
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
                    <li><a href="register.html">สมัครสมาชิก</a></li>
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
                        <a href="register.html">สมัครสมาชิก</a> | <a href="forgot_pwd.html">ลืมรหัสผ่าน</a>
                    </div>
                </div>
                <div class="menubottom">
                </div>
            </div>
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
            <script type="text/javascript" src="js/register.js"></script>
            <form action="RegisterServlet" method="POST" name="register" onsubmit="return(regvalidate())">
                <fieldset>
            <div class="regis">
                <label class="labelreg">
                    username :
                </label>
                <input pattern="^[a-zA-Z0-9]{6,50}$" type="text" class="textreg" placeholder="Username" name="username" id="username"/>
                <div class="regnote">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    password :
                </label>
                <input pattern="^[a-zA-Z0-9]{6,50}$" type="password" class="textreg" placeholder="Password" name="password" id="password" />
                <div class="regnote">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    confirm password :
                </label>
                <input pattern="^[a-zA-Z0-9]{6,50}$" title="" type="password" class="textreg" placeholder="Password" name="confirm" id="confirm" />
                <div class="regnote">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    E-MAIL :
                </label>
                <input type="email" class="textreg" placeholder="E-mail" name="email" id="email" />
                <div class="regnote">Example : example@example.com</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    First Name :
                </label>
                <input type="text" class="textreg" placeholder="First Name" name="fname" />
            </div>
            <div class="regis">
                <label class="labelreg">
                    Last Name :
                </label>
                <input type="text" class="textreg" placeholder="First Name" name="lname" />
            </div>
            <div class="regis">
                <label class="labelreg">
                    Province :
                </label>
                <select name="province" class="textreg">
                    <option value="" selected>--------- เลือกจังหวัด ---------</option>
                    <option value="กรุงเทพมหานคร">กรุงเทพมหานคร</option>
                    <option value="กระบี่">กระบี่ </option>
                    <option value="กาญจนบุรี">กาญจนบุรี </option>
                    <option value="กาฬสินธุ์">กาฬสินธุ์ </option>
                    <option value="กำแพงเพชร">กำแพงเพชร </option>
                    <option value="ขอนแก่น">ขอนแก่น</option>
                    <option value="จันทบุรี">จันทบุรี</option>
                    <option value="ฉะเชิงเทรา">ฉะเชิงเทรา </option>
                    <option value="ชัยนาท">ชัยนาท </option>
                    <option value="ชัยภูมิ">ชัยภูมิ </option>
                    <option value="ชุมพร">ชุมพร </option>
                    <option value="ชลบุรี">ชลบุรี </option>
                    <option value="เชียงใหม่">เชียงใหม่ </option>
                    <option value="เชียงราย">เชียงราย </option>
                    <option value="ตรัง">ตรัง </option>
                    <option value="ตราด">ตราด </option>
                    <option value="ตาก">ตาก </option>
                    <option value="นครนายก">นครนายก </option>
                    <option value="นครปฐม">นครปฐม </option>
                    <option value="นครพนม">นครพนม </option>
                    <option value="นครราชสีมา">นครราชสีมา </option>
                    <option value="นครศรีธรรมราช">นครศรีธรรมราช </option>
                    <option value="นครสวรรค์">นครสวรรค์ </option>
                    <option value="นราธิวาส">นราธิวาส </option>
                    <option value="น่าน">น่าน </option>
                    <option value="นนทบุรี">นนทบุรี </option>
                    <option value="บึงกาฬ">บึงกาฬ</option>
                    <option value="บุรีรัมย์">บุรีรัมย์</option>
                    <option value="ประจวบคีรีขันธ์">ประจวบคีรีขันธ์ </option>
                    <option value="ปทุมธานี">ปทุมธานี </option>
                    <option value="ปราจีนบุรี">ปราจีนบุรี </option>
                    <option value="ปัตตานี">ปัตตานี </option>
                    <option value="พะเยา">พะเยา </option>
                    <option value="พระนครศรีอยุธยา">พระนครศรีอยุธยา </option>
                    <option value="พังงา">พังงา </option>
                    <option value="พิจิตร">พิจิตร </option>
                    <option value="พิษณุโลก">พิษณุโลก </option>
                    <option value="เพชรบุรี">เพชรบุรี </option>
                    <option value="เพชรบูรณ์">เพชรบูรณ์ </option>
                    <option value="แพร่">แพร่ </option>
                    <option value="พัทลุง">พัทลุง </option>
                    <option value="ภูเก็ต">ภูเก็ต </option>
                    <option value="มหาสารคาม">มหาสารคาม </option>
                    <option value="มุกดาหาร">มุกดาหาร </option>
                    <option value="แม่ฮ่องสอน">แม่ฮ่องสอน </option>
                    <option value="ยโสธร">ยโสธร </option>
                    <option value="ยะลา">ยะลา </option>
                    <option value="ร้อยเอ็ด">ร้อยเอ็ด </option>
                    <option value="ระนอง">ระนอง </option>
                    <option value="ระยอง">ระยอง </option>
                    <option value="ราชบุรี">ราชบุรี</option>
                    <option value="ลพบุรี">ลพบุรี </option>
                    <option value="ลำปาง">ลำปาง </option>
                    <option value="ลำพูน">ลำพูน </option>
                    <option value="เลย">เลย </option>
                    <option value="ศรีสะเกษ">ศรีสะเกษ</option>
                    <option value="สกลนคร">สกลนคร</option>
                    <option value="สงขลา">สงขลา </option>
                    <option value="สมุทรสาคร">สมุทรสาคร </option>
                    <option value="สมุทรปราการ">สมุทรปราการ </option>
                    <option value="สมุทรสงคราม">สมุทรสงคราม </option>
                    <option value="สระแก้ว">สระแก้ว </option>
                    <option value="สระบุรี">สระบุรี </option>
                    <option value="สิงห์บุรี">สิงห์บุรี </option>
                    <option value="สุโขทัย">สุโขทัย </option>
                    <option value="สุพรรณบุรี">สุพรรณบุรี </option>
                    <option value="สุราษฎร์ธานี">สุราษฎร์ธานี </option>
                    <option value="สุรินทร์">สุรินทร์ </option>
                    <option value="สตูล">สตูล </option>
                    <option value="หนองคาย">หนองคาย </option>
                    <option value="หนองบัวลำภู">หนองบัวลำภู </option>
                    <option value="อำนาจเจริญ">อำนาจเจริญ </option>
                    <option value="อุดรธานี">อุดรธานี </option>
                    <option value="อุตรดิตถ์">อุตรดิตถ์ </option>
                    <option value="อุทัยธานี">อุทัยธานี </option>
                    <option value="อุบลราชธานี">อุบลราชธานี</option>
                    <option value="อ่างทอง">อ่างทอง </option>
                    <option value="อื่นๆ">อื่นๆ</option>
                </select>
            </div>
            <div class="regis">
                <label class="labelreg">
                    Address :
                </label>
                <textarea class="textreg" name="address" rows="5" placeholder="address"></textarea>
            </div>
            <div class="regis">
                <label class="labelreg">
                    zipcode :
                </label>
                <input pattern="^[0-9]{5,5}$"type="text" class="textreg" placeholder="zipcode" name="zipcode" maxlength="5" />
            </div>
            <input type="submit"  class="button" name="submitreg" value="Register" style="margin-left:250px; margin-top: 50px;" />
                </fieldset>
         </form>
        </div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
