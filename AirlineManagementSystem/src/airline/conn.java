package airline;

import java.sql.*;  

public class conn{
    Connection c = null;
    Statement s = null;
    
    
    /*public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.Driver - depricated
            c = DriverManager.getConnection("jdbc:mysql://localhost/airline","root","Jibstect1!");    
            s =c.createStatement(); 
                   
        }catch(Exception e){ 
            System.out.println(e);
        }  
    } */
    
    public conn(){
	
	String dbUrl = "jdbc:mysql://localhost:3306/airline";
	String user = "root";
	String password = "Jibstech1!";
	
	try{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    c = DriverManager.getConnection(dbUrl, user, password);
		
		
	}catch (Exception e) {
	    System.out.println(e);
	}
    }
}  