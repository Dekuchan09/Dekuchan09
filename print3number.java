import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
	    
	    
	    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	    
	    int num1 = 0;
	    int num2 = 0;
	    int num3 = 0;

		try{
		    System.out.print("Number: ");
		    num1 = Integer.parseInt(dataIn.readLine());
		    System.out.print("Number: ");
		    num2 = Integer.parseInt(dataIn.readLine());
		    System.out.print("Number: ");
		    num3 = Integer.parseInt(dataIn.readLine());
		    
		      if (num1 > num2)
               if (num1 > num3)
                System.out.println("Greatest: " + num1);
               
              if (num2 > num1)
               if (num2 > num3)
                System.out.println("Greatest: " + num2);
               
              if (num3 > num1)
               if (num3 > num2)
                System.out.println("Greatest: " + num3);
		    
	        if (num1 < num2)
               if (num1 < num3)
                System.out.println("Lowest: " + num1);
               
              if (num2 < num1)
               if (num2 < num3)
                System.out.println("Lowest:: " + num2);
               
              if (num3 < num1)
               if (num3 < num2)
                System.out.println("Lowest:: " + num3);
		     
		}catch(IOException e){
		    System.out.println("Error!");
		}
		
	}
}
