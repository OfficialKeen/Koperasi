package Database;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection test;
    
    public static Connection GetConnection()throws SQLException{
        if(test==null){
            new Driver();
            
            test=DriverManager.getConnection("jdbc:mysql://localhost:3306/koperasi", "root", "");
        }
        return test;
    }
}
