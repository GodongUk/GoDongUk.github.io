package db.test;
import java.sql.*;
public class Minsert {
  private Connection conn=null;
  public boolean minsert(String idx, String stud_id) throws SQLException {
    boolean flag = false;
    PreparedStatement pstmt=null;
    try{
        conn=DriverManage.getConnection("jdbc:postgresql://localhost:5432/mydb","studx","gkrod123A!");
      if(idx=="all") {
        pstmt = conn.prepareStatement("DELETE FROM badge");
      }else{
         pstmt = conn.prepareStatement("DELETE FROM badge WHERE stud_id=?");
        pstmt.setString(1,stud_id);
      }
      pstmt.executeUpdate();
      flag=true;
    } catch(Exception e) {e.printStackTrace();
                         } finally {
      try{ if(conn !=null)conn.close(); if(pstmt !=null) pstmt.close();
         } catch(Exception e) {e.printStackTrace(); }
    }
  return flag;
  }
}
