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
      conn=DriverManage.getConnection("jdbc:postgresql://localhost:5432/mydb","studx","gkrod123A!");
      String sql="INSERT INTO badge (stud_id,stud_passwd,stud_name,stud_maile,stud_gender) VALUES
        (?,?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, "hdbyun"); pstmt.setString(2,"4321"); pstmt.setSting(3,"변학도");
      pstmt.setString(4, "hdbyun@abc.com");pstmt.setString(5,"남자");
      int cnt = pstm.executeUpdate();
      flag=true;
      System.out.println(flag+" "+cnt);
    } catch(Exception e) {e.printStackTrace();
                         } finally {
      try{ if(conn !=null)conn.close(); if(pstmt !=null) pstmt.close();
         } catch(Exception e) {e.printStackTrace(); }
    }}}
