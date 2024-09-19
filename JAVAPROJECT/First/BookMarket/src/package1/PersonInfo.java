package package1;

public class PersonInfo {
	
	private String name;
	private String phone;
	
	PersonInfo () {
		
		
	}
	
	
	PersonInfo (String pName, String pPhone) {
		this.name = pName;
		this.phone = pPhone;
	}
	
	String getName () {
		return this.name;
	}
	
	String getPhone () {
		return this.phone;
	}
	
	void setName (String pName) {
		this.name = pName;
	}
	
	void setPhone (String pPhone) {
		this.phone = pPhone;
	}

}

