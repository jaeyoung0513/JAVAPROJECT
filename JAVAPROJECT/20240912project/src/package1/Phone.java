package package1;

public class Phone {
	
	private String phoneNumber;

	public Phone(String pPhoneNumber) {
		this.phoneNumber = pPhoneNumber;
	}
	
	void call () {
		System.out.println(this.phoneNumber + "에서 전화를 걸어 통화합니다.");
	}

}
