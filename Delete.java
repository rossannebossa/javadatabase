package Database;

import java.sql.*;

public class Delete {

    public void DeleteData(int id) {
        try{
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM uniform WHERE Item_Id="+id;
            stmt.executeUpdate(sql);
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
