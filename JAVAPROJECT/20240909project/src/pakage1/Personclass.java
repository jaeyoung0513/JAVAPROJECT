package pakage1;

public class Personclass {
	private String name;
	private String phone;
	private String addr;
	
	Personclass () {
	}
	
	Personclass (String pName, String pPhone, String pAddr) {
		this.name = pName;
		this.phone = pPhone;
		this.addr = pAddr;
	}
	
	String getName() {
		return this.name;
	}
	
	String getPhone() {
		return this.phone;
	}
	
	String getAddr() {
		return this.addr;
	}
	
	void setName(String pName) {
		this.name = pName;
	}
	
	void setPhone(String pPhone) {
		this.phone = pPhone;
	}
	
	void setAddr(String pAddr) {
		this.addr = pAddr;
	}
	
	

}
