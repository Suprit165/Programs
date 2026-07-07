package Programming;

import java.util.Scanner;

public class Multiples {

	static int highestcommonFactors(int n1, int n2)
	{
		
		for(int i=n1; i >= 1 ; i--)
		{
			if(n1%i == 0 && n2%i == 0 )
			{
				return i;
			}
		}
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int hcf = highestcommonFactors(n1, n2);
		
		
		System.out.println(hcf);
		
	}

}
