
public class Main{
    
	public static void main(String[] args) {
		Author myObj1 = new Author("Russel", "Winderand");
		Book myObj2 = new Book("The forbiden", "Russel Winderand", 79.75 );
		
		myObj1.setFirstName("Russel");
		myObj1.setLastName("Winderand");
		
		myObj2.setTitle("Developing Java Software");
		myObj2.setAuthor(myObj1.toString());
		myObj2.setPrice(79.75);
		
		System.out.println(myObj2.toString());
	}
}
