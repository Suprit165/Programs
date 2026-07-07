import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isPrime(int n)
	{
//		for (int i = 2; i <= n/2; i++) 
//		for (int i = 2; i <= Math.sqrt(n); i++) 
		for(int i = 2; i * i <= n; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	static boolean checkPrime(int n)
	{
		if( n == 1)
		{
			return false;
		}
		if( n == 2 || n == 3)
		{
			return true;
		}
		if( n % 2 == 0 || n % 3 == 0 )
		{
			return false;
		}
		
		for (int i = 5; i * i <= n; i++) 
		{
			if( n % i == 0 || n % (i + 2) == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(checkPrime(n));
		
		
	}

}
