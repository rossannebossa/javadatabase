package Database;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class Select {

//SELECT ONE
    public void selectOne(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM `books` WHERE Book_Id="+id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int bookid = rs.getInt(1);
                String name = rs.getString(2);
                
                System.out.println(bookid + "\t" + name);
            }
            rs.close();
            conn.close();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

//SELECT ALL  
    public void selectAll(){       
        try{
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM `books`";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                int bookid = rs.getInt(1);
                String name = rs.getString(2);
                
                System.out.println(bookid + "\t" + name);
            }
            rs.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
