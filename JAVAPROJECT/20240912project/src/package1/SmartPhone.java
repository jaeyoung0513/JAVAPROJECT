package package1;

public class SmartPhone extends Phone {

	private String model;
	private Application[] apps;
	private int appCount = 0;

	public SmartPhone(String pPhoneNumber, String pModel, int pMaxAppCount) {
		super(pPhoneNumber);
		this.model = pModel;
		this.apps = new Application[pMaxAppCount];
	}

	void installApps(Application pApp) {
		this.apps[this.appCount++] = pApp;
		System.out.println(pApp.getAppName() + " 앱이 설치되었습니다.");
		System.out.println(this.appCount + "개의 앱이 스마프폰에 설치되었습니다.");
	}

	boolean isInstalledApp(String pAppName) {

		for (int i=0; i< this.appCount; i++) {
			if (this.apps[i].getAppName().equals(pAppName)) {
				return true;
			}
		}
		return false;

	}
	
	String getModel () {
		return this.model;
	}
	
	int getAppCount() {
		return this.appCount;
	}
	
	

}
