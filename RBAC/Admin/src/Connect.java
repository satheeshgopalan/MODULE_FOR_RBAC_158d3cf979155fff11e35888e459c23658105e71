/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
import java.sql.*;
import javax.swing.*;
public class Connect 
{
     Connection con=null;  
        public static Connection ConnectDB()
        {
             try{
           
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fyp","fyp","root");
        /* if(con==null)
         {
        	 JOptionPane.showMessageDialog(null, "Cannot create a connection");
         }
         else
         {
        	 JOptionPane.showMessageDialog(null, "Created a connection");
         }*/
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
