
public class Book{
    // Instance variables
    private String title;
    private String author;
    private Double price;
    
    // Constructor
    public Book (String title, String authorName, double price){
        title = title;
        authorName = authorName;
        price = price;
    }
    
    //Instance methods
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
    public String toString(){
        String all = "Book title: " + title +"\n"+ "Author: " + author +"\n"+ "Price: " + price;
        return all;
    }
}
