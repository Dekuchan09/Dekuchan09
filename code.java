import java.util.Scanner;

public class code
{
	public static void main(String[] args)
	{
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("who are you");
		String name = myObj.next();
		System.out.println("HI! " + name);
		
		System.out.print("how old are you?");
		int age = myObj.nextInt();
		int a= 10;
		int b= 8;
	   System.out.println("my real age is:=" +(a+b));
		System.out.println(age);
		
		
		
	}
}