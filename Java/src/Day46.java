import java.util.Arrays;
import java.util.Scanner;

public class Day46 {
	
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
	
	static void printAllSubstring(String st)
	{
		int n = st.length();
		String res = "";
		
		for (int len = 1; len < n; len++) 
		{
			for (int s = 0; s <= (n-len); s++) 
			{
				for(int e = s; e <= (s+len)-1; e++)
				{
					System.out.print(st.charAt(e));
				}
				System.out.println();
			}
		}
	}

	static Boolean isAnagram(String s1, String s2)
	{
		String temp = "";
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i) != ' ')
			{
				temp = temp + s1.charAt(i);
			}
		}
		
		s1 = temp;
		temp = "";
		
		for (int i = 0; i < s2.length(); i++) 
		{
			if(s2.charAt(i) != ' ')
			{
				temp = temp + s2.charAt(i);
			}
		}
		
		s2 = temp;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		s1 = new String(arr1);
		s2 = new String(arr2);
		
	
		return s1.equals(s2);
		
	}
	
	static Boolean isPanagram(String s)
	{
		String t = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		System.out.println(s);
		int count = 0;
		
		for (int i = 0; i < t.length(); i++) 
		{
			if(s.indexOf(t.charAt(i)) >= 0)
			{
				count++;
			}
			else 
			{
				break;
			}
		}
		
		System.out.println(count);
		if (count == 26)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static String printLongestPalindromeSubstring(String st)
	{
		int n = st.length();
		String res = "";
		
		for(int len = 1; len < n; len++)
		{
			for (int s = 0; s <= (n-len); s++) 
			{
				String temp = "";
				for (int e = s; e <= (s+len)-1; e++) 
				{
					temp = temp + st.charAt(e);
				}
				
				if(isPalindrome(temp))
				{
					if(temp.length() > res.length())
						res = temp;
				}
			}
		}
		
		return res;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		String s1 = "Funeral";
//		String s2 = "Real Fun";
		
//		String s = "A quick brown fox jumps over the lazy dog";
		
		String s = "abacd";
		
		System.out.println(printLongestPalindromeSubstring(s));
		
		
		
	}

}
