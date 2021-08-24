package Anagram;
import java.util.Scanner;
public class Anagram2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String: ");
		String a=sc.nextLine();
		System.out.print("Enter Second String: ");
		String b=sc.nextLine();
		int ab[]=new int[256];
		boolean isAnagram=true;
		for(char i:a.toCharArray())
			ab[(int)i]++;
		for(char i:b.toCharArray())
			ab[(int)i]--;
		for(int i=0;i<256;i++)
		{
			if(ab[i]!=0)
			{
				isAnagram=false;
				break;
			}
			
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

}
