package package1;

import java.util.Scanner;

public class OverridingExample2 {

	public static void main(String[] args) {
		
		Application[] store = new Application[4];
		int select;
		
		store[0] = new Utilapp("카카오톡","(주)카카오", 1000);
		store[1] = new Utilapp("인스타그램","메타", 2000);
		store[2] = new Game("지뢰찾기","Micro Soft", 1500);
		store[3] = new Game("리니지","NC soft", 3000);
		
		SmartPhone myphone = new SmartPhone("01051873217","아이폰",100);
		
		while (true) {
		
		System.out.println("다음 프로그램 중 하나를 선택하세요: ");
		System.out.println("1:" + store[0].getAppName());
		System.out.println("2:" + store[1].getAppName());
		System.out.println("3:" + store[2].getAppName());
		System.out.println("4:" + store[3].getAppName());
		Scanner input = new Scanner(System.in);
		
		select = input.nextInt();
		
		if (select < 1 || select > 4) {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		
		if (myphone.isInstalledApp(store[select-1].getAppName())) {
			System.out.println("이미 설치되어 있는 앱 입니다.");
			continue;
		}
		else if (!myphone.isInstalledApp(store[select-1].getAppName())){
			myphone.installApps(store[select-1]);
			break;
		}
		
		}
		
		
		store[select-1].appRun();
		store[select-1].displayAppInfo();
		store[select-1].appStop();
		store[select-1].toString();
		

	}

}
