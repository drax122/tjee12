<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />
<jsp:setProperty name="druzyna" property="*" />
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />

<%
    int id = Integer.parseInt(request.getParameter("id"));
    storage.usunDruzyne(id);
    response.sendRedirect("pokazWszystkieDruzyny.jsp");
%>
