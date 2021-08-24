import java.util.Scanner;
public class Factorial
{
	int recursion(int N)
	{
		if(N<=1)
			return 1;
		else
			 return(N*(recursion(N-1)));
	}
	public static void main(String args[])
	{  Scanner sc=new Scanner(System.in);
	   fr1 obj=new fr1();
	    int fact;
	    System.out.print("Enter a number to calculate Factorial: ");
		int n=sc.nextInt();
		fact=obj.recursion(n);
		System.out.println("Factorial of "+n+": "+fact);		
	}
}