package P2;

import java.util.Scanner;

public class Day75 {

	public static void main(String[] args) {

//		Before applying try - catch
		System.out.println("Connection is Established");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numrator");
		int a = scan.nextInt();
		System.out.println("Enter the denominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		
		System.out.println("Connection is Terminated");
		

		
//		After applying try - catch 
//		System.out.println("Connection is Established");
//		try 
//		{
//			
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the numrator");
//			int a = scan.nextInt();
//			System.out.println("Enter the denominator");
//			int b = scan.nextInt();
//			int c = a/b;
//			System.out.println(c);
//			
//		}
//		
//		catch (Exception e) 
//		{
//			System.out.println("Provide non zero denominator");
//		}
//		
//		System.out.println("Connection is Terminated");
		
	}

}
