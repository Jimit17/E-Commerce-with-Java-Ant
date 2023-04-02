/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.with.java.ant;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Jimit Shukla
 */
public class Product_Fetch {
    Connection con=null;
    
    public ArrayList<Products> BindTable()
    {    
       ArrayList<Products> list = new ArrayList<Products>();
        try
        {
            MySQL_Connection c1= new MySQL_Connection();
            con=c1.connect();
            Statement stmt= (Statement) con.createStatement();
            String query="Select * from product";
            ResultSet rs= stmt.executeQuery(query);
            Products p;
            while(rs.next())
            {
                p = new Products(
                        rs.getString("PId"),
                        rs.getBytes("Pimg"),
                        rs.getString("Pname"),
                        rs.getString("Pdesc"),
                        rs.getString("Pprice"),
                        "Add to cart"
                    );
                    list.add(p);
            }

        }
        catch(SQLException x)
        {
          System.out.println("\nAn Error occured: "+x+"\n");
        }
       return list;
    }
}