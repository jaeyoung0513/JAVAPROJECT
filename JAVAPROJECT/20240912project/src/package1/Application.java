package package1;

public class Application {

	private String appName;
	private String appCom;
	private int appSize;

	public Application(String pAppName, String pAppCom, int pAppSize) {
		this.appName = pAppName;
		this.appCom = pAppCom;
		this.appSize = pAppSize;
	}

	public void appRun() {

	}

	public void appStop() {
		System.out.println(this.appName + "애플리케이션을 종료합니다.");
	}
	
	public void displayAppInfo () {
		System.out.println("앱 정보 : " + this.appName + 
				" 앱 제작사 : " + this.appCom + 
				" 앱 용량 : " + this.appSize);
	}
	
	@Override
	public String toString () {
		return "Application [Appname=" + this.appName + " Company=" + this.appCom + " Size=" + this.appSize + "]";
	}
	
	String getAppName () {
		return this.appName;
	}
	
	String getAppCom () {
		return this.appCom;
	}
	
	int getAppSize () {
		return this.appSize;
	}

}
