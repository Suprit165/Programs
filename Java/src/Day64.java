
// #1
class BHolder
{
	private int accNum = 123456;
	private int pin = 9999;
	
	public BHolder()
	{
//		accNum = 123456;
//		pin = 9999;
		System.out.println("Parent class constructor");
	}
}
class Hacker extends BHolder
{
//	void disp()
//	{
//		System.out.println(accNum);
//		System.out.println(pin);
//	}
//	
//	void changeData()
//	{
//		accNum = 987654;
//		pin = 8888;
//	}
	
	public Hacker()
	{
		System.out.println("child class constructor");
	}
}


// #2
//class Trail extends Demo2
//{
//	void fun1()
//	{
//		System.out.println("Java");
//	}
//}
//
//class Demo2 extends Trail
//{
//	void fun2()
//	{
//		System.out.println("Python");
//	}
//}
//
//class Demo3 extends Demo2
//{
//	void fun3()
//	{
//		System.out.println("Javascript");
//	}
//}

























public class Day64 {

	public static void main(String[] args) {

		Hacker h = new Hacker();
//		h.disp();
//		h.changeData();
//		h.disp();
		
		
		
//		Demo3 d3 = new Demo3();
//		d3.fun1();
//		d3.fun2();
//		d3.fun3();
//		
	}

}
