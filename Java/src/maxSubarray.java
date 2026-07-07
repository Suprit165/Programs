import java.util.Scanner;

public class maxSubarray {

	static void maxSubarray(int[] a)
	{
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			int sum=0;
			
			for (int j = i; j < a.length; j++) 
			{
				sum = sum + a[j];
				maxSum = Math.max(sum, maxSum);
			}
		}
		System.out.println("Maximum Subarray is : " + maxSum);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();		
		}
		
		maxSubarray(a);
	}

}
