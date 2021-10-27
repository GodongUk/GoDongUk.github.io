<%@ page language="java" contentType="text/html; charset=UTP-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html> <!-- dice.jsp -->
<html>
  <head>
   <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
  </head>
  <jsp:useBean id="dice" class="been.user.Dice" scope = "request" />
  <body>
    <h2> 주사위 2번 던지ㅣ기 </h2>
    주사위 1 :<jsp:getProperty name="dice" property="num" /> <br/>
    주사위 2 :<jsp:getProperty name="dice" property="num" /> <br/>
    <br>
    <a href=dice.jsp> 주사위 다시 던지기 </a>
  </body>
</html>
    
