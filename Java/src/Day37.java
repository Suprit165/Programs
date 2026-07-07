import java.util.Scanner;

public class Day37 {
	
	static void printSubArraysSum(int[] a, int size)
	{
		for (int i = 0; i <= a.length - size; i++) 
		{
			int sum = 0;
			for (int j = i; j < i + size; j++) 
			{
				sum = sum + a[j];
			}
			System.out.println(sum);
		}
	}
	
	static void printSubArraysSumCount(int[] a, int size, int k)
	{
		int count = 0;
		for (int i = 0; i <= a.length - size; i++) 
		{
			int sum = 0;
			for (int j = i; j < i + size; j++) 
			{
				sum = sum + a[j];
			}
			
			if(sum == k)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void printSubArraysSumPairs(int[] a, int size, int k)
	{
		for (int i = 0; i <= a.length - size; i++) 
		{
			int sum = 0;
			for (int j = i; j < i + size; j++) 
			{
				sum = sum + a[j];
			}
			
			
			if(sum == k)
			{
				for (int j = i; j < i + size; j++) 
				{
					System.out.print(a[j] + " ");					
				}
				System.out.println();
			}
		}
	}
	
	static void printAllSubArrays(int[] a, int k)
	{
		int count = 0;
//		for (int size = 1; size <= a.length; size++) 
		for(int size = a.length; size >= 1; size--)
		{
			for (int i = 0; i <= a.length-size; i++) 
			{
				int sum = 0;
				for (int j = i; j < i+size; j++) 
				{
//					System.out.print(a[j] + " ");
					sum = sum + a[j];
				}
//				System.out.println(sum);
				if(sum == k)
				{
//					count++;
					for (int j = i; j < i + size; j++) 
					{
						System.out.print(a[j] + " ");
					}
					System.out.println();
				}
			}
		}
//		System.out.println(count);
	}

	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();
		}
		
//		int size = scan.nextInt();
		int k = scan.nextInt();
		
		printAllSubArrays(a, k);

	}

}
