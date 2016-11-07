<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />
<jsp:setProperty name="druzyna" property="*" />
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />

<%
  String s1 = request.getParameter("Img");
  storage.add_druzyna(druzyna,s1);
  int id = storage.All().size() - 1;
  response.sendRedirect("getGraczData.jsp?id=" + id);
%>
