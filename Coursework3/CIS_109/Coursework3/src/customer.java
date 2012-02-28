import java.util.*;
import java.io.*;

public class customer
{
    public String name;
    public String address1;
    public String address2;
    public String state;
    public String postcode;
    
    public customer()
    {
        
    }
    
    public String fullname()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        System.out.println("'\'> ");
        String fullname = in.nextLine();
        return fullname;
    }
    
    public String address1()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your Street address: ");
        System.out.println("'\'> ");
        String saddress = in.nextLine();
        return saddress;
    }
    
    public String address2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your House or Apartment number:");
        System.out.println("'\'> ");
        String bnumber = in.nextLine();
        return bnumber;
    }
    
    public String state()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your State of residence: ");
        System.out.println("'\'> ");
        String state = in.nextLine();
        return state;
    }
    
    public String pcode()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your postal code: ");
        System.out.println("'\'> ");
        String pcode = in.nextLine();
        return pcode;
    }
    
    public void billinfo()
    {
        customer a = new customer ();
        a.fullname();
        
    }
}
