import java.util.Scanner;

public class Day56 {
	
	static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length()-1;
		
		while( i <= j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			
			i++;
			j--;
		}
		return true;
		
	}

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
	
	static void printAllSubstrings(String s)
	{
		for(int size = 1; size <= s.length(); size++)
		{
			printSubstring(s, size);
		}
		return;
	}
	
	static void printAllSubstrings1(String s)
	{
		for(int size = s.length(); size >= 1; size--)
		{
			for(int i = 0; i <= s.length()-size; i++)
			{
				String t = "";
				for(int j = i; j < size + i; j++)
				{
					t = t + s.charAt(j);
				}
				
				if(isPalindrome(t))
				{
					System.out.println(t);
					return;
				}
			}
		}
	}
	
	static boolean string(String s1, String s2)
	{
		int i=0;
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		while(i < s1.length())
		{
			if(s1.charAt(i) == s2.charAt(i))
			{
				i++;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
//		int size = scan.nextInt();
		String s2 = scan.next();
		
		System.out.println(string(s1, s2));
	}

}
