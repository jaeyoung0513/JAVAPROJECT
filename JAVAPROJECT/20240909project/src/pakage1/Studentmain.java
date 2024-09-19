package pakage1;

public class Studentmain {

	public static void main(String[] args) {
		
//		Student stOb1 = new Student();
//		
//		stOb1.id = 20221004; // 멤버 변수를 호출하여 데이터를 저장
//		stOb1.name = "정수현";
//		stOb1.printInfo();
//		
//		Student stOb2 = new Student();
//		stOb2.insertRecord(20021005, "정수갱"); // 입력이 가능한 멤버 메서드에 정보를 전달
//		stOb2.printInfo(); 
//		
		// stOb1 과 stOb2는 다른 객체이지만 같은 클래스의 멤버 변수를 사용했다. (정보전달의 방식이 다를뿐)

		System.out.println("****학생 주소록****");
		Studentclass stObj1 = new Studentclass();
		
		stObj1.insertRecord(20221004, "정수현");
		stObj1.printInfo();
		
		Studentclass stObj2 = new Studentclass(20221005,"정수갱");
		stObj2.printInfo();

	}

}
