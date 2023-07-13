package airline;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.Driver - depricated
            c = DriverManager.getConnection("jdbc:mysql:///airline","root","Jibstect1!");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  