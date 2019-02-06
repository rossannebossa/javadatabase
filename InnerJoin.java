package Database;

import java.sql.*;

public class InnerJoin {

    public void IJSelect() {
        try{
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT books.Book_Id, books.Book_Name, uniform.Item_Id "
                    + "FROM books INNER JOIN unform ON books.Book_Id = uniform.Item_Id");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int bookid = rs.getInt("uniform.Item_Id");
                String name = rs.getString("books.Book_Name");
                
                System.out.println(bookid + "\t" + name);
            }
            rs.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
