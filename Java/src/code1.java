import java.util.Scanner;

public class code1 {
	// TCS NQT Questions 
	 static void countPrimePairs(int[] ar)
		{

			int count = 0;
			for (int i = 0; i < ar.length-1; i++) 
			{
				
				for (int j = i+1; j < ar.length; j++) 
				{
					
					if(checkPrime(ar[i]) || checkPrime(ar[j]))
					{
//						System.out.println(ar[i] + " " + ar[j]);
						count++;
					}
				}	
			}
			System.out.println(count);
		}
	 
	 static boolean checkPrime(int n)
		{
			if(n <= 1)
			{
				return false;
			}
			for (int i = 2; i * i <= n; i++) 
			{
				if(n % i == 0)
				{
					return false;
				}
			}
			return true;
		}
		

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = scan.nextInt();
		}
		
//		int k = scan.nextInt();
		
		countPrimePairs(ar);
		
	    
	}

}
