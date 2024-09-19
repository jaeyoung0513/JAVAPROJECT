package pakage1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		
//		Student[] stList = new Student[3]; // 클래스의 배열은 보통 1차원으로 생성한다
//		
//		
//		for (int i = 0; i<stList.length; i++) {
//		System.out.println("학번을 입력하세요.");
//		String Id = s.nextLine();
//		
//		System.out.println("이름을 입력하세요.");
//		String Name = s.nextLine();
//		
//		stList[i] = new Student(Id, Name);
//		
//		
//		System.out.println("입력된 학생의 학번 : " + stList[i].getId());
//		System.out.println("입력된 학생의 이름 : " + stList[i].getName());
//		
//		}

		User[] userList = new User[5];
		userList[0] = new User("aa", "11");
		userList[1] = new User("bb", "22");
		userList[2] = new User("cc", "33");
		userList[3] = new User("dd", "44");
		userList[4] = new User("ee", "55");

		boolean flag = false;

		while (!flag) {

			System.out.print("ID를 입력하세요 : ");
			String id = s.nextLine();
			System.out.print("Password를 입력하세요 : ");
			String password = s.nextLine();

			int i;

			for (i = 0; i < 5; i++) {
				if (id.equals(userList[i].getId())) {
					if (password.equals(userList[i].getPw())) {
						flag = true;
						break;
					}
					System.out.println("패스워드가 틀렸습니다. ");
					break;
				}
			}

			if (flag) {
				break;
			} else if (i == 5) {
				System.out.println("잘못된 아이디 입니다.");
			}

			System.out.println("다시 입력해주세요");

		}

		System.out.println("로그인 성공.");

	}

}
