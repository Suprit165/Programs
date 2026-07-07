package Programming;
import java.util.Scanner;


// Count digits problems

public class day_20 {

		static int countdigits(int n) 
		{
			int count = 0;
			
			for( ; n > 0 ;)
			{
				n = n/10;
				count++;
			}
			
			return count;
		}
		
// Reverse Integer values problems
// Check whether give integer is palindrome or not


		static int reverseInt(int n) 
		{
			int rev = 0;
			while( n > 0)
			{
				int last = n % 10;
				rev = (rev * 10) + last;
				n = n/10;
			}
			return rev;
		}
		
		
// check how many even numbers are there		
		static int countEvenDigits(int n)
		{
			int count = 0;
			while( n > 0 )
			{
				int last = n % 10;
				if(n % 2 == 0)
				{
					count++;
				}
				n = n/10;
			}
			return count;
			
		}
		

		
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int res = countEvenDigits(n);
		
		System.out.println(res);
		
	}
	
	
}
