
// Constructor Chaining

class CusHolder
{
	private int cId;
	private String cName;
	private long cNum;
	
	public CusHolder()
	{
		cId = 1;
		cName = "Arul";
		cNum = 123456789L
	}
	
	public CusHolder(int cId, String cName, long cNum)
	{
		this();
		this.cId = cId;
		this.cName = cName;
		this.cNum = cNum;
	}
	
	public void setData(int cId, String cName, long cNum)
	{
		this();
		this.cId = cId;
		this.cName = cName;
		this.cNum = cNum;
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
public class Day60 {

	public static void main(String[] args) {

		CusHolder c1 = new CusHolder(2, "Alex", 123456789L);
		
//		c.setData(1, "Arul", 123456789);
		System.out.println(c1.getcId());
		System.out.println(c1.getcName());
		System.out.println(c1.getcNum());
		
//		CusHolder c2 = new CusHolder();
//		
//		System.out.println(c2.getcId());
//		System.out.println(c2.getcName());
//		System.out.println(c2.getcNum());
		
	}

}
