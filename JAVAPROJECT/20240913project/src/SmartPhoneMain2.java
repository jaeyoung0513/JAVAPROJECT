
public class SmartPhoneMain2 {

	public static void main(String[] args) {
		SmartPhoneImpl2 phone = new SmartPhoneImpl2(); // Application -> SmartDevice (인터페이스간를 상속받은 인터페이스) -> SmartPhoneImpl2 (다단계 인터페이스를 상속받은 클래스)
		
		SmartDevice s = phone; // SmartPhoneImpl2 -> SmartDevice 인터페이스 클래스로 참조변수 정의
		s.turnOn();
		Phone p = phone; // SmartDevice -> Phone 인터페이스에서 인터페이스로 참조변수 정의 
		p.call();
		Application a = phone; // SmartDevice -> Application 상위 타입 참조변수 정의
		a.appRun();
		

	}

}
