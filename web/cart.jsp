<%-- 
    Document   : cart.jsp
    Created on : Apr 20, 2017, 11:04:41 AM
    Author     : Amoeba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <%@include file="structure.jsp"%>
            <div id="r_cont">
            <table class="carttable">
                <col width="148" />
                <col width="296" />
                <col width="59.2" />
                <col width="66.6" />
                <col width="66.6" />
                <col width="44.4" />
                <thead style="font-size:15px; font-weight: bold;">
                    <td>ภาพประกอบ</td>
                    <td>สินค้า</td>
                    <td>ราคา/เล่ม</td>
                    <td>จำนวน</td>
                    <td>น้ำหนัก</td>
                    <td>ราคารวม</td>
                    <td>ลบ</td>
                </thead>
                <tbody>
                    <c:forEach var="row" items="${sessionScope.cart.getBooks}">
                    <tr>
                        <td><img src="${row.picture}" width="70" height="100" /></td>
                        <td>${row.name}</td>
                        <td>${row.price}</td>
                        <td>1</td>
                        <td>${row.weight/1000} kg</td>
                        <td>55</td>
                        <td><img src="img/icon/bin.png" width="50" height="50" /></td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div align="right" style=" font-size:15px;">น้ำหนักรวม : 3.1kg</div>
            <div style="float:left; width: 440px; text-align: center; padding: 5px; background: #f5f5f5">
                <input type="submit" name="submit" value="ขั้นต่อไป">
                <input type="submit" name="submit" value="ย้อนกลับ">
            </div>
            <div class="send-method">
                <p>
                    วิธีการจัดส่ง
                </p>
                <input type="radio" name="send-method" value="normal" checked style="float:left; width:20px;">
                <div style="width:150px; float: left;">ส่งธรรมดา </div>
                <div style="float: left">: 65 บาท</div>
                </input>
                <br>
                <br>
                <input type="radio" name="send-method" value="normal" style="float:left; width: 20px;">
                <div style="width:150px; float: left;">EMS </div>
                <div style="float:left">: 157 บาท</div>
                </input>
                <div style="width:170px; float: left; font-size: 15px;margin-top:20px;">ราคาสินค้า </div>
                <div style="float:left; font-size: 15px; margin-top:20px;">: 605 บาท</div>
                <div style="width:170px; float: left; font-size: 15px;margin-top:20px;">ราคารวม </div>
                <div style="float:left; font-size: 15px; margin-top:20px;">: 670 บาท</div>
            </div>
        </div>
        </div>
    </body>
</html>
