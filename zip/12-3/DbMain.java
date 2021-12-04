package db.test;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class DbMain {
  public static void main(String[] args) {
    boolean flag=false;
    Connection conn=null;
    try{
      Class.forName("org.postgresql.Driver"); 
    } catch(ClassNotFoundException e) {.printStackTrace(); }
    PreparedStatement pstmt=null;
    try{
      System.out.println("모두 지웁니다");
      Mdelete mdelete = new Mdelete();
      flag = mdelete.mdelete("all", "");
    } catch(Exception e) {e.printStackTrace();
                         } finally {
      try{ if(conn !=null)conn.close(); if(pstmt !=null) pstmt.close();
         } catch(Exception e) {e.printStackTrace();
                              }
    }
    try{
      System.out.println("홍길동 입력합니다.");
      stud_id = "kdhong";
      stud_passwd = "1234";
      stud_name = "홍길동";
      stud_email = "kdhong@abc.com";
      stud_gender = "남자";
      Minsert minst = new Minsert();
      flag = minst.minsert(stud_id, stud_passwd, stud_name, stud_email, stud_gender);
      System.out.println("이몽룡 입력합니다"); //추후 수정을 위해 의도적으로 잘못 입력
      stud_id = "mrlee";
      stud_passwd = "4321";
      stud_name = "변학도";
      stud_email = "hdhyun@abc.com";
      stud_gender = "남자";
      flag = minst.minsert(stud_id, stud_passwd, stud_name, stud_email, stud_gender);
    } catch(Exception e) {e.printStackTrace();
                         } finally {
      try{ if(conn !=null)conn.close(); if(pstmt !=null) pstmt.close();
         } catch(Exception e) {e.printStackTrace(); 
     }
    }
  }
}
