import java.util.*;
import java.io.*;

public class shoppingsucks
{
    
    product stuff[] = new product[9];
    
    public static void main(String[] args)
    throws IOException
    {
        shoppingsucks a = new shoppingsucks();
        a.initialize();
    }
    
    
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
    
    
    public void getCustomer()
    {
        customer a = new customer();
        a.billinfo();
        a.displayCustInfo();    
    }
    
    public void initialize()
    throws IOException
    {
        readFile();
        showList();
        System.out.println("");
        getCustomer();
    }
}