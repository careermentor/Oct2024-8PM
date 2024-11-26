package oopsConcept;

public class T1Class extends DemoAbsClass
{

	
	public void m2() 
	{
		System.out.println("Tester1 credential");
		
	}

	public static void main(String[] args)
	{
		T1Class t1 = new T1Class();
		t1.m1();
		t1.m2();
	}
	
	
}
