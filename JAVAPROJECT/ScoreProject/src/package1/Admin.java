package package1;

public class Admin {
	
	private final String id = "Admin";
	private final String pw = "Admin1234";
	private String name;
	private String phone;
	
	public Admin(String pName, String pPhone) {
		this.name = pName;
		this.phone = pPhone;
	}
	
	String getName () {
		return this.name;
	}
	String getPhone () {
		return this.phone;
	}
	
	
}
