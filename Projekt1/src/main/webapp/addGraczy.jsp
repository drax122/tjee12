<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />
<jsp:setProperty name="druzyna" property="*" />
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />

<%
    String nick,dyw;
    Integer pen;
    int id = storage.All().size() - 1;
    for (int i=1; i <= storage.All().get(id).getLiczbaGraczy(); i++)
    {
        nick = request.getParameter("gracz" + i + ".Nickname");
        dyw = request.getParameter("gracz" + i + ".Dywizja");
        pen = Integer.parseInt(request.getParameter("gracz"+ i + ".Pensja"));

        storage.All().get(id).dodajGracza(nick,pen,dyw);
    }
    response.sendRedirect("DruzynaView.jsp?id=" + id);
%>