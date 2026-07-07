
// #1
//class Test1
//{
//	int x, y;
//	
//	Test1()
//	{
//		x = 100;
//		y = 200;
//	}
//	
//	Test1(int x, int y)
//	{
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class Test2 extends Test1
//{
//	int a, b;
//	
//	Test2()
//	{
//		a = 300;
//		b = 400;
//	}
//		
//	Test2(int a, int b)
//	{
//		this.a = a;
//		this.b = b;
//	}
//		
//	void disp()
//	{
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(a);
//		System.out.println(b);
//	}
//}


// #2
//
//class Test1
//{
//	int x, y;
//	
//	Test1()
//	{
//		
//		System.out.println("0 - parameter of parent");
//		x = 100;
//		y = 200;
//	}
//	
//	Test1(int x, int y)
//	{
//		super();
//		System.out.println("parameter of parent");
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class Test2 extends Test1
//{
//	int a, b;
//	
//	Test2()
//	{
////		this(9,99);
//		System.out.println("0 - parameter of child");
//		a = 300;
//		b = 400;
//	}
//	
//	Test2(int a, int b)
//	{
//		super();
//		System.out.println("parameter of child");
//		this.a = a;
//		this.b = b;
//	}
//	
//	void disp()
//	{
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(a);
//		System.out.println(b);
//	}
//}

class OOP1
{
	int x = 100;
}

class OOP2 extends OOP1
{
	int x = 300;
	
	void disp()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}




public class Day65 {

	public static void main(String[] args) {

//		Test2 t2 = new Test2();
//		t2.disp();
		
		OOP2 o2 = new OOP2();
		o2.disp();
	}

}
