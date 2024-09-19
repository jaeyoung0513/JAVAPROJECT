package package1;

public class Cartinfo {

	private Cartitem[] cartitemList = new Cartitem[3];
	private static int cartCount = 0;
	public final static int NODATA = -1;
	
	public Cartinfo() {
		this.cartitemList = new Cartitem[3];
		
	}
	
	public void printCart() {
		
		if (this.cartCount == 0) {
			System.out.println("장바구니가 비어있습니다.");
			return;
		}
		
		System.out.println("장바구니 상품 목록 보기");
		System.out.println("-------------------------------------------");
		System.out.println("도서ID\t\t|수량\t|총 가격");
		
			for (int i = 0; i < cartCount; i++) {
				if (cartitemList[i] != null) {
					System.out.println((i+1) + " " +cartitemList[i].getbookId() + "\t" + cartitemList[i].getQnty() + "\t" + cartitemList[i].getPrice() + "원");
				}
			}
		

		
	}
	
	public int getCartCount() {
		return this.cartCount;
	}
	
	public void insertBook(Book pBook) {
		this.cartitemList[this.cartCount++] = new Cartitem(pBook);
	}
	
	public boolean isCartInBook(String pBookID) {

		for (int i = 0; i < cartCount; i++) {
			if (pBookID.equals(this.cartitemList[i].getbookId())) {
				return true;
			}
		}
		return false;
	}
	
	public void increaseBookCount (String pBookId) {
		for(int i=0; i<this.cartCount; i++) {
			if (this.cartitemList[i].getbookId().equals(pBookId)) {
				this.cartitemList[i].increaseCount();
				break;
			}
		}
	}
	
	public void decreaseBookCount (String pBookId) {
		for(int i=0; i<this.cartCount; i++) {
			if (this.cartitemList[i].getbookId().equals(pBookId)) {
				this.cartitemList[i].decreaseCount();
				if(this.cartitemList[i].getQnty()==0) {
					String bookName = this.cartitemList[i].getBookInfo().getBookName();
					System.out.println(bookName + "항목이 장바구니에서 삭제되었습니다.");
					this.removeCartitem(i);
				}
				break;
			}
		}
	}
	
	public void removeCartitem(int num) {
		Cartitem[] recentList = new Cartitem[3];
		int index = 0;
		
		for (int i=0; i < cartCount; i++) {
			if(i!=num) {
				recentList[index++] = this.cartitemList[i];
			}
		}
		this.cartCount--;
		
		this.cartitemList=recentList;
	}
	
	public void deleteCartitem() {
		this.cartitemList=new Cartitem[3];
		this.cartCount=0;
	}
	

}
