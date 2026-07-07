import java.util.StringTokenizer;

public class Day43 {
	
	static int indexOf(String s)
	{
		int count = 0;
//		for (int i = 0; i < s.length(); i++)
		for (int i = s.length()-1; i >= 0 ; i--)
		{
			if(s.charAt(i) == 'A')
			{
				count++;
				if(count == 2)
				{
					return i;					
				}
			}
			
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		// StringBuffer
//		StringBuffer st = new StringBuffer();
//		System.out.println(st.capacity());
//		st.append("JAVA");
//		System.out.println(st);
//		System.out.println(st.length());
//		st.append(" JAVASCRIPT");
//		System.out.println(st);
//		st.append(" JAMESGOSLING");
//		System.out.println(st);
//		System.out.println(st.capacity());
//		System.out.println(st.length());
//		st.trimToSize();
//		System.out.println(st.capacity());
//		System.out.println(st.length());
		
		// StringBuilder
//		StringBuilder st = new StringBuilder();
//		System.out.println(st.capacity());
//		st.append("JAVA");
//		System.out.println(st);
//		System.out.println(st.length());
//		st.append(" JAVASCRIPT");
//		System.out.println(st);
//		st.append(" JAMESGOSLING");
//		System.out.println(st);
//		System.out.println(st.capacity());
//		System.out.println(st.length());
//		st.trimToSize();
//		System.out.println(st.capacity());
//		System.out.println(st.length());
		
		
//		StringBuilder st = new StringBuilder("JAVA" + "JAVASCRIPT");
//		System.out.println(st);
		
		
//		StringTokenizer st = new StringTokenizer("JAVA PYTHON SQL AI", "A");
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
//		
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
//		
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
//		
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
//		
//		System.out.println(st.hasMoreTokens());
		
//		while(st.hasMoreTokens() == true)
//		{
//			System.out.println(st.nextToken());
//		}

		
		String s = "JAVASCRIPT";
//		System.out.println(s.indexOf("A"));
//		System.out.println(s.lastIndexOf("A"));
		
		System.out.println(Day43.indexOf(s));
		
		
		
		
	}

}
