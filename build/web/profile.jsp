<%-- 
    Document   : profile
    Created on : Apr 16, 2017, 5:39:41 PM
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

                <div class="regis">
                <label class="labelreg">
                    username :
                </label>
                    <label class="textreg">${sessionScope.username}</label>
            </div>
            <form action="editprofile" method="POST">
            <div class="regis">
                <label class="labelreg">
                    password : 
                </label>
                <input type="password" class="textreg" placeholder="password" name="password" maxlength="50" value=""/>
            </div>
            <div class="regis">
                <label class="labelreg">
                    E-MAIL :
                </label>
                <input type="text" class="textreg" placeholder="E-mail" name="email" value="${sessionScope.email}" />
            </div>
            <div class="regis">
                <label class="labelreg">
                    First Name :
                </label>
                <input type="text" class="textreg" placeholder="First Name" name="fname" value="${sessionScope.fname}" />
            </div>
            <div class="regis">
                <label class="labelreg">
                    Last Name :
                </label>
                <input type="text" class="textreg" placeholder="First Name" name="lname" value="${sessionScope.lname}" />
            </div>
            <div class="regis">
                <label class="labelreg">
                    Address :
                </label>
                <textarea class="textreg" name="address" rows="5" placeholder="address">${sessionScope.address}</textarea>
            </div>
            <div class="regis">
                <label class="labelreg">
                   input password : 
                </label>
                <input type="password" class="textreg" placeholder="password" name="password" maxlength="50"/>
            </div>
            <input type="button" class="button" name="submitreg" value="Edit" style="margin-left:250px; margin-top: 50px;" />
            </form>
            </div>
        </div>
    </body>
</html>