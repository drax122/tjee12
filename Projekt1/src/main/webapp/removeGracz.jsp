<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />
<jsp:setProperty name="druzyna" property="*" />
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />

<%
    int idDruzyna = Integer.parseInt(request.getParameter("idDruzyna"));
    int idGracz = Integer.parseInt(request.getParameter("idGracz"));
    storage.usunGracza(idDruzyna,idGracz);
    response.sendRedirect("DruzynaView.jsp?id=" + idDruzyna);
%>