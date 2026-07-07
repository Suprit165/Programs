import java.util.Iterator;
import java.util.Scanner;

public class Day32 {

	static void printElementsCount(int[] a)
	{
		int count = 1;
		for (int i = 0; i < a.length-1; i++) 
		{
			if( a[i] == a[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i] +  "-" + count);
				count = 1;
			}
			
		}
		
		System.out.println( a[a.length-1] + "-" + count);
	}
	
	
	
	static void printElements(int[] a)
	{
		
		for (int i = 0; i < a.length-1; i++) 
		{
			if( a[i] != a[i+1])
			{
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.print( a[a.length-1]);
	}
	
	
	static void printUniqueElements(int[] a)
	{
		int count = 1;
		for (int i = 0; i < a.length-1; i++) 
		{
			
			if( a[i] == a[i+1])
			{
				count++;
			
			}
			else
			{
				if(count == 1) 
				{
					System.out.println(a[i] );
				}
				count = 1;
			}
		}
		if(count == 1)
		{
			System.out.println( a[a.length-1] );
		}
		
	}
	
	static void elements(int[] a)
	{
		int count = 1;
		int uniqueCount = 0;
		
		for (int i = 0; i < a.length-1; i++) 
		{
			
			if(a[i] == a[i+1])
			{
				count++;
			}
			else
			{
				if(count == 1)
				{
					uniqueCount++;
				}
				count = 1;
				
			}
		}
		if(count == 1)
		{
			uniqueCount++;
		}
		
		System.out.println(uniqueCount);
	}
	
	// Day 33
	static int repeatingElements(int[] a)
	{
		for (int i = a.length-2; i >= 0; i--) 
		{
			if(a[i] == a[i+1])
			{
				return a[i];
			}
			
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();
		}
		
	
		int res = repeatingElements(a);
		System.out.println(res);

	}

}
