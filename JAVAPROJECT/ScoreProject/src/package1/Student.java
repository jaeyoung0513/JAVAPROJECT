package package1;

public class Student extends Score{

	private String sId;
	private String name;
	private int korScore;
	private int engScore;
	private int matScore;

	public Student(String pSid, String pName) {

		this.sId = pSid;
		this.name = pName;

	}

	String getName() {
		return this.name;
	}

	String getSid() {
		return this.sId;
	}

	int getKorScore() {
		return this.korScore;
	}

	int getEngScore() {
		return this.engScore;
	}

	int getMatScore() {
		return this.matScore;
	}

	void setKorScore(int pKorScore) {
		this.korScore = pKorScore;
	}

	void setEngScore(int pEngScore) {
		this.engScore = pEngScore;
	}

	void setMatScore(int pMatScore) {
		this.matScore = pMatScore;
	}

}
