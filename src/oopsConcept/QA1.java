package oopsConcept;

public  class QA1
{
	int x = 500;
	
	public void printVal()
	{
		int x = 600;
		System.out.println(x); //600
		System.out.println(this.x);
	}
	
	
	
	public  void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a&b&c: " + d);
	}

	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		main(10);
	}
	
	public static void main(int a) 
	{
	
		int b = a*a;
		System.out.println(b);
		
		DemoStaticMethod.printX();
	}

}
