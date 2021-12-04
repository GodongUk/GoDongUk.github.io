<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javasql.*"%>
<%@ request.setCharacterEncodong("utf-8"); %>
<!DOCTYPE html> <!-- select_passwd.jsp -->
<html><head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
 <title>JDBC select_passwd 실습</title></head>
  <body>
    <%
    Class.forName("org.postgresql.Driver");
    Connection conn = DriverManager.getConnection("
        
