<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- CSS -->
  <jsp:include page="boostrap.jsp"/>
  <title>Drużyny i gracze</title>
</head>
<body>
    <jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />
    <jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />

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
      </div>
    </nav>

     <h3>Dodaj nową drużynę!</h3>
     <div class="container-fluid">
        <form action="addDruzyna.jsp">

          <div class="form-group">
            <label for="nazwaDruzyny">Nazwa drużyny</label>
            <input type="text" class="form-control" id="nazwaDruzyny" name="nazwaDruzyny" placeholder="Druzyna">
          </div>
          <div class="form-group">
            <label for="mZalozyciel">Założyciel</label>
            <input type="text" class="form-control" id="mZalozyciel" name="mZalozyciel" placeholder="Zalozyciel">
          </div>
          <div class="form-group">
            <label for="liczbaGraczy">Liczba graczy</label>
            <input type="text" class="form-control" id="liczbaGraczy" name="liczbaGraczy" placeholder="Liczba graczy">
          </div>
          <div class="form-group">
            <label for="Img">Logo</label>
            <input type="text" class="form-control" id="Img" name="Img" placeholder="Link do obrazka">
          </div>
          <button type="submit" value="add" class="btn btn-default">Dodaj</button>
          </form>
          <a href="pokazWszystkieDruzyny.jsp"><button class="btn btn-default">Powrót</button></a>
         </div>
</body>
</html>