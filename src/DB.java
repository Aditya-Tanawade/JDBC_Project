import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {
    static Connection con=null;
    public static Connection connect(){
        try{
            String url="jdbc:mysql://localhost:3306/employee";
            String password="Hariom@2004";
            String userName="root";

            con= DriverManager.getConnection(url,userName,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

}
