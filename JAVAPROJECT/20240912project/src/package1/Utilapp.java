package package1;

public class Utilapp extends Application {

	public Utilapp(String pAppName, String pAppCom, int pAppSize) {
		super(pAppName, pAppCom, pAppSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void appRun () {
		System.out.println(super.getAppName() + " 유틸리티 프로그램을 실행합니다.");
	}

}
