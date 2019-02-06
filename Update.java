package Database;

import java.sql.*;

public class Update {

    public void UpdateDate(String name, String date, int stock, float price, int id) {
        try{
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "UPDATE `bcstore`.`uniform` SET `Item_Name` = '"+name+"',`Item_Date` = '"+date+"',`Item_Stock` = '"+stock+"',`Item_Price` = '"+price+"' WHERE `uniform`.`Item_Id` ="+id;
            stmt.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
