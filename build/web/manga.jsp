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
                        SELECT * FROM books WHERE type='manga' ORDER BY update_date DESC;
                    </sql:query>
                        <c:choose>
                        <c:when test="${result.getRowCount()%20!=0}">
                            <c:set var="maxp" value="${result.getRowCount()/20+1}" />
                        </c:when>
                        <c:otherwise>
                            <c:set var="maxp" value="${result.getRowCount()/20}" />
                        </c:otherwise>
                        </c:choose>
                        <fmt:parseNumber var="maxp" integerOnly="true" 
                       type="number" value="${maxp}" />
                        <c:set var="page" value="${param.page}"/>
                        <% 
                           int maxpage = Integer.parseInt(String.valueOf(pageContext.getAttribute("maxp")));
                        %>
                        <c:choose >
                            <c:when test="${page.matches('[0-9]+')&&page<=maxp}">
                       <% int p = Integer.parseInt(request.getParameter("page"));
                           int i = (p-1)*10;
                       %>
                       <h3>การ์ตูน</h3>
                       <%@include file="structurebook.jsp" %>
                       
                       <div style="float: left; width:750px; text-align: center;">
                           <a href="http://localhost:8080/DokFah/manga.jsp?page=1">first page</a>
                           <% if(p<=3){
                               for(int j= Math.max(1, p-3);j<Math.min(maxpage+1, 8);j++){
                             if(j!=p)
                                out.println("<a href='http://localhost:8080/DokFah/manga.jsp?page="+j+"'>"+j+"</a>");
                             else
                                 out.println(j);
                               }
                           }else if(p>=maxpage-3)
                                   for(int j= maxpage-6;j<maxpage+1;j++){
                             if(j!=p)
                                out.println("<a href='http://localhost:8080/DokFah/manga.jsp?page="+j+"'>"+j+"</a>");
                             else
                                 out.println(j);
                               }
                           else
                               for(int j= Math.max(1, p-3);j<Math.min(maxpage+1, p+4);j++){
                             if(j!=p)
                                out.println("<a href='http://localhost:8080/DokFah/manga.jsp?page="+j+"'>"+j+"</a>");
                             else
                                 out.println(j);
                               }
                          
                       
                       %>
                       <a href="http://localhost:8080/DokFah/manga.jsp?page=<%= maxpage %>">last page</a>
                       </div>
                       </c:when>
                        <c:otherwise>
                            <c:redirect url="./manga.jsp?page=1"/>
                        </c:otherwise>
                        </c:choose>
            </div>
        </div>
    </body>
</html>
