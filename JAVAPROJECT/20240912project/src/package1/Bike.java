package package1;

public class Bike extends TwoWheeler {

	public void printPrice() { // Vehicle->TwoWheeler 클래스에서 상속받은 메서드
		System.out.println("가격 : 150,000");
	}
	public void printType() { // TwoWheeler 클래스에서 상속받은 메서드
		System.out.println("이것은 자전거입니다.");
	}
	public void printBrand() {
		System.out.println("브랜드 : 삼천리");
	}
	
}
