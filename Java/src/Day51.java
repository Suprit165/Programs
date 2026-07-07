import java.util.Scanner;

public class Day51 {

	static int countSpaces(String s)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		}
		return count;
	}
	
	static int countWords(String s)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		}
		return count + 1;
	}
	
	static int countWords1(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length() - 1; i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		return s.charAt(0) == ' ' ? count : count+1;
	}
	
	static int countVowels(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		System.out.println(countVowels(s));
		
		
	}

}
