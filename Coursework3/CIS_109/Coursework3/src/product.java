import java.util.*;
import java.io.*;
        
public class product
{
    public String pid;
    public String pdesc;
    public int weight;
    public int cost;
    public int orderquantity;
    
    
    public String getString(String s)
    {
        return s;
    }
    
    public void displayInventory()
    {
        System.out.println(pid);
        System.out.println(pdesc);
        System.out.println(weight);
        System.out.println(cost);
    }
}