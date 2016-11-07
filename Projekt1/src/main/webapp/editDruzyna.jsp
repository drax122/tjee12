<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="servlet.serv.Druzyna" %>
<%@ page import="servlet.serv.Gracz" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />

<% int id = Integer.parseInt(request.getParameter("id"));
    Druzyna d = storage.All().get(id);
    pageContext.setAttribute("d", d);%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="boostrap.jsp"/>
                <!-- bootstrap -->
        <title>Druzyny i gracze</title>
    </head>
    <body>

    <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"></button>
          <a class="navbar-brand" href="index.jsp">Drużyny i gracze</a>
        </div>
        <ul class="nav navbar-nav">
           <li><a href="pokazWszystkieDruzyny.jsp">Drużyny</a></li>
           <li><a href="getDruzynaData.jsp">Dodaj nową drużynę</a></li>
        </ul>
      </div><!-- /.container-fluid -->
    </nav>
    <div class="container-fluid">
    <form action="updateDruzyna.jsp?id=${id}">
                <input type="hidden" name="id" value="<%=id%>">
                <div class="form-group">
                    <label for="nazwaDruzyny">Nazwa drużyny</label>
                    <input type="text" class="form-control" id="nazwaDruzyny" name="nazwaDruzyny" value="<%=d.getNazwaDruzyny()%>">
                </div>
                <div class="form-group">
                    <label for="mZalozyciel">Założyciel</label>
                    <input type="text" class="form-control" id="mZalozyciel" name="mZalozyciel" value="<%=d.getmZalozyciel()%>">
                </div>
                <div class="form-group">
                    <label for="liczbaGraczy">Liczba graczy</label>
                    <input type="text" class="form-control" id="liczbaGraczy" name="liczbaGraczy" value="<%=d.getLiczbaGraczy()%>">
                </div>
                <div class="form-group">
                    <label for="Img">Img</label>
                    <input type="text" class="form-control" id="Img" name="Img" value="<%=d.getImg()%>">
                </div>
                <button type="submit" value="Edytuj" class="btn btn-default">Edytuj</button>
            </form>
            <a href="DruzynaView.jsp?id=<%=id%>"><button class="btn btn-default">Wróć</button></a>
        </div>
    </body>
</html>
