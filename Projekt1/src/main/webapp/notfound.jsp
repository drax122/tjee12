<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
            <h3> Nie znaleziono szukanej drużyny! <span class="label label-default"></span></h3>
            <a href='szukaj.jsp'>Spróbuj wyszkuać jeszcze raz! (CLICK) </a>
        </div>
        </body>
</html>