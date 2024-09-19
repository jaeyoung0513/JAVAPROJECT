package package1;

import java.util.Scanner;

public class OverridingExample {

	public static void main(String[] args) {
		
//		Utilapp[] util = new Utilapp[2];
//		Game[] game = new Game[2];
		
		Application[] app = new Application[4];
		
		app[0] = new Utilapp("카카오톡","(주)카카오", 1000);
		app[1] = new Utilapp("인스타그램","메타", 2000);
		app[2] = new Game("지뢰찾기","Micro Soft", 1500);
		app[3] = new Game("리니지","NC soft", 3000);
		
		System.out.println("다음 프로그램 중 하나를 선택하세요: ");
		System.out.println("1:" + app[0].getAppName());
		System.out.println("2:" + app[1].getAppName());
		System.out.println("3:" + app[2].getAppName());
		System.out.println("4:" + app[3].getAppName());
		Scanner input = new Scanner(System.in);
		
		int select = input.nextInt();
		
		if (select < 1 || select > 4) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		app[select-1].appRun();
		app[select-1].displayAppInfo();
		app[select-1].appStop();
		app[select-1].toString();
	
		

	}

}

