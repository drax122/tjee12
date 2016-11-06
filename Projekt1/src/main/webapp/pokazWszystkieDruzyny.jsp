<%@page import="servlet.serv.Druzyna"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
          <a class="navbar-brand" href="#">Drużyny i gracze</a>
        </div>
        <ul class="nav navbar-nav">
           <li><a href="pokazWszystkieDruzyny.jsp">Drużyny</a></li>
           <li><a href="getDruzynaData.jsp">Dodaj nową drużynę</a></li>
        </ul>
      </div><!-- /.container-fluid -->
    </nav>

    <div class="row">
                   <c:forEach items="${storage.All()}" var="druzyna">
                        <div class="col-md-3">
                        <div class="thumbnail">
                            <a href="DruzynaView.jsp?id=${storage.All().indexOf(druzyna)}">
                                <img src="${druzyna.getImg()}" alt="Logo">
                            </a>
                            <div class="caption">
                                <p class="text-center">${druzyna.getNazwaDruzyny()}</p>
                            </div>
                        </div>
                        </div>
                    </c:forEach>

                    <div class="col-md-3">
                        <div class="thumbnail">
                            <a href="getDruzynaData.jsp">
                                <img src="http://images.clipartbro.com/149/plus-sign-clip-art-vector-online-royalty-free-amp-amp-public-149927.svg" alt="dodajObrazek">
                            </a>
                            <div class="caption">
                                <p class="text-center">Dodaj nową drużynę</p>
                            </div>
                        </div>
                    </div>
    </div>
    </body>
</html>