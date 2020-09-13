public class Addition
{
    int num1 = 10;
    int num2 = 20; 

    void add()
    {
	System.out.println("number 1: " + num1);
	System.out.println("number 2: " + num2);
	int add = num1 + num2;
	System.out.println("Addition of numbers: Result : " + add);
    }

     public static void main(String[]args)
     {
	Addition obj = new Addition();
	obj.add();
     }

}