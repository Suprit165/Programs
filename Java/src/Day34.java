import java.util.Scanner;

public class Day34 {
	
	static int findMissing(int[] a)
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i] - a[i+1] != -1)
			{
				return a[i] + 1;
			}
		}
		return a[a.length-1] + 1;
		
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		int[] a = new int[n];
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			a[i] = scan.nextInt();
//		}
//
//		
//		int res = findMissing(a);
//		System.out.println(res);
		
		int n = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) 
		{
			
			count = n * (n + 1)/2;
		}
		System.out.println(count);
		
	}

}
