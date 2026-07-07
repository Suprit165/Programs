import java.util.Scanner;

class BusinessMan
{
	private float p;
	private float t;
//	private float r;
	private float si;
	static private float r;
	
	static 
	{
		r = 12.5f;
	}
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the loan amt");
		p = scan.nextFloat();
		System.out.println("Enter the tenure");
		t = scan.nextFloat();
		
	}
	
	public void calcInterest()
	{
		si = (p*t*r)/100;
	}
	
	public void disp()
	{
		System.out.println(si);
	}
	
	
}


public class Day62 {

	public static void main(String[] args) {

		BusinessMan b1 = new BusinessMan();
		b1.acceptInput();
		b1.calcInterest();
		b1.disp();
		
		BusinessMan b2 = new BusinessMan();
		b2.acceptInput();
		b2.calcInterest();
		b2.disp();
		
		BusinessMan b3 = new BusinessMan();
		b3.acceptInput();
		b3.calcInterest();
		b3.disp();
		
	}

}
