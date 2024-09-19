package pakage1;

public class Studentclass {
	int id;
	String name;
	
	Studentclass () {
		System.out.println("기본 생성자 Student() 호출");
	}
	
	Studentclass (int a, String b) {  
		System.out.println("일반 생성자 Student(...) 호출");
		this.id = a;
		this.name = b;
	}
	
	void insertRecord(int a, String b) { //parm은 매개 변수를 뜻한다
		this.id = a; // this 는 지역변수가 아닌 멤버 변수임을 뜻한다 (Student 객체)
		this.name = b; // static 현재 객체가 없으므로 멤버변수를 설정할 수 없다
	}
	
	void printInfo() { // 메서드를 정적으로 만들지 않은 이유 = 멤버 변수에 접근이 안되기 때문.
		System.out.println("아이디: " + this.id);
		System.out.println("이름: " + this.name);
	}


}
