package db.test;
import java.sql.*;
public class Insert_Java {
  public static void main(String[] args) {
    boolean flag=false;
    Connection conn=null;
    try{
      Class.forName("org.postgresql.Driver"); 
    } catch(ClassNotFoundException e) {.printStackTrace(); }
    PreparedStatement pstmt=null;
    try{
      conn=DriverManage.getConnection("jdbc:postgresql://localhost:5432/
