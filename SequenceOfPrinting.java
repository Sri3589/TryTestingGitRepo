/**
 * Trying to work on sequence of prinitng of variables.
 * @author sri
 * Lets see if this updated in git
 */
public class SequenceOfPrinting
{
	int a = 10;
	int b = 59;
	

	void nonParameter()
	{
	  System.out.println("");
	  System.out.println("Hi Git");
	  //I am updating code from here
	  System.out.println("MyGiT UPDATED");
	  System.out.println("HeyGit Love You!!");
	  System.out.println("MyGiT UPDATED");
	  System.out.println("Execute Method 1");
	  System.out.println("Value of b: " + b);	
      System.out.println("End of Method 1");
	  System.out.println("                    ");

	}
	
	void parameterized(int b, String s)
	{

	   // Precedence is for local variables. It wont pick instance variable values for a & b.
	   int a = 24;
	   System.out.println("Execute Method 2"); 
	   System.out.println("Print a value - a " + a);
	   System.out.println("Print a value - b " + b);
	   System.out.println("Print a value - s " + s);
	   System.out.println("End of Method 2");
           System.out.println("                    ");
	}
	
	public static void main(String[]args)
	{
	   SequenceOfPrinting obj = new SequenceOfPrinting();
	   obj.nonParameter();
	   obj.parameterized(30, "Hello ra Arey!!!");
	}

}