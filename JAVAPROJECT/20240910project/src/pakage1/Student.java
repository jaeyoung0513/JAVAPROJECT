package pakage1;

public class Student {
	private String id; // 멤버 변수에 접근 제한자를 두어 캡슐화 한다
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	
	Student (String pId, String pName) { // 일반 생성자 생성
		this.id = pId;
		this.name = pName;
	}
	
	String getId () {
		return this.id;
	}
	
	String getName () {
		return this.name;
	}
	
	int getKor () {
		return this.kor;
	}
	
	int getEng () {
		return this.eng;
	}
	
	int getMat () {
		return this.mat;
	}
	
	
	void setId (String pId) {
		this.id = pId;
	}
	
	void setName (String pName) {
		this.name = pName;
	}
	
	void setKor (int pKor) {
		this.kor = pKor;
	}
	
	void setEng (int pEng) {
		this.eng = pEng;
	}
	
	void setMat (int pMat) {
		this.mat = pMat;
		
	}
	
	
	
	

}
