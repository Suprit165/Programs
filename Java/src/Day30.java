import java.util.Scanner;

import sun.awt.image.IntegerInterleavedRaster;

public class Day30 {
	
	static int secondLargest(int[] a)
	{
		// FirstLargest 
		int p = a[0];
		// SecondLargest
		int vp = Integer.MIN_VALUE;
		
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > p)
			{
				vp = p;
				p = a[i];
			}
			else if(a[i] > vp)
			{
				vp = a[i];
			}
		}
		return vp;
	}
	
	
	static int maxPairSum(int[] a)
	{
		int firstLargest = a[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) 
		{
			if( a[i] > firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = a[i];
			}
			else if( a[i] > secondLargest  )
			{
				secondLargest = a[i];
			}
		}
		return firstLargest + secondLargest;
	}
	
	
	static int minPairSum(int[] a)
	{
		int firstSmallest = a[0];
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 1; i < a.length; i++) 
		{
			if( a[i] < firstSmallest)
			{
				secondSmallest = firstSmallest;
				firstSmallest = a[i];
			}
			else if( a[i] < secondSmallest)
			{
				secondSmallest = a[i];
			}
		}
		return firstSmallest + secondSmallest;
	}
	
	
	static int maxPairProduct(int[] a)
	{
		int firstLargest = a[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 1; i < a.length; i++) 
		{
			if( a[i] > firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = a[i];
			}
			else if( a[i] > secondLargest)
			{
				secondLargest = a[i];
			}
		}
	
		int firstSmallest = a[0];
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 1; i < a.length; i++) 
		{
			if( a[i] < firstSmallest)
			{
				secondSmallest = firstSmallest;
				firstSmallest = a[i];
			}
			else if( a[i] < secondSmallest)
			{
				secondSmallest = a[i];
			}
		}
		
		 int p1 = firstLargest * secondLargest;
		 int p2 = firstSmallest * secondSmallest;
		 int p3 = firstSmallest * firstLargest;
		
		return p1<p2 ? p1 :p2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();			
		}
		
		int res = maxPairProduct(a);
		System.out.println(res);

}
}