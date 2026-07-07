import java.util.Iterator;
import java.util.Scanner;

public class Factorial {
	
	static int fact(int n)
	{
		int res = 1;
		for (int i = 1; i <= n; i++) 
		{
			res = res * i;
		}
		return res;
	}
	
	static int countDigits(int n)
	{
		int count = 0;
		
		while(n > 0)
		{
			n = n/10;
			count++;
		}
		return count;
	}
	
	static int trailingZeros(int n)
	{
		int res = 0;
		
		int powOf5 = 5;
		
		while(n >= powOf5)
		{
			res = res + (n/powOf5);
			powOf5 = powOf5 * 5;
		}
		
		return res;	
	}
	
	static int gcd(int a, int b)
	{
		int min = 0;
		
		if(a < b)
		{
			min = a;
		}
		else
		{
			min = b;
		}
		
		for (int i = min; i >= 1; i--) 
		{
			if(a % i ==0 && b % i == 0)
			{
				return i;
			}
		}
		return 1;
	}
	
	static int euclidGcd(int a, int b)
	{
		while(a != b)
		{
			if(a > b)
			{
				a = a - b;
			}
			else
			{
				b = b - a;
			}
		}
		return a;
	}
	
	static int optimisedEuclidGcd(int a, int b)
	{
		while(a != 0 && b != 0)
		{
			if(a > b)
			{
				a = a % b;
			}
			else
			{
				b = b % a;
			}
		}
		if(a != 0)
		{
			return a;
		}
		else
		{
			return b;			
		}
	}
	
	static int findLcm(int a, int b)
	{
//		int res = Math.max(a, b);
//		
//		while(true)
//		{
//			if(res % a == 0 && res % b == 0)
//			{
//				break;
//			}
//			res++;
//		}
//		return res;
		
		return (a * b) / optimisedEuclidGcd(a, b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		System.out.println(findLcm(a,b));
	}

}
