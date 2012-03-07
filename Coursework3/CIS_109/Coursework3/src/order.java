import java.util.*;
import java.io.*;
import java.text.*;

public class order
{
    Scanner in = new Scanner(System.in);
    product stuff[] = new product[9];
    DecimalFormat f = new DecimalFormat("0.00");
    double ttcost = 0;
    double shipcost = 0;
    int ttweight = 0;
    int units = 0;
    int check = 0;
    double VAT = 20; //must eventually substitute with filereader
    double ship = 100; //must eventually substitute with filereader
    customer a = new customer();
    
    public void readFile()
    throws IOException
    {
        Scanner in = new Scanner(new FileReader("inventoryvalues.txt"));
            while (in.hasNext()) 
            {
                for(int i=0 ; i <= 8 ; i = i + 1)
                {
                    stuff[i] = new product();
                    stuff[i].pid=in.nextLine();
                    stuff[i].pdesc=in.nextLine();
                    stuff[i].weight= Integer.parseInt(in.nextLine());
                    stuff[i].cost=Double.parseDouble(in.nextLine());
                }
                }
            in.close();
    }
    
    public void getCustomer()
    {
        
        a.billinfo();
        a.displayCustInfo();    
    }
    
    public void eraseOldOrders()
    {
        for (int r = 1; r <= 9; r = r + 1)
	{
	    stuff[r-1].orderquantity = 0;
	    stuff[r-1].totalweight = 0;
	    stuff[r-1].totalcost = 0;
        }
    }
       
    /*public void getA12()
    {
        System.out.println("QUANTITY: ");
        stuff[8].orderquantity = stuff[8].orderquantity + in.nextInt();
            {
               while (stuff[8].orderquantity > 100 || stuff[8].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[8].orderquantity = 0;
                        stuff[8].orderquantity = stuff[8].orderquantity + in.nextInt();                            
                    }
                stuff[8].totalweight = stuff[8].orderquantity * stuff[8].weight;
		stuff[8].totalcost = stuff[8].orderquantity * stuff[8].cost;
            }
    }
     */
        
    public void takeXX()
    {
        int tquantity = 0;
		    for (int z = 1; z <= 9; z = z + 1)
		    {
			tquantity = tquantity + stuff[z-1].orderquantity;
		    }
                    if (tquantity == 0)
                    {
                        takeNothing();
                    }
                    
                    else
                    {
                        takeInvoice();
                        
                    }
    }
      
    public void takeNothing()
		    {
			    System.out.println("You have ended your session without ordering anything.");
                    }
			
    public void takeInvoice()
		{
                    System.out.println("\nINVOICE FOR ORDER:");
                    a.invoiceCustomer();
		    ttcost = 0;
		    ttweight = 0;
		    units = 0;
		    for (int i = 1; i <= 9; i = i + 1)
		    {
			if (stuff[i-1].orderquantity > 0)
                        {
                        System.out.println(stuff[i-1].pid + "\t" + stuff[i-1].pdesc + "\t" + stuff[i-1].orderquantity + " @  $" + f.format(stuff[i-1].cost / 100) + "\t  $" + f.format(stuff[i-1].totalcost / 100)+ "    " + "\t" + stuff[i-1].totalweight + "g");
			ttcost = ttcost + stuff[i-1].totalcost;
			ttweight = ttweight + stuff[i-1].totalweight;
                        }
		    }
		    units = ttweight / 250;
                    check = ttweight % 250;
		    {
			if (check != 0)
                        {
                            units = units + 1;
		    ttcost = ttcost / 100;
		    shipcost = (units * ship) / 100;
		    double tbt = ttcost + shipcost;
		    double tax = tbt * (VAT / 100);
		    double tft = tbt + tax;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t Total: $" + f.format(ttcost));
		    System.out.println("\t\tSHIPPING: " + ttweight + "g @ $1.00 per 250g" + "\t\t\t\t\t$" + f.format(shipcost));
		    System.out.println("\t\t\t\t\t\t\t\t  TOTAL INCL. SHIPPING: $" + f.format(tbt));
		    System.out.println("\t\t\t\t\t\t\t\tVAT at 20%" + "\t\t$" + f.format(tax));
		    System.out.println("\t\t\t\t\t\t\t\t\t  TOTAL TO PAY: $" + f.format(tft));
		}
                        else
                        {
                            System.out.println("You have entered an invalid code. Please try again.");
                        }
                    }
                }
    
    public void startOrder()
    {
            boolean breaker = true;
            while (breaker == true)
            {
                
                eraseOldOrders();
                getCustomer();
                System.out.println("\nENTER CODE: (XX to Stop)");
                    boolean success = false;
                    while (true)
                    {
                            System.out.println("CODE: "); 
                            String input = in.next();
                            if (input.equalsIgnoreCase("XX"))
                            {
                                    takeXX();
                                    break;
                            }
                            for(int i = 0 ; i< stuff.length;i++)
                            {
                                if(input.equalsIgnoreCase(stuff[i].pid))
                                {   success = true;
                                    stuff[i].getorderQuantity();}
                                
                                if(success==false && i==stuff.length - 1)
                                {
                                    System.out.println("You have entered an invalid code. Please try again.");
                                }
                            }
                    
                    }
        end n = new end();
        n.endcase();
        in.nextLine();
        while (true)
	{
	    System.out.print("> ");
	    String nextpls = in.nextLine();
            if (nextpls.equalsIgnoreCase("no") || nextpls.equalsIgnoreCase("n"))
            {
                n.endNo();
                breaker = false;
                break;
            }
            else if (nextpls.equalsIgnoreCase("yes") || nextpls.equalsIgnoreCase("y"))
            {
                n.endYes();
                break;
            }
            else
            {
                System.out.println("\nInvalid response. Please try again.");
            }
                
        }
            
    }
}
}