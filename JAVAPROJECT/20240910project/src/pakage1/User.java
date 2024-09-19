package pakage1;

public class User {
	
	private String id; // 멤버 변수에 접근 제한자를 두어 캡슐화 한다
	private String pw;
	
	User (String pId, String pPw) { // 일반 생성자 생성
		this.id = pId;
		this.pw = pPw;
	}
	
	String getId () {
		return this.id;
	}
	
	String getPw () {
		return this.pw;
	}
	
	
	void setId (String pId) {
		this.id = pId;
	}
	
	void setPw (String pPw) {
		this.pw = pPw;
	}
	

}
