import java.util.*;
import java.io.*;

public class customer
{
    public String fullname;
    public String saddress;
    public String bnumber;
    public String state;
    public String pcode;
    
    public customer()
    {
        
    }
    
    public String fullname()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        System.out.print("> ");
        fullname = in.nextLine();
        return fullname;
    }
    
    public String address1()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your Street address: ");
        System.out.print("> ");
        saddress = in.nextLine();
        return saddress;
    }
    
    public String address2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your House or Apartment number:");
        System.out.print("> ");
        bnumber = in.nextLine();
        return bnumber;
    }
    
    public String state()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your State of residence: ");
        System.out.print("> ");
        state = in.nextLine();
        return state;
    }
    
    public String pcode()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your postal code: ");
        System.out.print("> ");
        pcode = in.nextLine();
        return pcode;
    }
    
    public void billinfo()
    {
        fullname();
        address1();
        address2();
        state();
        pcode();
    }
    
    public void displayCustInfo()
    {
        System.out.println("PLACE YOUR ORDER!");
        System.out.println("NAME: " + fullname);
        System.out.println("ADDRESS-1: " + saddress);
        System.out.println("ADDRESS-2: " + bnumber);
        System.out.println("ADDRESS-3: " + state);
        System.out.println("POST CODE: " + pcode);
       
    }
    
    public void invoiceCustomer()
    {
        System.out.println(fullname);
        System.out.println(saddress);
        System.out.println(bnumber);
        System.out.println(state + "	POST CODE: " + pcode);
        System.out.println();
       
    }
    
    public String invoiceCustomerfile()
    {
        String detail = fullname + "\n" + saddress + "\n" + bnumber + "\n" + state + "	POST CODE: " + pcode;
        return detail;
       
    }
}
