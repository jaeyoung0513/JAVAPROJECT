package package1;

public class Car extends FourWheeler {

	public void printPrice() { // Vehicle->FourWheeler 클래스에서 상속받은 메서드
		System.out.println("가격 : 50,000,000");
	}
	public void printType() { // Car 클래스에서 선언한 메서드
		System.out.println("이것은 자동차입니다.");
	}
	public void printBrand() { // Car 클래스에서 선언한 메서드
		System.out.println("브랜드 : BMW");
	}
	

}
