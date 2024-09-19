package pakage1;

public class SubKitten  extends SuperCat {
	String age = "2살";
	
	SubKitten (String pSuperBreed, String pSuperAge, String pKittenAge) {
		super(pSuperBreed,pSuperAge);
		this.age = pKittenAge;
	}
	
	void printInfo() {
		System.out.println("아기고양이 입니다");
	}
	void printDetail() {
		super.printInfo();
		System.out.println("품종은 " + super.breed + ", 나이는 " + super.age);
		printInfo();
		System.out.println("아기고양이는 " + this.breed + ", 나이는 " + this.age);
	}
	String getSuperAge () {
		return super.age;
	}

}
