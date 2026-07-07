import java.util.Iterator;
import java.util.Scanner;

public class Day39 {

	static void printConsecutiveSubarrays(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++) 
		{
			if(a[i+1] - a[i] == 1)
			{
				System.out.print(a[i] + " ");
			}
			else
			{
				System.out.print(a[i]);
				System.out.println();
			}
		}
		System.out.println(a[a.length - 1]);
	}
	
	static void printConsecutiveSubarraysCount(int[] a)
	{
		int count = 1;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i+1] - a[i] == 1)
			{
				count++;
				
			}
			else
			{
				System.out.println(count);
				count = 1;
			}
		}
		System.out.println(count);
	}
	
	static void printConsecutiveSubarraysMaxLength(int[] a)
	{
		int max = 0;
		int count = 1;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i+1] - a[i] == 1)
			{
				count++;
			}
			else
			{
//				System.out.println(count);
//				count = 1;
				
				if (count > max) 
				{
					max = count;
					ei = i;
				}
				count = 1;
			}
		}
//		System.out.println(count);
		
		if (count > max) 
		{
			max = count;
		}
		System.out.println(max);
	}
	
	static void printLongestSubarray(int[] a)
	{
		int max = 0;
		int count = 1;
		int si = 0;
		int ei = 0;
		
		for (int i = 0; i < a.length - 1; i++) 
		{
			if(a[i + 1] - a[i] == 1)
			{
				count++;
			}
			else
			{
				if((count > max))
				{
					max = count;
					ei = i;
				}
				
				count = 1;
			}
		}
		if(count > max)
		{
			max = count;
			ei = a.length - 1;
		}
		
		si = ei - max + 1;
		
		for (int i = si; i <= ei; i++) 
		{
			System.out.print(a[i] + " ");
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();
		}
		
//		printConsecutiveSubarraysCount(a);
		
//		printConsecutiveSubarraysLength(a);
		
		printLongestSubarray(a);
		
		
		
		
		
	}

}
