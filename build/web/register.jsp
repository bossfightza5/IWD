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
            <%@include file="structure.jsp" %>
        <div id="r_cont">
            <script type="text/javascript" src="js/register.js"></script>
            <form action="RegisterServlet" method="POST" name="register" onsubmit="return(regvalidate())">
                <fieldset>
            <div class="regis">
                <label class="labelreg">
                    username :
                </label>
                <input pattern="^[a-zA-Z0-9]{6,50}$" type="text" class="textreg" placeholder="Username" name="username" id="username" value="" />
                <div class="regnote">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    password :
                </label>
                <input pattern="^[a-zA-Z0-9]{6,50}$" type="password" class="textreg" placeholder="Password" name="password" id="password" value="" />
                <div class="regnote">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    confirm password :
                </label>
                <input pattern="^[a-zA-Z0-9]{6,50}$" title="" type="password" class="textreg" placeholder="Password" name="confirm" id="confirm" value="" />
                <div class="regnote">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    E-MAIL :
                </label>
                <input type="email" class="textreg" placeholder="E-mail" name="email" id="email" value="" />
                <div class="regnote">Example : example@example.com</div>
            </div>
            <div class="regis">
                <label class="labelreg">
                    First Name :
                </label>
                <input type="text" class="textreg" placeholder="First Name" name="fname" value="" />
            </div>
            <div class="regis">
                <label class="labelreg">
                    Last Name :
                </label>
                <input type="text" class="textreg" placeholder="First Name" name="lname" value="" />
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
