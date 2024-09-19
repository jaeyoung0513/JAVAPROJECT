package package1;

public class AnimalSound {

	public static void main(String[] args) {
		Cat mycat = new Cat();
		
		mycat.printSound(); // 재정의(Override) 된 추상메서드
		mycat.displayInfo(); // 상속된(super) 메서드

	}

}
