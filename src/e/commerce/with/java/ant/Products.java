/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.with.java.ant;

/**
 *
 * @author Jimit Shukla
 */
public class Products {
    private String  ID,Name,Desc,Price,act;
    private byte[] image;
    
    public Products(){}
    
    public Products(String ID,byte[] image,String Name,String Desc,String Price,String act)
    {
        this.ID=ID;
        this.image=image;
        this.Name=Name;
        this.Desc=Desc;
        this.Price=Price;
        this.act=act;
    }
    
    public String getID()
    {
        return ID;
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
