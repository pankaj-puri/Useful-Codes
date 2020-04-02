import java.util.Scanner;
public class p1
{
	
	public static void main(String args[])
	{  Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a Palindrome Number: ");
		int n=sc.nextInt();
		int t=n;
		int r,s=0; //r is remainder
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		
		if(t==s)
		System.out.println("The Entered Number is Palindrome");	
        else
        System.out.println("The Entered Number is not a Palindrome");			
	}
}