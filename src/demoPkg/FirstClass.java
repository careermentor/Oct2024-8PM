package demoPkg;

  public class FirstClass
{
	int a = 20;  //global variable

	
	public void printvalue()
	{
		final int a=10;  //local variable
		//a=30;
		float b = 10.5f;
		
		char c = 'X';
		String d = "Java";
		boolean e = true;
		
		System.out.println(a);  //10
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public void callVar()
	{
		System.out.println(a);  //20
	}
	
	public static void main(String[] args)
	{
		
		FirstClass abc = new FirstClass();  //abc is object of the class
		
		abc.printvalue();
		abc.callVar();
	}

}
