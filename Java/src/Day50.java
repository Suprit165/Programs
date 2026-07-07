import java.util.Scanner;

public class Day50 {

	static String reverseString(String s)
	{
		String t = "";
		
		for (int i = s.length()-1; i >= 0; i--) 
		{
//			char ch = s.charAt(i);
			t = t + s.charAt(i);
		}
		return t;
	}
	
	static String  palindrome(String s)
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
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		System.out.println(palindrome(s));
		
//		System.out.println(s.equals(res) ? "Palindrome" : "Not Palindrome");
		
		
	}

}
