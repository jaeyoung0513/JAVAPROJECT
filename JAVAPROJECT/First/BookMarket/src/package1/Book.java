package package1;

public class Book extends Item {
	
	private String author;
	private String description;
	private String category;
	private String releaseDate;
	

	public Book(String pBookId, String pBookName, int pPrice, String pAuthor, String pDescription, String pCategory, String pReleaseDate) {
		super(pBookId, pBookName, pPrice);
		this.author = pAuthor;
		this.description = pDescription;
		this.category = pCategory;
		this.releaseDate = pReleaseDate;
	}
	
	String getAuthor() {
		return this.author;
	}
	String getDescription() {
		return this.description;
	}
	String getCategory() {
		return this.category;
	}
	String getReleaseDate() {
		return this.releaseDate;
	}

}
