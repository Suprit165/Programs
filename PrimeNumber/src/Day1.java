import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		 int n1 = scan.nextInt();
		 int n2 = scan.nextInt();
		 
		 printPrimes(n1,n2);


	}
	
	static int CountFactors(int n)
    {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        return count;
    }
	
	static void printPrimes(int n1, int n2)
	{
		for(int i=n1; i<=n2; i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
										
	}

	
}
