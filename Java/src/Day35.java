import java.util.Scanner;

public class Day35 {
	
	static void missingElements(int[] a)
	{
		int n = a.length + 1;
		
		int sum1 = n * (n+1)/2;
		
		int sum2 = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			sum2 = sum2 + a[i];
		}
		
		int res = sum1 - sum2;
		
		System.out.println(res);
	}
	
	static void printCommonElements(int[] a1,int[] a2)
	{
		int i = 0;
		int j = 0;
		
		while(i<a1.length && j<a2.length)
		{
			if(a1[i] == a2[j])
			{
				System.out.print(a1[i] + " ");
				i++;
				j++;
			}
			else if(a1[i] > a2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
		}
	}
	
	static int[] printSortedElements(int[] a1,int[] a2)
	{
		int[] res = new int[a1.length + a2.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<a1.length && j<a2.length)
		{
			if(a1[i] >= a2[j])
			{
				res[k] = a2[j];
				k++;
				j++;
			}
			else
			{
				res[k] = a1[i];
				k++;
				i++;
			}
		}
		
		while(j<a2.length)
		{
			res[k] = a2[j];
			k++;
			j++;
		}
		
		while(i<a1.length)
		{
			res[k] = a1[i];
			k++;
			i++;
		}
		
		return res;
			
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		int[] a1 = new int[n1];
		
		for (int i = 0; i < a1.length; i++) 
		{
			a1[i] = scan.nextInt();
		}
		
		int n2 = scan.nextInt();
		
		int[] a2 = new int[n2];
		
		for (int i = 0; i < a2.length; i++) 
		{
			a2[i] = scan.nextInt();
		}
		
		
		
		int[] result = printSortedElements(a1,a2);
		
		for (int i = 0; i < result.length; i++) 
		{
			System.out.println(result[i] + " ");
		}
		
		
	}

}
