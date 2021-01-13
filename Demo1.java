import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		Scanner sc1 = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("Enter End limit of Fabonacii series: ");
		
		int limit = sc1.nextInt();
		
		for(int i=1; i<=limit; i++)
		{
			System.out.print(a+",");
		    c=a+b;
			a=b;
			b=c;
		}
		sc1.close();
		System.out.println("\nProgram Ended");
	}
}	