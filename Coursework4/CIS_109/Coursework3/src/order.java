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
    double VAT = 0; //must eventually substitute with filereader
    double ship = 0; //must eventually substitute with filereader
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
    
    public void shipAndtax()
    throws IOException
    {
        Scanner abs = new Scanner(new FileReader("addoncosts.txt"));
            while (abs.hasNext()) 
            {
                    VAT = Double.parseDouble(abs.nextLine());
                    ship = Double.parseDouble(abs.nextLine());
                }
            abs.close();
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
        
    
    public void takeXX()
            throws IOException
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
                        writeInvoice();
                        takeInvoice();
                        
                        
                    }
    }
      
    public void takeNothing()
		    {
			    System.out.println("You have ended your session without ordering anything.");
                    }
    
    public void writeInvoice()
            throws IOException
		{
                    DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
                    Date thedate = new Date();
                    String filename = "Invoice_" + dateFormat.format(thedate) + ".txt";
                    FileWriter write = new FileWriter(filename, true);
                    PrintWriter printer = new PrintWriter(write);
                    printer.println("\nINVOICE FOR ORDER:");
                    printer.println(a.invoiceCustomerfile());
		    ttcost = 0;
		    ttweight = 0;
		    units = 0;
		    for (int i = 1; i <= 9; i = i + 1)
		    {
			if (stuff[i-1].orderquantity > 0)
                        {
                        printer.println(stuff[i-1].pid + "\t" + stuff[i-1].pdesc + "\t" + stuff[i-1].orderquantity + " @  $" + f.format(stuff[i-1].cost / 100) + "\t  $" + f.format(stuff[i-1].totalcost / 100)+ "    " + "\t" + stuff[i-1].totalweight + "g");
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
		    printer.println("\t\t\t\t\t\t\t\t\t\t Total: $" + f.format(ttcost));
		    printer.println("\t\tSHIPPING: " + ttweight + "g @ $1.00 per 250g" + "\t\t\t\t\t\t$" + f.format(shipcost));
		    printer.println("\t\t\t\t\t\t\t\t  TOTAL INCL. SHIPPING: $" + f.format(tbt));
		    printer.println("\t\t\t\t\t\t\t\t  VAT at 20%" + "\t\t$" + f.format(tax));
		    printer.printf("\t\t\t\t\t\t\t\t\t  TOTAL TO PAY: $" + f.format(tft));
                    printer.close();
		}
                        
                    }
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
                        }
		    ttcost = ttcost / 100;
		    shipcost = (units * ship) / 100;
		    double tbt = ttcost + shipcost;
		    double tax = tbt * (VAT / 100);
		    double tft = tbt + tax;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t Total: $" + f.format(ttcost));
		    System.out.println("\t\tSHIPPING: " + ttweight + "g @ $1.00 per 250g" + "\t\t\t\t\t\t$" + f.format(shipcost));
		    System.out.println("\t\t\t\t\t\t\t\t  TOTAL INCL. SHIPPING: $" + f.format(tbt));
		    System.out.println("\t\t\t\t\t\t\t\t  VAT at 20%" + "\t\t$" + f.format(tax));
		    System.out.println("\t\t\t\t\t\t\t\t\t  TOTAL TO PAY: $" + f.format(tft));
                    System.out.println("\n A copy of this invoice has been printed.");
		}
                    }
                
    
    public void startOrder()
            throws IOException
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