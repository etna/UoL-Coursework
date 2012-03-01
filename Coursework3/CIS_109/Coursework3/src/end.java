import java.util.*;
import java.io.*;

public class end
{    
    public boolean endNo()
    {
        System.out.println("\nThank you for shopping with us. The program will now terminate."); 
        return false;
    }
    
    public boolean endYes()
    {
        return true;
    }
    
    public void endcase()
    {
        order o = new order();        
        Scanner in = new Scanner(System.in);
        System.out.println("\nIs there another customer waiting to perform a transaction on this machine?");
        System.out.print("Enter N for no, or Y or yes, (followed by the 'Enter key') to proceed.");
    }
}