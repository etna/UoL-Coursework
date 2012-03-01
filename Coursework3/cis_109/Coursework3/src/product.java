import java.util.*;
import java.io.*;
<<<<<<< HEAD:Coursework3/CIS_109/Coursework3/src/product.java
import java.text.*;

=======
        
>>>>>>> 22ab5dfc19cb465b5aef6778f0e4e4e4bb79c2a7:Coursework3/CIS_109/Coursework3/src/product.java
public class product
{
    public String pid;
    public String pdesc;
    public int weight;
<<<<<<< HEAD:Coursework3/CIS_109/Coursework3/src/product.java
    public double cost;
    public int orderquantity;
    public double totalcost;
    public int totalweight;
    DecimalFormat f = new DecimalFormat("0.00");

=======
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
>>>>>>> 22ab5dfc19cb465b5aef6778f0e4e4e4bb79c2a7:Coursework3/CIS_109/Coursework3/src/product.java
}