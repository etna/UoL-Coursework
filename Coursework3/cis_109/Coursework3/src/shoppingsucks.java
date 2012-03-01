import java.util.*;
import java.io.*;
import java.text.*;

public class shoppingsucks
{
<<<<<<< HEAD:Coursework3/CIS_109/Coursework3/src/shoppingsucks.java
    product stuff[] = new product[9];
    DecimalFormat f = new DecimalFormat("0.00");
    double ttcost = 0;
    double shipcost = 0;
    int ttweight = 0;
    int units = 0;
    int check = 0;
    
=======
    
    product stuff[] = new product[9];
>>>>>>> 22ab5dfc19cb465b5aef6778f0e4e4e4bb79c2a7:Coursework3/CIS_109/Coursework3/src/shoppingsucks.java
    
    public static void main(String[] args)
    throws IOException
    {
        shoppingsucks a = new shoppingsucks();
        a.initialize();
    }
<<<<<<< HEAD:Coursework3/CIS_109/Coursework3/src/shoppingsucks.java
    
    public void playInventory()
    throws IOException
    {
        Scanner in = new Scanner(new FileReader("inventoryDisplay.txt"));
            while (in.hasNext()) 
            {
                for(int i=0; i < 3; i = i + 1)
                {
                    System.out.print(in.nextLine());
                }
                System.out.println(in.nextLine());
            }
            in.close();
    }
=======
    
    
    public void readFile() throws IOException
    {
        product a = new product();
        Scanner in = new Scanner(new FileReader("inventory.txt"));
            while (in.hasNext())
            {
                for (int i = 0; i <= 8; i = i + 1)
                {
                    stuff[i].pid = in.nextLine();
                    stuff[i].pdesc = in.nextLine();
                    stuff[i].weight = Integer.parseInt(in.nextLine());
                    stuff[i].cost = Integer.parseInt(in.nextLine());
                }
            }
            in.close();
    }
    public void showList()
    {
        product a = new product ();
        System.out.println("     HARDWARE ITEMS");
	System.out.println("CODE         DESCRIPTION                         WEIGHT(g)    UNIT PRICE     ");
        for (int i = 0; i <= 8; i = i + 1)
        {
            a.displayInventory();
        }
    }
    
>>>>>>> 22ab5dfc19cb465b5aef6778f0e4e4e4bb79c2a7:Coursework3/CIS_109/Coursework3/src/shoppingsucks.java
    
    
    public void showInventory()
    {
        System.out.println("     HARDWARE ITEMS");
	System.out.println("CODE         DESCRIPTION                         WEIGHT(g)    UNIT PRICE     ");
    }
    
    
    public void initialize()
    throws IOException
    {
<<<<<<< HEAD:Coursework3/CIS_109/Coursework3/src/shoppingsucks.java
        order o = new order();
        showInventory();
        playInventory();
=======
        readFile();
        showList();
>>>>>>> 22ab5dfc19cb465b5aef6778f0e4e4e4bb79c2a7:Coursework3/CIS_109/Coursework3/src/shoppingsucks.java
        System.out.println("");
        o.readFile();
        o.startOrder();
    }
}
