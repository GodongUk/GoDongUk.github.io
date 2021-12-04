package db.test;
import java.sql.*;
public class Minsert {
  private Connection conn=null;
  public boolean minsert(String stud_id, String stud_passwd, String stud_name, String stud_email, String 
                         stud_gender) throws SQLException {
    boolean flag = false;
    PreparedStatement pstmt=null;
    try{
        conn=DriverManage.getConnection("jdbc:postgresql://localhost:5432/mydb","studx","gkrod123A!");
      String sql="INSERT INTO badge (stud_id, stud_passwd, stud_name, stud_email, stud_gender) VALUES
        (?,?,?,?,?)";
        
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
