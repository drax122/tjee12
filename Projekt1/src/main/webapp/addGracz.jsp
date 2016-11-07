<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />
<jsp:setProperty name="druzyna" property="*" />
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />

<%
    int id = Integer.parseInt(request.getParameter("id"));
    String s1 = request.getParameter("Nickname");
    Integer s2 = Integer.parseInt(request.getParameter("Pensja"));
    String s3 = request.getParameter("Dywizja");
    storage.All().get(id).dodajGracza(s1,s2,s3);
    response.sendRedirect("DruzynaView.jsp?id=" + id);
%>