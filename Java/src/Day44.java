import java.util.Scanner;

public class Day44 {

	static String reverseString(String s)
	{
		String t = "";
		
		for (int i = s.length()-1; i >= 0; i--) 
		{
			t = t + s.charAt(i);
		}
		
		return t;
	}
	
	static boolean isPalindrome(String s)
	{
		if(s.equals(reverseString(s)))
		{
			return true;
		}
		
		return false;
			
	}
	
//	static boolean isPalindrome1(String s)
//	{
//		int i = 0;
//		int j = s.length()-1;
//		
//	
//		while(i <= j)
//		{
//			if(s.charAt(i) != s.charAt(j))
//			{
//				return false;
//			}
//			
//			j--;
//			i++;
//		}
//		return true;
//		
//	}
	
	static void isPalindrome1(String s)
	{
		int i = 0;
		int j = s.length()-1;
		
		while(i <= j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				System.out.println("Not Palindrome");			
				return;
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");			
		
	}
	
	
	static int countVowels(String s)
	{
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			
			if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' 
				|| c =='A' || c =='E' || c =='I' || c =='O' || c =='U')
			{
				count++;
			}
		}
		return count;
	}
	
	static String removeVowels(String s)
	{
		String t = "";
		
		
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			{
				
			}
			else
			{
				t = t + c;
			}
		}
		return t;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
//		System.out.println(isPalindrome1(s));
		
		isPalindrome1(s);
		

		
	}

}
