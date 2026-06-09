
package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            //java Register Driver from class path
            //create connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "dj23");
            //create statement
            s = c.createStatement();
            
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
