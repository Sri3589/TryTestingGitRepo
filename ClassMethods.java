class ClassMethods
{
	System.out.println("LetsTestGit!!!");
	System.out.println("Are You Sure?");
	void meth1()
	{
     	    System.out.println("Method1");
	}

	void meth2()
	{
	    System.out.println("Method2");
	}

	int meth3()
	{
	    System.out.println("Method3");
	    return 100;
	}

	public static void main(String[]args)
	{
		ClassMethods obj = new ClassMethods();
		obj.meth1();
		obj.meth2();
		int result = obj.meth3();
		System.out.println(result);
	}




}