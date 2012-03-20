import java.util.*;
import java.io.*;
import java.text.*;

public class product
{
    public String pid;
    public String pdesc;
    public int weight;
    public double cost;
    public int orderquantity;
    public double totalcost;
    public int totalweight;
    DecimalFormat f = new DecimalFormat("0.00");

    public void getorderQuantity()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("QUANTITY: ");
        orderquantity = orderquantity + in.nextInt();
            {
                while (orderquantity > 100 || orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        orderquantity = 0;
                        orderquantity = orderquantity + in.nextInt();                            
                    }
                totalweight = orderquantity * weight;
		totalcost = orderquantity * cost;
            }
    }
}