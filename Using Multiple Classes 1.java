

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    pangalawa get = new pangalawa ();

      System.out.println ("Input numbers:");
    int num1 = sc.nextInt ();
    int num2 = sc.nextInt ();
    int num3 = sc.nextInt ();
    int num4 = sc.nextInt ();
    int num5 = sc.nextInt ();

    int highest = get.Highest (num1, num2, num3, num4, num5);
    int lowest = get.Lowest (num1, num2, num3, num4, num5);

      System.out.println ("The highest number is " + highest);
      System.out.println ("The lowest number is " + lowest);

  }
}
