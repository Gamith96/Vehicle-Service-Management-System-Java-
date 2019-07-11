
package codes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class DbConnect 
{
    
    public static Connection connect()
    {
        Connection conn=null;
        
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           conn =(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vehiclersdb","root","123");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return conn;
    }
    
}
