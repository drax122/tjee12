<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

<jsp:useBean id="storage" class="servlet.service.Storage" scope="application"/>
<jsp:useBean id="druzyna" class="servlet.serv.Druzyna" scope="session"/>

<form action="add.jsp">
  Nazwa druzyny :<input type="text" name="nazwaDruzyny" value="${druzyna.nazwaDruzyny}"> <br />
  Założyciel :<input type="text"  name="mZalozyciel" value="${druzyna.mZalozyciel}"> <br />
  <input type="submit" value=" Dodaj ">
</form>

</body>
</html>