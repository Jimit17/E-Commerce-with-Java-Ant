/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.with.java.ant;

/**
 *
 * @author Jimit Shukla
 */
public class Carts {
    private String  ID,Name,Desc,Price,qty,act;
    private byte[] image;
    
    public Carts(){}
    
    public Carts(String ID,byte[] image,String Name,String Desc,String Price,String qty,String act)
    {
        this.ID=ID;
        this.image=image;
        this.Name=Name;
        this.Desc=Desc;
        this.Price=Price;
        this.qty=qty;
        this.act=act;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String getQty()
    {
        return qty;
    }
    
    public String getAct()
    {
        return act;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getDesc()
    {
        return Desc;
    }
    
    public String getPrice()
    {
        return Price;
    }
    
    public byte[] getMyImage()
    {
        return image;
    }
}
