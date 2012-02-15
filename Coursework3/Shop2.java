import java.util.*;
import java.text.*;

public class Shop2
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	DecimalFormat f = new DecimalFormat("0.00");
	String code[] = new String[9];//this code block contains the item code numbers for the available products
	code[0] = "K16";
	code[1] = "D24";
	code[2] = "M93";
	code[3] = "M94";
	code[4] = "N1C";
	code[5] = "N25";
	code[6] = "NF1";
	code[7] = "H11";
	code[8] = "A12";
	
	String desc[] = new String[9]; //this code block contains the item descriptions arranged via a String array
	desc[0] = "\tWood screws, brass, 20mm, pack of 50     ";
	desc[1] = "\tWood glue, clear, 1 litre                ";
	desc[2] = "\tSandpaper, medium grade, 100 sheets      ";
	desc[3] = "\tSandpaper, fine grade, 100 sheets        ";
	desc[4] = "\tNailgun, consumer, 1 unit                ";
	desc[5] = "\tNails, steel, 20mm, pack of 50	         ";
	desc[6] = "\tNailgun feeder, 1 unit                   ";
	desc[7] = "\tHammer, rounded, 1 unit                  ";
	desc[8] = "\tAxe, double-sided, 1 unit                ";
	
	double cost[] = new double[9]; //this code block contains the cost of the items in cents, arranged with a double array
	cost[0] = 775;
	cost[1] = 550;
	cost[2] = 1025;
	cost[3] = 1475;
	cost[4] = 9999;
	cost[5] = 975;
	cost[6] = 2500;
	cost[7] = 3100;
	cost[8] = 5500;
	
	double tcost[] = new double[9]; // this code block houses the bill the customer is expected to pay for the products in the form of a double array (double because we need the decimal places
	
	int quantity[] = new int[9];//this code block contains the quantity of each item which the consumer intends to purchase.
	
	int weight[] = new int[9];//this code block houses the weight of the respective items
	weight[0] = 150;
	weight[1] = 450;
	weight[2] = 125;
	weight[3] = 125;
	weight[4] = 2500;
	weight[5] = 250;
	weight[6] = 100;
	weight[7] = 1550;
	weight[8] = 1875;
	
	int tweight[] = new int[9];//this code block houses the TOTAL weight of each item purchased by the customer in the form of an array
	
	String billinfo[] = new String[5];
        String nextpls = "";
	
	double ttcost = 0;
	double VAT = 20;
	double ship = 100;
	double shipcost = 0;
	int ttweight = 0;
	int units = 0;
	int check = 0;
	
	boolean termination = false;
        
	System.out.println("     HARDWARE ITEMS");
	System.out.println("\nCODE         DESCRIPTION                         WEIGHT(g)    UNIT PRICE     ");
	for (int a = 1; a <= 9; a = a + 1)
	{
	    System.out.println(code[a-1] + desc[a-1] + weight[a-1] + "\t      $" + f.format(cost[a-1] / 100));
	}
	
        {   
        boolean abc = true;
	    while (abc == true) //We use a 'while' loop here because the eventual goal is to loop the entire name input + code input sequence for as many times as needed until the user terminates the sequence.
        {
		/* Here, we reset all the interger values stored in the various arrays to zero in order to ensure that the user always starts with a clean slate when the whole loop sequnce is initialized */
		{
		for (int r = 1; r <= 9; r = r + 1)
	{
	    quantity[r-1] = 0;
	    tweight[r-1] = 0;
	    tcost [r-1] = 0;
	}
		}
	System.out.println("\nPlease enter your Name:");
        System.out.print("NAME:> ");
	billinfo[0] = in.nextLine();
	System.out.println("\nPlease enter your House or Apartment number:");
	System.out.print("HOUSE / APARTMENT NUMBER:> ");
	billinfo[1] = in.nextLine();
	System.out.println("\nPlease enter your Street address:");
	System.out.print("STREET ADDRESS:> ");
	billinfo[2] = in.nextLine();
	System.out.println("\nPlease enter the State you are residing int:");
	System.out.print("STATE:> ");
	billinfo[3] = in.nextLine();
	System.out.println("\nPlease enter your postal code:");
	System.out.print("POSTAL CODE:> ");
	billinfo[4] = in.nextLine();
	
	System.out.println("\nPLACE YOUR ORDER!");
	System.out.println("NAME: " + billinfo[0]);
	System.out.println("ADDRESS-1: " + billinfo[1]);
	System.out.println("ADDRESS-2: " + billinfo[2]);
	System.out.println("ADDRESS-3: " + billinfo[3]);
	System.out.println("POST CODE: " + billinfo[4]);
	
	System.out.println("\nENTER CODE: (XX to Stop)");
        {
	while (true)
        {
            System.out.println("CODE: "); 
            String input = in.next();
	    {   
                if (input.equalsIgnoreCase(code[0]))
                {
                    System.out.println("QUANTITY: ");
                    quantity[0] = quantity[0] + in.nextInt();
                    {
                        while (quantity[0] > 100 || quantity[0] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[0] = 0;
                            quantity[0] = quantity[0] + in.nextInt();                            
                        }
                        tweight[0] = quantity[0] * weight[0];
			tcost[0] = quantity[0] * cost[0];
                    }
                }
                
                else if (input.equalsIgnoreCase(code[1]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[1] = quantity[1] + in.nextInt();
		    {
                        while (quantity[1] > 100 || quantity[1] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[1] = 0;
                            quantity[1] = quantity[1] + in.nextInt();
                        }
			    tweight[1] = quantity[1] * weight[1];
			    tcost[1] = quantity[1] * cost[1];
		    }
                }

                
                else if (input.equalsIgnoreCase(code[2]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[2] = quantity[2] + in.nextInt();
                    {
                        while (quantity[2] > 100 || quantity[2] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[2] = 0;
                            quantity[2] = quantity[2] + in.nextInt();
                        }
                        tweight[2] = quantity[2] * weight[2];
			tcost[2] = quantity[2] * cost[2];
                    }
                }
                
                else if (input.equalsIgnoreCase(code[3]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[3] = quantity[3] + in.nextInt();
                    {
                        while (quantity[3] > 100 || quantity[3] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[3] = 0;
                            quantity[3] = quantity[3] + in.nextInt();
                        }
                        tweight[3] = quantity[3] * weight[3];
			tcost[3] = quantity[3] * cost[3];
                    }
                }
                
                else if (input.equalsIgnoreCase(code[4]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[4] = quantity[4] + in.nextInt();
                    {
                        while (quantity[4] > 100 || quantity[4] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[4] = 0;
                            quantity[4] = quantity[4] + in.nextInt();
                        }
                        tweight[4] = quantity[4] * weight[4];
			tcost[4] = quantity[4] * cost[4];
                    }
                }
                
                else if (input.equalsIgnoreCase(code[5]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[5] = quantity[5] + in.nextInt();
                    {
                        while (quantity[5] > 100 || quantity[5] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[5] = 0;
                            quantity[5] = quantity[5] + in.nextInt();
                        }
                        tweight[5] = quantity[5] * weight[5];
			tcost[5] = quantity[5] * cost[5];
                    }
                }
                
                else if (input.equalsIgnoreCase(code[6]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[6] = quantity[6] + in.nextInt();
                    {
                        while (quantity[6] > 100 || quantity[6] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[6] = 0;
                            quantity[6] = quantity[6] + in.nextInt();
                        }
                        tweight[6] = quantity[6] * weight[6];
			tcost[6] = quantity[6] * cost[6];
                    }
                }
                
                else if (input.equalsIgnoreCase(code[7]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[7] = quantity[7] + in.nextInt();
                    {
                        while (quantity[7] > 100 || quantity[7] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[7] = 0;
                            quantity[7] = quantity[7] + in.nextInt();
                        }
                        tweight[7] = quantity[7] * weight[7];
			tcost[7] = quantity[7] * cost[7];
                    }
                }
                
                else if (input.equalsIgnoreCase(code[8]))
		{
		    System.out.println("QUANTITY: ");
                    quantity[8] = quantity[8] + in.nextInt();
                    {
                        while (quantity[8] > 100 || quantity[8] < 0)
                        {
                            System.out.println("Sorry, your total quantity for this product has exceeded 100 or is less than 0. Please re-enter the quantity again: ");
                            System.out.println("QUANTITY: ");
                            quantity[8] = 0;
                            quantity[8] = quantity[8] + in.nextInt();
                        }
                        tweight[8] = quantity[8] * weight[8];
			tcost[8] = quantity[8] * cost[8];
                    }
                }
                
                else if (input.equalsIgnoreCase("XX"))
		{
		    int tquantity = 0;
		    for (int z = 1; z <= 9; z = z + 1)
		    {
			tquantity = tquantity + quantity[z-1];
		    }
			
		    if (tquantity == 0)
		    {
			    System.out.println("You have ended your session without ordering anything.");
			    break;
			}
			
		else
		{
			    System.out.println("\nINVOICE FOR ORDER:");
		    for (int b = 1; b <= 3; b = b + 1)
		    {
			System.out.println(billinfo[b - 1]);
		    }
		    System.out.println(billinfo[3] + "	POST CODE: " + billinfo[4]);
		    System.out.println();
		    ttcost = 0;
		    ttweight = 0;
		    units = 0;
		    for (int i = 1; i <= 9; i = i + 1)
		    {
			if (quantity[i-1] > 0)
			    System.out.println(code[i-1] + desc[i-1] + "\t" + quantity[i-1] + " @  $" + f.format(cost[i-1] / 100) + "\t  $" + f.format(tcost[i-1] / 100)+ "    " + "\t" + tweight[i-1] + "g");
			ttcost = ttcost + tcost[i-1];
			ttweight = ttweight + tweight[i-1];
		    }
		    units = ttweight / 250;
		    check = ttweight % 250;
		    {
			if (check != 0)
			    units = units + 1;
		    }
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
                    break;
		}
		    }
		else
		{
		    System.out.println("You have entered an invalid code. Please try again.");
		}
	    }
	}
	System.out.println("\nIs there another customer waiting to perform a transaction on this machine?");
        System.out.print("Enter N for no, or Y or yes, (followed by the 'Enter key') to proceed.");
	in.nextLine();
        while (true)
	{
	    System.out.print("> ");
	    nextpls = in.nextLine();
		if (nextpls.equalsIgnoreCase("no") || nextpls.equalsIgnoreCase("n"))
        {        
            System.out.println("\nThank you for shopping with us. The program will now terminate.");   
	    abc = false;
	    break;
        }
	else if (nextpls.equalsIgnoreCase("yes") || nextpls.equalsIgnoreCase("y"))
	{
	    abc = true;
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
}
}