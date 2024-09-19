package package1;

import java.util.Scanner;

public class MenuManager {
	public final static int ADMIN_LOGIN = 1;   
	public final static int EXIT = 2;   
	public final static int INPUT_SCORE = 1;   
	public final static int SEARCH_SCORE = 2;   
	public final static int PRINT_SCORE = 3; 
	public final static int LOGOUT = 4; 
	
	public void initMenu() {
		System.out.println("<< 성적처리 >>");
		System.out.println("1. 관리자 로그인");
		System.out.println("2. 종료");
		selectInitMenu();
	}
	
	public void ScoreMenu() {
		System.out.println("<< 성적처리 >>");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 검색");
		System.out.println("3. 전체 성적 출력");
		System.out.println("4. 로그아웃");
		selectScoreMenu();
	}
	
	public int selectInitMenu() {
		Scanner input = new Scanner(System.in);
		int select;
		
		while(true) {
			select = input.nextInt();
			input.nextInt();
			if(select<ADMIN_LOGIN || select>EXIT) {
				System.out.println("메뉴 선택이 잘못되었습니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
		
		return select;
		
	}
	
	public int selectScoreMenu() {
		Scanner input = new Scanner(System.in);
		int select;
		
		while(true) {
			select = input.nextInt();
			input.nextInt();
			if(select<INPUT_SCORE || select>LOGOUT) {
				System.out.println("메뉴 선택이 잘못되었습니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
		
		return select;
		
	}
	

}
