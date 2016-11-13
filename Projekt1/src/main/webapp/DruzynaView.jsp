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
<jsp:include page="boostrap.jsp"/>
    <!-- bootstrap-->
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
<div class="jumbotron">
<div class="row">
    <div class="row">
        <div class="col-xs-6 col-md-3">
            <a href="" class="thumbnail">
                <img src="<%=d.getImg()%>" alt="">
            </a>
            <div class="panel panel-default">
                <!-- Default panel contents -->
                <div class="panel-heading"><b>Dane drużyny: </b></div>
                <!-- List group -->
                <ul class="list-group">
                <li class="list-group-item">Nazwa Druzyny: <%=d.getNazwaDruzyny()%></li>
                <li class="list-group-item">Załozyciel: <%=d.getmZalozyciel()%></li>
                <li class="list-group-item">Liczba graczy: <%=d.getLiczbaGraczy()%></li>
                <li class="list-group-item">

                <a href="editDruzyna.jsp?id=<%=id%>" title="Edytuj daną drużynę"  class="btn btn-default btn-sm"><span class="glyphicon glyphicon-pencil"></span></a>
                <a href="addGraczGetData.jsp?id=<%=id%>" title="Dodaj nowego gracza" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-plus"></span></a>
                <a href="removeDruzyna?id=<%=id%>" title="Usuń drużynę" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-remove"></span></a>
                </li>

                </ul>
            </div>
            </div>
            <div class="col-xs-6 col-md-9">
                <div class="panel panel-default">
                         <div class="panel-heading">Lista graczy</div>
                     <table class="table"><tr>
                        <th><strong>Nickname</strong></th>
                        <th><strong>Pensja</strong></th>
                        <th><strong>Dywizja</strong></th>
                        <th><strong>Edytuj gracza</strong></th>
                        <th><strong>Usuń gracza</strong></th>
                        <th><strong></strong></th>
                        </tr>
                        <c:forEach items="${d.getListaGraczy()}" var="listaGraczy" varStatus="loop">
                        <tr>
                            <td><h5 style="font-size: larger">${listaGraczy.getNickname()} </h5></td>
                            <td><h5 style="font-size: larger">${listaGraczy.getPensja()} </h5></td>
                            <td><h5 style="font-size: larger">${listaGraczy.getDywizja()} </h5></td>
                            <td><a title="Edytuj gracza"
                            href="editGracz.jsp?idGracz=<%=d.getListaGraczy().indexOf(pageContext.getAttribute("listaGraczy"))%>&idDruzyna=<%=id%>"
                            class="btn btn-default btn-sm">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                            </a>
                            </td>
                            <td><a title="Usuń gracza"
                            href="removeGracz?idGracz=<%=d.getListaGraczy().indexOf(pageContext.getAttribute("listaGraczy"))%>&idDruzyna=<%=id%>"
                            class="btn btn-default btn-sm">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                            </a>
                            <td>
                        </tr>
                        </c:forEach>
                    </table>
            </div>
        </div>
        </div>
     </div>
     </div>
    </div>
     </body>
</html>