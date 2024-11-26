package demoPkg;

public class Calculations 
{
	
	
	
	public Calculations(int a)
	{
		int c = a+a;
		System.out.println("Constructor has sum of 2 numbers: " +c);
	}
	
	public String addition()
	{
		int a=20;
		int b = 30;
		int c = a+b;
		
		int d = 20;
		
		String e = "Java";
		
		System.out.println("addition of 2 numbers: " + c); //50
		return e;
	}
	
	public int sum(int a, int b)
	{	
		int c = a+b;
		
		System.out.println("sum of 2 numbers: " + c);
		return c;
	}
	
	//20+30+40
	//int x = 20+30
	//x+40
	
	public static void main(String[] args)
	{
	
		Calculations cal = new Calculations(20);  //const automatically getting called
		
		Calculations cal1 = new Calculations(10);
		
		cal.addition();
		
		cal1.sum(30, 40);  //70
		//cal.sum(40, 50);  //90
		
		//int x = cal.sum(20, 30);
		//cal.sum(x, 40);
		
		//int y = cal.addition();
		//cal.sum(x, y);
		
		 
		//cal.sum(cal.addition(), 30);
		
		//System.out.println(cal.addition());
		
	}
	
}
