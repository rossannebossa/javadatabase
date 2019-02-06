package Database;

import java.sql.*;

public class StoredProcedure {
    public static void SP(int id, String [] name){
        try{
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM `books` WHERE Book_Id= ? AND Book_Name = ?");
            ResultSet rs = ps.executeQuery();
            
            ps.setInt(1, id);
            
            if(rs.next()){
                name[0] = rs.getString(2);
            }else{
                name[0] = null;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
