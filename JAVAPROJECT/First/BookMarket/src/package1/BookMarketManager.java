package package1;

import java.util.Scanner;

public class BookMarketManager {
	private Book[] mBook;
	private PersonInfo user=null;
    private Cartinfo cart = null;
	public BookMarketManager() {
		mBook = new Book[3];
		mBook[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 프로그래밍", "IT전문서",
				"2018/10/08");
		mBook[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링", "IT전문서", "2022/01/22");
		mBook[2] = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문", "2019/06/10");
		
		this.cart=new Cartinfo();
		
	}
	
	public void menuIntroduction() {
		System.out.println("**********************************************");
		System.out.println("\tWelcome to Shopping Mall");
		System.out.println("\tWelcome to Book Market!");
		System.out.println("**********************************************\n");
		System.out.print("1. 고객 정보 확인하기\t");
		System.out.println("4. 바구니에 항목 추가하기");
		System.out.print("2. 장바구니 상품 목록 보기\t");
		System.out.println("5. 장바구니의 항목 수량 줄이기");
		System.out.print("3. 장바구니 비우기\t\t");
		System.out.println("6. 장바구니의 항목 삭제하기");
		System.out.print("7. 영수증 표시하기\t\t");
		System.out.println("8. 종료");
		System.out.println("9. 관리자 로그인");
		System.out.println("**********************************************");
	}

	public void printBookList() {
		for (int i = 0; i < mBook.length; i++) {
			System.out.print(mBook[i].getBookId() + " | " + mBook[i].getBookName() + " | " + mBook[i].getPrice() + " | "
					+ mBook[i].getAuthor() + " | " + mBook[i].getDescription() + " | " + mBook[i].getCategory() + " | "
					+ mBook[i].getReleaseDate()); // 각 요소를 출력
			System.out.println(); // 한 행 출력 후 줄 바꿈
		}
	}
	
	public void menu1Guestinfo() {

		System.out.println("1. 현재 고객 정보 :");
		System.out.println("이름 " + user.getName() + " " + "연락처 " + user.getPhone());
	}

	public void menu2CartitemList() {
		System.out.println("장바구니 상품 목록 보기");

		

	}

	public void menu3CartClear() {

	}

	public void menu4CartAddItem() {

		Scanner input = new Scanner(System.in);
		System.out.println();

		printBookList();

		int search_index = -1;

		boolean bookFound = false;
		System.out.println();

		while (!bookFound) {

			System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
			String bookID = input.next();

			for (int i = 0; i < 3; i++) {
				if (bookID.equals(mBook[i].getBookId())) {

					search_index = i;
					break;
				}
			}
			if (search_index == -1) {
				System.out.println("도서의 ID를 확인해주세요.");
				continue;
			}

			System.out.println("장바구니에 " + mBook[search_index].getBookId() + "을(를) 추가 하시겠습니까? Y | N");
			String yn = input.next();
			Book selectBook = mBook[search_index];

			// 'Y' 또는 'N' 입력 처리
			if (yn.equalsIgnoreCase("Y")) {
				if (cart.isCartInBook(bookID)) {
					cart.increaseBookCount(bookID);
				} else {
					Cartitem cartitemList = new Cartitem(mBook[search_index]);
				}
				System.out.println("\n" + "\"" + mBook[search_index].getBookId() + "\" \"" + mBook[search_index].getBookName()
						+ "\" 장바구니에 추가되었습니다.");

				break;
			} else if (yn.equalsIgnoreCase("N")) {
				System.out.println("추가가 취소되었습니다.");
				search_index = -2;

				continue;
			}

			if (!yn.equalsIgnoreCase("Y") && !yn.equalsIgnoreCase("N")) {
				System.out.println("잘못된 입력입니다. Y 또는 N을 입력해주세요.");
				continue;
			}
			bookFound = true;

		}

	}

	public void menu5CartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}

	public void menu6CartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}

	public void menu7CartBill() {
		System.out.println("7. 영수증 표시하기");
	}

	public void menu8Exit() {
		System.out.print("정상적으로 종료 되었습니다.");
	}
	
	public void menu9AdminLogin() {

		while (true) {

			System.out.println("관리자 정보를 입력하세요.");
			Scanner input = new Scanner(System.in);
			System.out.print("아이디: ");
			String id = input.nextLine();
			System.out.print("비밀번호: ");
			String pw = input.nextLine();

			Admin admin = new Admin(user.getName(), user.getPhone());

			if (admin.getId().equals(id) && admin.getPw().equals(pw)) {
				System.out.println("이름 : " + admin.getName() + "    연락처 : " + admin.getPhone());
				System.out.println("아이디 : " + admin.getId() + "    비밀번호 : " + admin.getPw());

				break;
			} else if (!admin.getId().equals(id)) {
				System.out.println("없는 아이디 입니다. 다시 입력해주세요");
			} else if (!admin.getPw().equals(pw)) {
				System.out.println("패스워가 틀렸습니다. 다시 입력해주세요");
			}

		}

	}
	
	public void run() {

		Scanner input = new Scanner(System.in);

		System.out.print("당싱의 이름을 입력하세요 : ");
		String name = input.next();

		System.out.print("연락처를 입력하세요 : ");
		String phone = input.next();

		user = new PersonInfo(name, phone);

		while (true) {
			menuIntroduction();
			int menu;
			do {
				System.out.print("메뉴 번호를 선택해주세요 (1-9): ");
				menu = input.nextInt();

				if (menu < 1 || menu > 9) {
					System.out.println("잘못된 입력입니다. 1부터 9 사이의 숫자를 입력해주세요.");
				}

			} while (menu < 1 || menu > 9);

			switch (menu) {
			case 1: // 현재 고객 정보
				menu1Guestinfo();
				break;
			case 2: // 장바구니 상품 목록 보기
				menu2CartitemList();
				break;
			case 3:
				menu3CartClear();
				break;
			case 4: // 장바구니에 항목 추가하기
				menu4CartAddItem();
				System.out.println();
				break;
			case 5: // 장바구니의 항목 수량 줄이기
				menu5CartRemoveItemCount();
				break;
			case 6:
				menu6CartRemoveItem();
				break;
			case 7:
				menu7CartBill();
				break;
			case 8:
				menu8Exit();
				break;
			case 9:
				menu9AdminLogin();
				break;
			}

			if (menu == 8) {
				break;
			}

		}
	}


}
