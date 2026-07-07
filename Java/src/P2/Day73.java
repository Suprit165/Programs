package P2;

//interface Calculator1
//{
//	void add();
//}
//
//interface Calculator2 implements Calculator1
//{
//	void sub();
//}
//
//class MyCalc implements Calculator1,Calculator2
//{
//	public void add()
//	{
//		int a = 200;
//		int b = 100;
//		System.out.println(a+b);
//	}
//	
//	public void sub()
//	{
//		
//	}
//}


//interface Calculator1
//{
//	void add();
//}
//
//interface Calculator3
//{
//	void mul();
//}
//
//interface Calculator2 extends Calculator1,Calculator3
//{
//	void sub();
//}
//
//class MyCalc implements Calculator1,Calculator2
//{
//	public void add()
//	{
//		int a = 200;
//		int b = 100;
//		System.out.println(a+b);
//	}
//}


interface Calculator1
{
	void add();
	void sub();
}

class Calculato2
{
	void mul()
	{
		System.out.println(10*20);
	}
	
	void div()
	{
		System.out.println(20/10);
	}
}

class MyCalc extends Calculato2 implements Calculator1
{
	public void add()
	{
		int a = 200;
		int b = 100;
		System.out.println(a+b);
	}
	
	public void sub()
	{
		int a = 200;
		int b = 100;
		System.out.println(a-b);
	}
	
	public void mul()
	{
		int a = 200;
		int b = 100;
		System.out.println(a*b);
	}
	
	public void div()
	{
		int a = 200;
		int b = 100;
		System.out.println(a/b);
	}
}























public class Day73 {

	public static void main(String[] args) {

	}

}
