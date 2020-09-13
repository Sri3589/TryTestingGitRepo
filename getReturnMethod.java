public class ReturnMethod
{
	int a = 90;

	void getReturn(int a)
	{	
	   System.out.println("I am going to call show method now!!!"); // 2
	   ReturnMethod obj = new ReturnMethod();
	   obj.getShow(); 		
	}

	void getShow()
	{
	   System.out.println("This is Show Method"); //3
	}
        
	public static void main(String[]args)
	{
	   System.out.println("I am main method & I am going to printout return value of getReturn"); // 1
	   ReturnMethod obj = new ReturnMethod();	
	   obj.getReturn(100);
	   System.out.println("Value of getReturn(): " + a); // 4
	}

}