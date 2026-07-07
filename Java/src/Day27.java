import java.util.Scanner;

public class Day27 {
	
	static int sum(int[] a)
	{
		int sum = 0;
		for(int i = 0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}
	
	
	
	
	
	static int product(int[] a)
	{
		int p = 1;
		for(int i = 0; i<a.length; i++)
		{
			p = p * a[i];
		}
		return p;
	}
	
	
	static int max(int[] a)
	{
		int max = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			
		}
		return max;
	}
	
	
	
	static int min(int[] a)
	{
		int min = a[0];
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
			
		}
		return min;
	}
	
	
	
	static int maxIndex(int[] a)
	{
		int max = 0;
		int index = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
				index = i;
			}
			
		}
		return index;
	}
	

	
	
	
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] a = new int[n];
		
	for(int i = 0;i<a.length; i++)
	{
		a[i] = scan.nextInt();
	}
		
	int res = maxIndex(a);
	System.out.println(res);
		
}
}