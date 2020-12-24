import java.util.Random;
public class RandomEx
{
  // This example will shows you how to use Random Class in Java
	public static void main(String args[])
	{   
	Random rd=new Random();
	for(int i=1;i<=6;i++)
	{
	System.out.print(rd.nextInt(10)); //0-9 limit
	System.out.println();
	}
	System.out.println();
	System.out.println(rd.nextInt(10)+4);//5-13
	}
}