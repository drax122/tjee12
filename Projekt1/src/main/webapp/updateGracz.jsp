<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />
<jsp:useBean id="gracz" class="servlet.serv.Gracz" scope="session" />

<jsp:setProperty name="druzyna" property="*" />
<jsp:setProperty name="gracz" property="*" />

<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />

<%
    Integer idDruzyna = Integer.parseInt(request.getParameter("idDruzyna"));
    Integer idGracz = Integer.parseInt(request.getParameter("idGracz"));

    String nickname = request.getParameter("Nickname");
    Integer Pensja = Integer.parseInt(request.getParameter("Pensja"));
    String Dyw = request.getParameter("Dywizja");

    storage.updateGracz(idDruzyna,idGracz,nickname,Pensja,Dyw);
    response.sendRedirect("DruzynaView.jsp?id=" + idDruzyna);
%>