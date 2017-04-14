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
                    <c:choose>
                        <c:when test="${result.getRowCount()%2!=0}">
                            <c:set var="maxp" value="${result.getRowCount()/2+0.5}" />
                        </c:when>
                        <c:otherwise>
                            <c:set var="maxp" value="${result.getRowCount()/2}" scope="session" />
                        </c:otherwise>
                    </c:choose>
                        <fmt:parseNumber var="maxp" integerOnly="true" 
                       type="number" value="${maxp}" />
                        <c:set var="page" value="${param.page}"/>
                        <c:choose >
                            <c:when test="${page.matches('[0-9]+')&&page<=maxp}">
                       <% int p = Integer.parseInt(request.getParameter("page"));
                           int i = (p-1)*2;
                          
                       %>
                       <h3>การ์ตูน</h3>
                       <%@include file="book.jsp" %>
                       
                       <div style="float: left; width:750px; text-align: center;">
                           <a href="http://localhost:8080/DokFah/manga.jsp?page=1">first page</a>
                           <% for(int j= Math.max(1, p-3);j<Math.max(8, p+4);j++){
                             if(j!=p)
                                out.println("<a href='http://localhost:8080/DokFah/manga.jsp?page="+j+"'>"+j+"</a>");
                             else
                                 out.println(j);
                           }
                          
                       
                       %>
                       <a href="http://localhost:8080/DokFah/manga.jsp?page=${maxp}">last page</a>
                       </div>
                       <a href=""
                       </c:when>
                        <c:otherwise>
                            <c:redirect url="./manga.jsp?page=1"/>
                        </c:otherwise>
                        </c:choose>
            </div>
        </div>
    </body>
</html>
