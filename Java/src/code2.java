import java.util.Arrays;
import java.util.Scanner;

public class code2 {
	
	// TCS NQT Questions
	static void countOperation(int a, int b, int c)
	{
		int min = 0;
		int max = 0;
		int mid = 0;
		int count = 0;
		
		while( !(a == b && a == c) )
		{
			min = Math.min(Math.min(a, b),c);
			max = Math.max(Math.max(a, b),c);
			mid = a + b + c - min - max;
		
			a = min + 1;
			b = mid + 1;
			c = max - 1;
		
			count++;
		}
		
		System.out.println(count);
	}
	
	static boolean checkPrime(int n)
	{
		for (int i = 2; i * i <= n; i++) 
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	static void isPrime(int n)
	{
		int count = 0;
		for (int i = 2; count < n; i++) 
		{
			if(checkPrime(i))
			{
				System.out.println(i);
				count++;
			}
		}
		
	}
	
	static int highestCommonFactor(int n1, int n2)
	{ 	
		for (int i = n1; i > 0; i++) 
		{
			if(i % n1 == 0 && i % n2 == 0)
			{
				return i;
			}
		}
		return 1;
	}
	
	static int lcm(int n1, int n2)
	{
		int hcf = highestCommonFactor(n1, n2);
		return (n1 * n2) / hcf;
	}
	
	static void countDigits(int n)
	{
		int count = 0;
		
		while(n > 0)
		{
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
	
	static void reverseNumber(int n)
	{
		int rev = 0;
		
		while( n > 0)
		{
			int last = n % 10;
			
			rev = rev * 10 + last;
			
			n = n / 10;
		}
		System.out.println(rev);
	}
		
	static String checkPalindrome(int n)
	{
		int original = n;
		int rev = 0;
		while (n > 0)
		{
			int last = n % 10;
			
			rev = rev * 10 + last;
			
			n = n / 10;
		}
		
		if( original == rev)
		{
			return "Palindrome";
		}
		
		return "Not Palindrome";
	}
	
	static int secondLargestElement(int[] a)
	{
		int firstLargest = a[0];
		int secondLargest = a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > firstLargest)
			{
				secondLargest = firstLargest; 
				firstLargest = a[i];
			}
			else if(a[i] > secondLargest)
			{
				secondLargest = a[i];
			}
		}
		return secondLargest;
		
	}
	
	static void countOccurrences(int[] a)
	{
		int count = 1;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i] == a[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i] + " - " + count);
				count = 1;
			}
		}
		System.out.println(a[a.length - 1]+ " - " + count);
	}
	
	static void printElementsWithoutRepeating(int[] a)
	{
		int count = 1;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i] == a[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i]);
			}
		}
		System.out.println(a[a.length - 1]);
	}
	
	static void printUniqueElements(int[] a)
	{
		int count = 1;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i] == a[i+1])
			{
				count++;
			}
			else
			{
				if(count == 1)
				{
					System.out.println(a[i]);
				}
				count=1;
			}
		}
		System.out.println(a[a.length - 1]);
	}
	
	static void countUniqueElements(int[] a)
	{
		int count = 1;
		int uniqueCount = 0;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i] == a[i+1])
			{
				count++;
			}
			else
			{
				if(count == 1)
				{
					uniqueCount++;
				}
				count = 1;
			}
		}
		
		if(count == 1)
		{
			uniqueCount++;
		}
		
		System.out.println(uniqueCount);
	}
	
	static void numberSpacesString(String s)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void countNoOfWords(String s)
	{
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) 
		{
			if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
			{
				count++;
			}
		}
		System.out.println(count + 1);
	}
	
	static void countVowels(String s)
	{
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void countConsonants(String s)
	{
		int vc = 0;
		int cc = 0;
 		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
						ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
		}
 		System.out.println(vc);
		System.out.println(cc);
	}
	
	static void membershipPlan(int n)
	{
		
		if( n == 1)
		{
			System.out.println("1200");
		}
		else if(n == 3)
		{
			System.out.println("3000");
		}
		else if(n == 6)
		{
			System.out.println("6000");
		}
		else if(n == 9)
		{
			System.out.println("12000");
		}
		else if(n == 12)
		{
			System.out.println("15000");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	static double calculateFinalAmount(int amount)
	{
		if(amount < 0)
		{
			return -1;
		}
		
		else if(amount < 1000)
		{
			return amount * 0.95;
		}
		
		else if(amount <= 5000)
		{
			return amount * 0.90;
		}
		
		else
		{
			return amount * 0.85;
		}
		
		
	}
		
	static void processTransaction(int senderBalance, int receiverBalance, int transferAmount)
	{
		if(senderBalance >= transferAmount)
		{
			senderBalance = senderBalance - transferAmount;
			receiverBalance = receiverBalance + transferAmount;
			System.out.println("Sender: " + senderBalance);
			System.out.println("Receiver: " + receiverBalance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	static int calculateParkingFee(int n)
	{
		int fee = 0;
		
		while( n > 5)
		{
			n = n - 1;
			fee = fee + 20;
		}
		
		while( n > 2)
		{
			n = n - 1;
			fee = fee + 50;
		}
		
		while( n > 0)
		{
			n = n - 1;
			fee = fee + 100;
		}
		
		return fee;
	}
	
	static int balloonCapacity(int[] a, int maxCap)
	{
		int totalWeight = 0;
		int count = 0;
		
		for (int weight: a) 
		{
			if(totalWeight + weight > maxCap)
			{
				break;
			}
			totalWeight = totalWeight + weight;
			
			count++;
		}
		return count;
	}
	
	static void ticketPrice(int[] a, int n)
	{
		int sum = 0;
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] % 2 != 0)
			{
				sum = sum + a[i];
				count++;
			}
		}
		
		if(count == 0)
		{
			System.out.println("0 0 0.00");
			return;
		}
		
		double avg = (double) sum / count;
		System.out.println(sum + " ");
		System.out.println(count + " ");
		System.out.printf("%.2f\n", avg);
	}
	
	static void sortMatrix(int[][] matrix, int rows, int columns)
	{
		int[] allElements = new int[rows * columns];
		
		int index = 0;
		
		for (int[] row: matrix) 
		{
			for(int num : row)
			{
				allElements[index++] = num ;
			}
		}
		
		Arrays.sort(allElements);
		
		index = 0;
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
				matrix[i][j] = allElements [ index++ ];
				
				System.out.println(matrix[i][j] + (j == columns - 1 ? "\n" : ""));
			}
		}
	}
	
	static void matrixSort(int[][] a, int r, int c)
	{
		int[] res = new int[r * c];
		
		int k = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				res[k++] = a[i][j];
			}
		}
		Arrays.sort(res);
		k = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j] = res[k++];
				System.out.print(a[i][j] + " ");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		int[][] a = new int[r][c];
		
		
		for (int i = 0; i < r; i++) 
		{
			for (int j = 0; j < c; j++) 
			{
				a[i][j] = scan.nextInt();
			}
			
		}
		
		matrixSort(a, r, c);
		
	}	
}
