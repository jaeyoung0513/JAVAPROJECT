package pakage1;

public class Dogclass {
	private String breed; // 멤버변수 : 객체의 특성을 표현하는 변수 (대체적으로 멤버 변수 선언은 private 으로 접근 제한을 한다)
	private String color;
	
	Dogclass() {
		System.out.println("Dog() 생성자를 호출합니다.");
	}
	
	Dogclass(String br,String co) {
		System.out.println("Dog(...) 생성자를 호출합니다.");
	    this.breed = br; //this.breed 라고 정확하게 명시할 수 있음.
	    this.color = co;
	}
	
	String getBreed() { // 읽기 접근자 설정
		return this.breed;
	}
	
	String getColor() {
		System.out.println();
		return this.color;
	}
	
	boolean setBreed(String a) { // 쓰기 접근자 설정 (조건을 추가하여 쓰기에 제한을 둘 수 있다)
		if(a.length()<=10) {
		this.breed = a;
		return true;
		}
		return false;
	}

	void setColor(String a) {
		this.color = a;
	}
	
	void eat() {
		System.out.println("먹이를 먹다"); // 지역변수 
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	void bowwow() {
		System.out.println("멍멍하고 짖다");
	}

}
