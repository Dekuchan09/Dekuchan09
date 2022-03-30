import java.util.*;

public class comsoc {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char userInput;
		
		System.out.println("====================================");
		System.out.println("Type the number of the program. (e.g. like '1')");
		System.out.println("1. Denominator");
		System.out.println("2. Count the vowels and consonant");
		System.out.println("3. Multiplication Table");
		System.out.println("====================================");
		userInput = scan.next().charAt(0);
		
		switch (userInput){
			case '1':
				int den[]={1000,500,100,50,20,10,5,2,1}; //storing all the denominations in an array
				System.out.print("Enter any Amount: "); //Entering an amount
				int amount = scan.nextInt();

				int copy = amount; //Making a copy of the amount
				int totalNotes = 0,count = 0;

				System.out.println("DENOMINATIONS:");

				for(int i=0;i<9;i++) {
					//Since there are 9 different types of notes, hence we check for each note.
					count = amount/den[i]; // counting number of den[i] notes
					if(count!=0) {
						//printing that denomination if the count is not zero
						System.out.println(den[i] + "    x    " + count + "    = " + den[i]*count);
					}

					totalNotes = totalNotes + count; //finding the total number of notes
					amount = amount%den[i]; //finding the remaining amount whose denomination is to be found
				}

				System.out.println("--------------------------------");
				System.out.println("TOTAL            = " + copy); //printing the total amount
				System.out.println("--------------------------------");
				System.out.println("Total Number of Notes    = "+totalNotes); //printing the total number of notes
			
			break;
			
		case '2':
				System.out.print("Enter string: ");
				String s = scan.next();

				int countv = 0, countc = 0, spaces =0;
				for(int i=0;i<s.length();i++) {

					char x = Character.toLowerCase(s.charAt(i));
					if(x == 'a'|| x == 'e' || x == 'i' || x == 'o' || x == 'u')
						countv++;
					//if character is not a,e,i,o,u and is a letter then its a consonant
					else if(Character.isLetter(x))
						countc++;
				}

				System.out.println("Number of vowels = " + countv);
				System.out.println("Number of consonants = " + countc);
			break;
			
			case '3':
				int multiplicationTable = 0;
				System.out.print("Enter a number for the Multiplication Table:");
				multiplicationTable = scan.nextInt();
			
				for(int i = 1; i <= 10; ++i)
				{
					System.out.printf("%d * %d = %d \n", multiplicationTable, i, multiplicationTable * i);
				}			
				
			break;
						
			default:
			
			break;			
		}
			
	}
} 