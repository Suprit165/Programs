import java.util.Iterator;
import java.util.Scanner;

public class Day28 {
	
	static int[] productArrays(int[] a)
	{
		int p = 1;
		for (int i = 0; i < a.length; i++) 
		{
			p = p * a[i];
		}
		
		int[] res = new int[a.length];
		
		for (int i = 0; i < res.length; i++) 
		{
			res[i] = p / a[i];
		}
		return res;
	}
	
	
	
	static int countElement(int[] a, int k)
	{
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if( a[i] == k)
			{
				count++;
			}
			
		}
		return count;
	}
	
	// maximum number occurs in an array
	static int maxValue(int[] a)
	{
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if( a[i] > max)
			{
				max = a[i];
			}
			
		}
		return max;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		
		// User Input
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();
		}
//		
//		int sum = arrays.sum(a);
//		int max = arrays.max(a);
//		int min = arrays.min(a);
//		
//		System.out.println(sum - max);
//		System.out.println(sum - min);
		
		// User Input
//		int k = scan.nextInt();
		
		

		int result = maxValue(a);
//		for (int i = 0; i < result.length; i++) 
//		{
//			System.out.println(result[i] + " ");
//		}
		System.out.println(result);
		
}
}