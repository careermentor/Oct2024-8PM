package oopsConcept;

public class QA2 extends QA1//implements QA1I
{
	
	
	int x = 100;
	
	public void printVal()
	{
		final int x = 200;
		//x=300;
		System.out.println(x); // 200
		
		System.out.println(this.x); //100
		
		System.out.println(super.x); //500
		
		super.sum(20, 30);
	}
	
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substracion of a&b: " + c);
	}

	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		//q2.sub(20, 30);

		//q2.sum(20, 30);
		
		
		//System.out.println(q2.x);
		
		q2.printVal();
		q2.sum(20, 30);
		
	}

	
	public void qa1im() {
		
		System.out.println("this is QA1I Method");
		
	}

}
