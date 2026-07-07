import java.util.Scanner;

public class Day52 {

	static int countConsonants(String s)
	{
		int vc = 0;
		int cc = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if( ( ch>='A' && ch<='Z' ) || ( ch>='a' && ch<='z' ) )
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
		return cc;
		
		
	}
	
	static void countCharacters(String s)
	{
		int vc = 0;
		int cc = 0;
		int nc = 0;
		int sc = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if( (ch>='A' && ch<='Z' || ch>='a' && ch<='z' ) )
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
			else if(ch>='0' && ch<='9')
			{
				nc++;
			}
			else
			{
				sc++;
			}
		}
		System.out.println("vc = " + vc);
		System.out.println("cc = " + cc);
		System.out.println("nc = " + nc);
		System.out.println("sc = " + sc);
		
	}
	
	static String removeSpecial(String s)
	{
		String t = " ";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			
			if ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') ) 
			{
				t = t + ch;
			}
		}
		return t;
	}
	
	static String rearrange(String s)
	{
		String t = " ";
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			{
				t = t + ch;
			}
			else if(ch >= '0' && ch <= '9')
			{
//				sum = sum + ch;
//				sum = sum + (int)ch;
				sum = sum + ch-48;
			}
		}
		
		return t + sum;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		System.out.println(rearrange(s));
		
	}

}
