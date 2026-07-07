
class NewCustomer
{
	private int cId;
	private String cName;
	private long cNum;
	
	public NewCustomer()
	{
		cId = 1;
		cName = "Arul";
		cNum = 789456123;
	}
	
	public NewCustomer(String cName)
	{
		this();
		this.cName = cName;
	}
	
	public NewCustomer(int cId, String cName, long cNum)
	{
		this(cName);
	}
	
	public int getcId()
	{
		return cId;
	}
	
	public String getcName()
	{
		return cName;
	}
	
	public long getcNum()
	{
		return cNum;
	}
}

// #2

class Car
{
	String name;
	String getName;
	
	public Car()
	{
		name = "Kia";
	}
	
	public String getName()
	{
		return name;
	}
}

// # 3
class Test
{
	static int a, b;
	
	static
	{
		System.out.println("inside static block");
		a = 100;
		b = 200;
		x = 1000;
		y = 2000;
	}
	
	static void fun1()
	{
		System.out.println("inside static method");	
		x = 3000;
		y = 4000;
	}
	
	int x, y;
	
	{
		System.out.println("Inside instance block");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(x);
//		System.out.println(y);
	}
	
	void fun2()
	{
		System.out.println("Inside instance method");
	}
	
	Test()
	{
		System.out.println("Inside constructor");
		x = 9;
		y = 99;
	}
}







public class Day61 {

	public static void main(String[] args) {

//		NewCustomer c1 = new NewCustomer(1, "Alex", 9876554321L);
//		System.out.println(c1.getcId());
//		System.out.println(c1.getcName());
//		System.out.println(c1.getcNum());
		
//		# 2
//		Car c = new Car();
//		System.out.println(c.getName());
		
		Test.fun1();
		
		Test t = new Test();
		t.fun2();
	}

}
