import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int[][] a = new int[2][];
//		a[0] = new int[2];
//		a[1] = new int[5];
//		
//		for(int i = 0; i<a.length;i++)
//		{
//			for(int j = 0; j<a[i].length; j++)
//			{
//				System.out.println("Classroom "+i+ " Students "+j);
//				a[i][j] = scan.nextInt();
//			}
//		}
//		
//		System.out.println("The ages are: ");
//		
//		for(int i = 0; i<a.length; i++)
//		{
//			for(int j = 0; j<a[i].length; j++)
//			{
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
//		System.out.println("Enter the number of elements: ");
//		int n = scan.nextInt();
//		
//		int[] a = new int[n];
//		System.out.println("Enter "+n+" elements " );
//		
//		for(int i = 0; i < a.length; i++)
//		{
//			a[i] = scan.nextInt();
//		}
//		
//		
//		int max = a[0];
//		
//		for(int i = 0; i<5; i++)
//		{
//			if(a[i] > max)
//			{
//				max = a[i];
//				System.out.println("Largest element is: "+max);
//			}
//		}	
		
		int n = scan.nextInt();
		int[] a = new int [n];
		
		for(int i = 0;i<a.length; i++)
		{
			a[i] = scan.nextInt();
		}
		int sum = 0;
		
		for(int i=0;i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
