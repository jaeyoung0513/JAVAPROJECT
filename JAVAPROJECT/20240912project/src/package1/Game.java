package package1;

public class Game extends Application {

	public Game(String pAppName, String pAppCom, int pAppSize) {
		super(pAppName, pAppCom, pAppSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void appRun () {
		System.out.println(super.getAppName() + "게임을 실행합니다.");
	}

}
