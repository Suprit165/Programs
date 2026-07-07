import java.util.Scanner;

public class Day53 {
	
	static String toUpperCase(String s)
	{
		String t = "";
		
		for (int i = 0; i < s.length(); i++) 
		{
//			t = t + (s.charAt(i) - 32);
			t = t + (char)(s.charAt(i) - 32);
		}
		
		return t;
	}	
	
	static String toUpperCase1(String s)
	{
		String t = "";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				t = t + (char)(s.charAt(i) - 32);				
			}
			else
			{
				t = t + ch;
			}
		}
		
		return t;
	}	
	
	static String swapCase(String s)
	{
		String t = "";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			
			if( ch >= 'a' && ch <= 'z')
			{
				t = t + (char)(ch - 32);
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				t = t + (char)(ch + 32);
			}
			else
			{
				t = t + ch;
			}
		}
		
		return t;
	}
	
	static String trim(String s)
	{
		int si = 0;
		int ei = s.length()-1;
		
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				si = i;
				break;
			}
		}
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			if(s.charAt(i) != ' ')
			{
				ei = i;
				break;
			}
		}
		
		String t = "";
		
		for(int i = si; i <= ei; i++)
		{
			t = t + s.charAt(i);
		}
		
		return t;	
	}
	
	static String trimExtraSpaces(String s)
	{
		int si = 0;
		int ei = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				si = i;
				break;
			}
		}
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			if(s.charAt(i) != ' ')
			{
				ei = i;
				break;
			}
		}
		
		String t = "";
		
		for(int i = si; i <= ei; i++)
		{
			if(s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i+1) != ' '))
			{
				t = t + s.charAt(i);
			}
		}
		
		return t;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		System.out.println(trimExtraSpaces(s));
		
	}

}
