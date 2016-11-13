<%@page import="servlet.serv.Druzyna" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% int id = Integer.parseInt(request.getParameter("id"));
    Druzyna d = storage.All().get(id);
    pageContext.setAttribute("d", d);%>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- CSS -->
    <jsp:include page="boostrap.jsp"/>
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
        <h2>Dodaj gracza do druzyny ${d.nazwaDruzyny}</h2>
            <form action="addGraczy">
                <c:forEach var="i" begin="1" end="${d.liczbaGraczy}">
                    <label for="gracz${i}">Gracz ${i}</label>
                    <input type="text" class="form-control" id="gracz${i}Nickname" name="gracz${i}.Nickname" placeholder="Nickname Track${i}">
                    <input type="text" class="form-control" id="gracz${i}Pensja" name="gracz${i}.Pensja" placeholder="Pensja Track${i}">
                    <input type="text" class="form-control" id="gracz${i}" name="gracz${i}.Dywizja" placeholder="Dywizja Track${i}">
                </c:forEach>
                <button type="submit" value="add" class="btn btn-default">Dodaj</button>
            </form>
     </div>

</body>
</html>