import java.util.Scanner;

public class Day57 {

	static int countWords(String s)
	{
		int count = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		return s.charAt(0) == ' '? count : count+1;
	}
	
	
	static String[] split(String s)
	{
		int wordCount = countWords(s);
		
		String[] ar = new String[wordCount];
		
		String t = "";
		int j = 0;
	
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				t = t + s.charAt(i);
			}
			else if(t.length() > 0)
			{
				ar[j] = t;
				j++;
				t = "";
			}
		}
		ar[j] = t;
		
		return ar;
	}
	
	static String reverse(String s)
	{
		String t = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			t = s.charAt(i) + t ;
		}
		return t;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		String[] ar = split(s);
		
		for(int i = 0; i <ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(reverse(ar[i]) + " ");
		}
		System.out.println();
		
		for(int i = ar.length-1; i >= 0; i--)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		for(int i = ar.length-1;  i >= 0; i--)
		{
			System.out.print(reverse(ar[i]) + " ");
		}
		System.out.println();
		
		for(int i = 1; i < ar.length; i=i+2)
		{
			System.out.print(ar[i] + ar[i-1] + " ");
		}
		System.out.println();
		
		for(int i = 1; i <ar.length; i = i + 2)
		{
			System.out.print(reverse(ar[i]) + ar[i-1] + " ");
		}
		System.out.println();
		
		for(int i = 0, j = ar.length-1; i < j; i++, j--)
		{
			System.out.print(ar[i] + ar[j] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + ar[i].length() + " ");
		}
	}

}
