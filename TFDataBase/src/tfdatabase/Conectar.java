package tfdatabase;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conectar {
    Connection con;
    public Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tfdatabase","root","");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
}
