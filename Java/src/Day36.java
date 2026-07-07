import java.util.Scanner;

public class Day36 {

	static int[] mergeArrays(int[] a1, int[] a2, int[] a3)
	{
		int[] res = new int[a1.length + a2.length + a3.length];
		int i = 0;
		int k = 0;
		
		while(k < res.length)
		{

			if(i < a1.length)
			{
				res[k] = a1[i];
				k++;
			}
			
			if(i < a2.length)
			{
				res[k] = a2[i];
				k++;
			}
			
			if(i < a3.length)
			{
				res[k] = a3[i];
				k++;
			}
			
			i++;
		}
		
		return res;
	}
	
	
	static void printSubArrays(int[] a, int size)
	{
		for (int i = 0; i <= a.length-size; i++) 
		{
			for (int j = i; j < i+size; j++) 
			{
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
	}
	
	// Day37
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
		//merge arrays
//		int n1 = scan.nextInt();
//		int[] a1 = new int[n1];
//		for (int i = 0; i < a1.length; i++) 
//		{
//			a1[i] = scan.nextInt();
//		}
//		
//		int n2 = scan.nextInt();
//		int[] a2 = new int[n2];
//		for (int i = 0; i < a2.length; i++) 
//		{
//			a2[i] = scan.nextInt();
//		}
//		
//		int n3 = scan.nextInt();
//		int[] a3 = new int[n3];
//		for (int i = 0; i < a3.length; i++) 
//		{
//			a3[i] = scan.nextInt();
//		}
//		
//		
//		int[] result  = mergeArrays(a1,a2,a3);
//		
//		for (int i = 0; i < result.length; i++) 
//		{
//			System.out.print(result[i] + " ");
//		}

		
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
