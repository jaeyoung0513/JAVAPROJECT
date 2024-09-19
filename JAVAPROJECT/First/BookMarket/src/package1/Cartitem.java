package package1;

public class Cartitem {
	
	private Book bookInfo;
	private String bookId;
	private int qnty;
	private int price;
	
	Cartitem (Book pBookInfo) {
		
		this.bookInfo = pBookInfo;
		this.bookId =  this.bookInfo.getBookId();
		this.qnty = 1;
		this.price = this.bookInfo.getPrice(); // Integer 문자열을 정수로 자료형 변환 해주는 메서드
		
	}
	
	Book getBookInfo () {
		return this.bookInfo;
	}
	
	String getbookId () {
		return this.bookInfo.getBookId();
	}
	
	int getQnty () {
		return this.qnty;
	}
	
	int getPrice () {
		return this.bookInfo.getPrice();
	}
	
	void increaseCount() {
		this.qnty++;
		this.price = this.price * this.qnty;
	}
	
	void decreaseCount() {
		this.qnty--;
		this.price = this.price * this.qnty;
	}
	
	// item, price 변수는 외부에서 설정할 수 없도록 set 메서드를 뺀다

}
