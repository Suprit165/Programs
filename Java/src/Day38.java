import java.util.Scanner;

public class Day38 {
	
	static int[] rearrangeArrays(int[] a)
	{
		int i = a.length - 1;
		int j = a.length - 1;
		
		while( i >= 0)
		{
			if( a[i] == -1 )
			{
				i--;				
			}
			else
			{
				a[j] = a[i];
				i--;
				j--;				
			}
		}
		
		while( j >= 0)
		{
			a[j] = -1;
			j--;
		}
		
		return a;
	}
	
	
	static int[] rearrangeArraysZeros(int[] a)
	{
		int i = 0;
		int j = 0;
		
		while( i < a.length)
		{
			if( a[i] == 0 )
			{
				i++;				
			}
			else
			{
				a[j] = a[i];
				i++;
				j++;				
			}
		}
		
		while( j < a.length)
		{
			a[j] = 0;
			j++;
		}
		
		return a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();
		}
		
		rearrangeArraysZeros(a);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}

}
