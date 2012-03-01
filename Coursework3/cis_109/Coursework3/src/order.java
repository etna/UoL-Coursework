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
        customer a = new customer();
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
    
    public void getK16()
    {
        System.out.println("QUANTITY: ");
        stuff[0].orderquantity = stuff[0].orderquantity + in.nextInt();
        {
            while (stuff[0].orderquantity > 100 || stuff[0].orderquantity < 0)
             {
                System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                System.out.println("QUANTITY: ");
                stuff[0].orderquantity = 0;
                stuff[0].orderquantity = stuff[0].orderquantity + in.nextInt();                            
             }
                stuff[0].totalweight = stuff[0].orderquantity * stuff[0].weight;
                stuff[0].totalcost = stuff[0].orderquantity * stuff[0].cost;
        }
    }
        
    public void getD24()
    {
        System.out.println("QUANTITY: ");
        stuff[1].orderquantity = stuff[1].orderquantity + in.nextInt();
            {
                while (stuff[1].orderquantity > 100 || stuff[1].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[1].orderquantity = 0;
                        stuff[1].orderquantity = stuff[1].orderquantity + in.nextInt();                            
                    }
                stuff[1].totalweight = stuff[1].orderquantity * stuff[1].weight;
		stuff[1].totalcost = stuff[1].orderquantity * stuff[1].cost;
            }
    }
       
    public void getM93()
    {
        System.out.println("QUANTITY: ");
        stuff[2].orderquantity = stuff[2].orderquantity + in.nextInt();
            {
                while (stuff[2].orderquantity > 100 || stuff[2].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[2].orderquantity = 0;
                        stuff[2].orderquantity = stuff[2].orderquantity + in.nextInt();                            
                    }
                stuff[2].totalweight = stuff[2].orderquantity * stuff[2].weight;
		stuff[2].totalcost = stuff[2].orderquantity * stuff[2].cost;
            }
    }
       
    public void getM94()
    {
        System.out.println("QUANTITY: ");
        stuff[3].orderquantity = stuff[3].orderquantity + in.nextInt();
            {
                while (stuff[3].orderquantity > 100 || stuff[3].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[3].orderquantity = 0;
                        stuff[3].orderquantity = stuff[3].orderquantity + in.nextInt();                            
                    }
                stuff[3].totalweight = stuff[3].orderquantity * stuff[3].weight;
		stuff[3].totalcost = stuff[3].orderquantity * stuff[3].cost;
            }
    }
     
    public void getN1C()
    {
        System.out.println("QUANTITY: ");
        stuff[4].orderquantity = stuff[4].orderquantity + in.nextInt();
            {
                while (stuff[4].orderquantity > 100 || stuff[4].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[4].orderquantity = 0;
                        stuff[4].orderquantity = stuff[4].orderquantity + in.nextInt();                            
                    }
                stuff[4].totalweight = stuff[4].orderquantity * stuff[4].weight;
		stuff[4].totalcost = stuff[4].orderquantity * stuff[4].cost;
            }
    }
    
    public void getN25()
    {
        System.out.println("QUANTITY: ");
        stuff[5].orderquantity = stuff[5].orderquantity + in.nextInt();
            {
                while (stuff[5].orderquantity > 100 || stuff[5].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[5].orderquantity = 0;
                        stuff[5].orderquantity = stuff[5].orderquantity + in.nextInt();                            
                    }
                stuff[5].totalweight = stuff[5].orderquantity * stuff[5].weight;
		stuff[5].totalcost = stuff[5].orderquantity * stuff[5].cost;
            }
    }
     
    public void getNF1()
    {
        System.out.println("QUANTITY: ");
        stuff[6].orderquantity = stuff[6].orderquantity + in.nextInt();
            {
                while (stuff[6].orderquantity > 100 || stuff[6].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[6].orderquantity = 0;
                        stuff[6].orderquantity = stuff[6].orderquantity + in.nextInt();                            
                    }
                stuff[6].totalweight = stuff[6].orderquantity * stuff[6].weight;
		stuff[6].totalcost = stuff[6].orderquantity * stuff[6].cost;
            }
    }
    
    public void getH11()
    {
        System.out.println("QUANTITY: ");
        stuff[7].orderquantity = stuff[7].orderquantity + in.nextInt();
            {
                while (stuff[7].orderquantity > 100 || stuff[7].orderquantity < 0)
                    {
                        System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                        System.out.println("QUANTITY: ");
                        stuff[7].orderquantity = 0;
                        stuff[7].orderquantity = stuff[7].orderquantity + in.nextInt();                            
                    }
                stuff[7].totalweight = stuff[7].orderquantity * stuff[7].weight;
		stuff[7].totalcost = stuff[7].orderquantity * stuff[7].cost;
            }
    }
       
    public void getA12()
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
		    customer a = new customer();
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
                {
                    while (true)
                        {
                            System.out.println("CODE: "); 
                            String input = in.next();
                            {
                                if (input.equalsIgnoreCase(stuff[0].pid))
                                {
                                    getK16();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[1].pid))
                                {
                                    getD24();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[2].pid))
                                {
                                    getM93();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[3].pid))
                                {
                                    getM94();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[4].pid))
                                {
                                    getN1C();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[5].pid))
                                {
                                    getN25();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[6].pid))
                                {
                                    getNF1();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[7].pid))
                                {
                                    getH11();
                                }
                                
                                else if (input.equalsIgnoreCase(stuff[8].pid))
                                {
                                    getA12();
                                }
                                
                                else if (input.equalsIgnoreCase("XX"))
                                {
                                    takeXX();
                                    break;
                                }
                                
                                else
                                {
                                    System.out.println("You have entered an invalid code. Please try again.");
                                }
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