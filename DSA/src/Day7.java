import java.util.Scanner;

public class Day7 {

	static void printDivisor(int n)
	{
		for (int i = 1; i <= n; i++) 
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	static void printDivisorOptimised(int n)
	{
		for (int i = 1; i * i <= n; i++) 
		{
			if(n % i == 0)
			{
				System.out.println(i);
				if(i != n/i)
				{
					System.out.println(n/i);
				}
			}
		}
	}
	
	static void printDivisorOptimised1(int n)
	{
		int i = 0;
		for (i = 1; i * i <= n; i++) 
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
		}
		
		for (   ; i >= 1; i--) 
		{
			if(n % i == 0 && i != n/i)
			{
				System.out.println(n/i);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		printDivisorOptimised1(n);
		
	}

}
