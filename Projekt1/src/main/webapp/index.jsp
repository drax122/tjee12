<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <jsp:include page="boostrap.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Druzyny i gracze</title>
</head>

    <body>
    <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"></button>
          <a class="navbar-brand" href="#">Drużyny i gracze</a>
        </div>
        <ul class="nav navbar-nav">
           <li><a href="pokazWszystkieDruzyny.jsp">Drużyny</a></li>
           <li><a href="getDruzynaData.jsp">Dodaj nową drużynę</a></li>
        </ul>
      </div><!-- /.container-fluid -->
    </nav>
    <div class="container-fluid">
        <h3> Witaj! <span class="label label-default"></span></h3>
        <h3> Przejdź prosto do spisu drużyn! Tu i tak nic nie ma :) <span class="label label-default"></span></h3>
    <p><a class="btn btn-primary btn-lg" href="pokazWszystkieDruzyny.jsp" role="button">Kliknij tutaj</a></p>
    <p><a class="btn btn-primary btn-lg" href="glosuj" role="button">Zagłosuj na najlepszą drużynę</a></p>
    </div>
    </body>
</html>
