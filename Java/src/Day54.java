import java.util.Scanner;

public class Day54 {

	static String rearrange(String s)
	{
		String t = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'a')
			{
//				t = t + '*' + s.charAt(i);
				t = t + 'A';
			}
			else
			{
				t = t + s.charAt(i);
			}
		}
		return t;
	}
	
	static int printIndex(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'r')
			{
				return i;
			}
		}
		return -1;
	}
	
	static String findString(String s, String t)
	{
		int i = 0;
		int j = 0;
		
		while(i < s.length() && j < t.length())
		{
			if(t.charAt(j) == s.charAt(i))
			{
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		return j== t.length() ? "Yes" : "No";
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		String t = scan.next();
		
		System.out.println(findString(s, t));
	}

}
