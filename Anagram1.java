package Anagram;
import java.util.Scanner;
public class Anagram1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String: ");
		String a=sc.nextLine();
		System.out.print("Enter Second String: ");
		String b=sc.nextLine();
		boolean isAnagram=false;
		boolean visit[]=new boolean[b.length()];
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				char c=a.charAt(i);
				isAnagram=false;
				for(int j=0;j<b.length();j++)
				{
					if(c==b.charAt(j) && !visit[j])
					{	  isAnagram=true;
						  visit[j]=true;
						  break;
					}
				}
				if(!isAnagram)
					break;
			}
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
