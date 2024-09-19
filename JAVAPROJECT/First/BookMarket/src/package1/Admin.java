package package1;

public class Admin extends PersonInfo {
	private final String ID="Admin";
	private final String PW="Admin1234";
	
	public Admin () {
		
	}
	

	public Admin(String pName, String pPhone) {
		super(pName, pPhone);
	}
	
	String getSuperName () {
		return super.getName();
	}
	
	String getSuperPhone () {
		return super.getPhone();
	}
	
	String getId () {
		return this.ID;
	}
	
	String getPw () {
		return this.PW;
	}

}
