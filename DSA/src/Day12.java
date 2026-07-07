
public class Day12 {

	public static void main(String[] args) {

		
		int n = 36;
//		int i = 3;/
		int i = 5;
		
//		int onMask = 1 << i;
//		System.out.println(n | onMask);
		
//		int offMask = ~(1 << i);
//		System.out.println(n & offMask);
		
		
//		int tmask = 1 << i;
//		System.out.println(n ^ tmask);
		
		int cmask = 1 << i;
		
		if ((n & cmask) == 0)  
		{
			System.out.println("OFF");
		} 
		else 
		{
			System.out.println("ON");
		}
		
		
		
		
	}

}
