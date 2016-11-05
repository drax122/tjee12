<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodawanie drużyn:</title>
</head>
<body>

<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session" />
<jsp:setProperty name="druzyna" property="*" />
<jsp:useBean id="storage" class="servlet.service.Storage" scope="application" />

<%  storage.add(druzyna); %>

<p>Druzyna została dodana do spisu: </p>
<p>Nazwa druzyny : ${druzyna.nazwaDruzyny} </p>
<p>Zalozyciel: ${druzyna.mZalozyciel} </p></p>
<p>
  <a href="pokazWszystkieDruzyny.jsp">Pokaż wszystkie drużyny</a>
</p>
</body>
</html>