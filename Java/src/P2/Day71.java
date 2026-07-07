package P2;

class Parent
{
	final int x = 100;
	
	void disp() 
	{
		System.out.println(x);
		x= 200;
		System.out.println(x);
	}
}






public class Day71 {

	public static void main(String[] args) {

		
		Parent p = new Parent();
		p.disp();
	}

}
