/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.with.java.ant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jimit Shukla
 */
public class Summary_Fetch {
    Connection con=null;
    int ttl=0;
    public ArrayList<Carts> BindTable()
    {    
       ArrayList<Carts> list = new ArrayList<Carts>();
        try
        {
            MySQL_Connection c1= new MySQL_Connection();
            con=c1.connect();
            Statement stmt= (Statement) con.createStatement();
            String query="Select * from product,cart where product.Pid = cart.CId;";
            ResultSet rs= stmt.executeQuery(query);
            Carts p;
            while(rs.next())
            {
                int sum= rs.getInt("Pprice") * rs.getInt("CQuantity");
                ttl+=sum;
                String s= sum+"";
                p = new Carts(
                        rs.getString("PId"),
                        rs.getBytes("Pimg"),
                        rs.getString("Pname"),
                        rs.getString("Pdesc"),
                        rs.getString("Pprice"),
                        rs.getString("CQuantity"),
                        s
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
