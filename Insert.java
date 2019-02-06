package Database;

import java.sql.*;

public class Insert {

    public void InsertData(int id, String name, String date, String details, int stock, float price) {
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO `bcstore`.`books` (`Book_Id` ,`Book_Name` ,`Book_Date` ,`Book_Details` ,`Book_Stock` ,`Book_Price`)VALUES (?, ?, ?, ?, ?, ?)");
            
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, date);
            ps.setString(4, details);
            ps.setInt(5, stock);
            ps.setFloat(6, price);
            
            ps.executeUpdate();
            System.out.println("Inserted Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
