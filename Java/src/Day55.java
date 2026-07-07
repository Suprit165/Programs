import java.util.Scanner;

public class Day55 {

	static void printSubstring(String s, int size)
	{
		for(int i = 0; i <= s.length()-size; i++)
		{
			String t = "";
			
			for(int j = i; j < size + i; j++)
			{
				t = t + s.charAt(j);
			}
			System.out.println(t);
		}
	}
	
	static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length()-1;
		
		while(i < j)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	static void printPalindromicSubstring(String s, int size)
	{
		for(int i = 0; i <= s.length() - size; i++)
		{
			String t = "";
			
			for(int j = i; j < i + size; j++)
			{
				t = t + s.charAt(j);
			}
			
			if(isPalindrome(t))
			{
				System.out.println(t);
			}
		}
	}
	
	static String printPalindromicSubstring1(String s1, String s2, int size)
	{
		int count = 0;
		int size1 = s2.length();
		
		for(int i = 0; i <= s1.length() - size; i++)
		{
			String t = "";
			
			for(int j = i; j < size + i; j++)
			{
				t = t + s1.charAt(j);
			}
			
			if(t.equals(s2))
			{
				return "Yes";
			}
		}
		return "No";
	}
	
	static int printPalindromicCount(String s1, String s2, int size)
	{
		int count = 0;
		int size1 = s2.length();
		
		for(int i = 0; i <= s1.length() - size; i++)
		{
			String t = "";
			
			for(int j = i; j < size + i; j++)
			{
				t = t + s1.charAt(j);
			}
			
			if(t.equals(s2))
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		int size = scan.nextInt();
		
		System.out.println(printPalindromicCount(s1, s2, size));
		
		
	}

}
