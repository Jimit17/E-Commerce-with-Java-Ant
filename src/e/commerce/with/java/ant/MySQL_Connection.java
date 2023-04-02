/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.with.java.ant;
import java.sql.*;
import java.util.logging.Level;

/**
 *
 * @author Jimit Shukla
 */
public class MySQL_Connection {
    public static Connection connect() throws SQLException{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(MySQL_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
