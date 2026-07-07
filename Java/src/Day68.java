
//class Parent
//{
//	Plane fun()
//	{
//		System.out.println("Inside parent class fun()");
//		Plane p = new Plane();
//		return p;
//	}
//}
//
//class Child extends Parent
//{
//	CargoPlane fun()
//	{
//		System.out.println("Inside child class fun()");
//		CargoPlane cp = new CargoPlane();
//		return cp;
//	}
//}

class Charger
{
	private String name;
	private float voltage;
	public Charger(String name, float voltage) {
		super();
		this.name = name;
		this.voltage = voltage;
	}
	
	public String getName() {
		return name;
	}
	
	public float getVoltage() {
		return voltage;
	}
	
}

class OS
{
	private String name;
	private int size;
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
}

class Mobile
{
	OS os = new OS("Android" , 512);
	
	void hasA(Charger d)
	{
		System.out.println(d.getName());
		System.out.println(d.getVoltage());
	}
}























public class Day68 {

	public static void main(String[] args) {

//		Child c = new Child();
//		c.fun();
		
		Charger c = new Charger("Oneplus" ,45.5f);
		
		Mobile m = new Mobile();
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		m.hasA(c);
		
		m = null;
		
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getSize());
//		
//		m.hasA(c);
		
		System.out.println(c.getName());
		System.out.println(c.getVoltage());
	}

}
