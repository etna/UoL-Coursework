import java.util.*;
import java.io.*;

public class shoppingsucks
{
    product[] stuff = new product[9];

    public void read_file ()throws IOException
    {Scanner in = new Scanner(new FileReader("inventory.txt"));
            while (in.hasNext()) 
            {
                //store it to array of objects
                for(int i=0 ; i <= 8 ; i = i+ 1)
                {
                    stuff[i].p_code=in.nextLine();
                    .
                    .
                }

                }
                /*for (int i = 0; i < 3; i = i + 1)
                {
                    System.out.print(in.nextLine());
                } */

                
                //put another for loop
                
            
            in.close();
            }
    public void display_cat()
    {
        System.out.println("     HARDWARE ITEMS");
	System.out.println("CODE         DESCRIPTION                         WEIGHT(g)    UNIT PRICE     ");
        for(int i=0 ; i <= 8 ; i = i+ 1)
        {
            //output
        }
    }
    public static void main(String[] args)
    throws IOException
    {
        shoppingsucks a = new shoppingsucks();
        a.initialize();
    }
    
    public void getInventory() 
    throws IOException
    {
        order a = new order();
        a.displayInventory();
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
        getInventory();
        System.out.println("");
        getCustomer();
    }
}