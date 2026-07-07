import java.util.Scanner;

public class Day45 {

	static void nonRepSubstring(String s)
	{
		String res = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			String temp = "";
			
			for (int j = i; j < s.length(); j++) 
			{
				if(temp.indexOf(s.charAt(j)) == -1)
				{
					temp = temp + s.charAt(j);
				}
				else
				{
					break;
				}
			}
			
			if(temp.length() > res.length())
			{
				res = temp;
			}
		}
		System.out.print(res);
	}
	
	
	static void lengthNonRepSubstring(String s)
	{
		String res = "";
		
		for (int i = 0; i < s.length(); i++) 
		{
			String temp = "";
			
			for (int j = i; j < s.length(); j++) 
			{
				if(temp.indexOf(s.charAt(j)) == -1)
				{
					temp = temp + s.charAt(j);
				}
				else
				{
					break;
				}
			}
			
			if(temp.length() > res.length())
			{
				res = temp;
			}
		}
		System.out.println(res.length());
	}
	
	
	static void repeatedCharacters(String s)
	{
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == 'a')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
//		nonRepSubstring(s);
		repeatedCharacters(s);
	}

}
