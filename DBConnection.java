package Database;

import java.sql.*;

public class DBConnection {

    public static final Connection getConnection() {
       try{
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/bcstore", "root", "");
       }catch(Exception e){
           throw new RuntimeException("Error Connecting To The Database!" +e);
       }
    }
}
