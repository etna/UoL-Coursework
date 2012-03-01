import java.util.*;
import java.io.*;
import java.text.*;

public class shoppingsucks
{
    product stuff[] = new product[9];
    DecimalFormat f = new DecimalFormat("0.00");
    double ttcost = 0;
    double shipcost = 0;
    int ttweight = 0;
    int units = 0;
    int check = 0;
    
    
    public static void main(String[] args)
    throws IOException
    {
        shoppingsucks a = new shoppingsucks();
        a.initialize();
    }
    
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
    
    
    public void showInventory()
    {
        System.out.println("     HARDWARE ITEMS");
	System.out.println("CODE         DESCRIPTION                         WEIGHT(g)    UNIT PRICE     ");
    }
    
    
    public void initialize()
    throws IOException
    {
        order o = new order();
        showInventory();
        playInventory();
        System.out.println("");
        o.readFile();
        o.startOrder();
    }
}
