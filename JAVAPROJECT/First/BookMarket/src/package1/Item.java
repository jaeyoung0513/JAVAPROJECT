package package1;

public abstract class Item {
	
	private String bookId;
	private String bookName;
	private int price;
	
	public Item(String pBookId, String pBookName, int pPrice) {
		this.bookId = pBookId;
		this.bookName = pBookName;
		this.price = pPrice;
		
	}
	
	String getBookId () {
		return this.bookId;
	}
	String getBookName () {
		return this.bookName;
	}
	int getPrice () {
		return this.price;
	}
}
