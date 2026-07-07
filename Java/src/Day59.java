
//Encapsulation
//#1
class BankAccount
{
	private int bal;
	
	public void setData(int x)
	{
		if (x >= 0) 
		{
			bal = x;
		} 
		else 
		{
			System.out.println("Balance cannot be -ve");
			System.exit(0);
		}
	}
	
	public int getData()
	{
		return bal;
	}
}

// #2
class Customer
{
	private int cId;
	private String cName;
	private long cNum;
	
	
	public void setData(int x, String y, long z)
	{
		cId = x;
		cName = y;
		cNum = z;
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





public class Day59 {

	public static void main(String[] args) {

//		#1
//		BankAccount ba = new BankAccount();
//		ba.bal = 1000;
//		System.out.println(ba.bal);
//		ba.setData(-1000);
//		System.out.println(ba.getData());
		
//		#2
		Customer c = new Customer();
//		c.cId = 1;
//		c.cName = "Arul";
//		c.cNum = 123456789;
	
//		c.setData(1, "Arul", 123456789);
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
		
	}

}
