package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class Dbconnect {
    public static Connection c;
    public static Statement s;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/clientssol","root","1234");
            s=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}
