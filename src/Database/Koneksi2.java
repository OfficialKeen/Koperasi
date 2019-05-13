package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi2 {
    public static String PathReport = System.getProperty("user.dir") + "/src/Report/";
    public static Connection Database;
    public static Connection getkoneksi(){
        if (Database == null){
            try {
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost:3306/koperasi";
                user = "root";
                password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Database = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Koneksi Error");
            }
        }
        return Database;
    }

    public static Connection GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
