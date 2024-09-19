package pakage1;

import java.util.Scanner;

public class Personmain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Personclass[] personList = new Personclass[10];
		boolean exitFlag = false;
		int cnt = 0;

		while (cnt < personList.length && !exitFlag) {
			System.out.print("이름 : ");
			String name = s.nextLine();
			System.out.print("전화번호 : ");
			String phone = s.nextLine();
			System.out.print("주소 : ");
			String addr = s.nextLine();

			personList[cnt] = new Personclass(name, phone, addr);

			cnt++;
			while (true) {
				System.out.print("계속 입력하시겠습니까? (Y|N) : ");
				String yn = s.nextLine();
				if (!yn.equalsIgnoreCase("y") && !yn.equalsIgnoreCase("n")) {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				else if (yn.equalsIgnoreCase("n")) {
					exitFlag = true;
					break;
				}
				else {
					break;
				}
				
			}
		}

		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 사람의 정보");
			System.out.println("이름 : " + personList[i].getName());
			System.out.println("전화번호 : " + personList[i].getPhone());
			System.out.println("주소 : " + personList[i].getAddr());
		}

	}

}
