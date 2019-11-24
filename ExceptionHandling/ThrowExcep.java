
class ThrowExcep
{
	static void fun()
	{
		try
		{
	ArrayIndexOutOfBoundsException obj=	new ArrayIndexOutOfBoundsException("demooo error");
			throw obj;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught inside fun().");
		throw e;
		}
	}

	public static void main(String args[]) throws InterruptedException
	{
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");

	}
	finally{
		System.out.println("Gauri mahan hai ...");
	}
	}
}
