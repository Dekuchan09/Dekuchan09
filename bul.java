import java.util.Scanner;

public class bul
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("what your name:=");
		String name = myObj.next();
		System.out.print("welcome:=" + (name));
	}
}