import java.util.Scanner;

public class InterfaceClass {

	public static void main(String[] args) {
//		Animal02 myPig = new Pig();
//		myPig.animalSound();
//		myPig.animalWalk();

//		System.out.println("동물선택 : 닭(1), 새(2)");
		Scanner s = new Scanner(System.in);
//		int select = s.nextInt();
//		switch(select) {
//		case 1:
//			InterfaceClass.animalFly(new Chicken());
//			InterfaceClass.animalWalk(new Chicken());
//			break;
//		case 2:
//			InterfaceClass.animalFly(new Bird());
//			InterfaceClass.animalWalk(new Bird());
//			break; }
		Animal[] subject = new Animal[4];
		int select;
		for (int i = 0; i < 4; i++) {
			System.out.println((i+1) + "번 연구 대상을 선택하세요 닭(1), 새(2)");
			select = s.nextInt();
			
			if (select!= 1 && select!=2) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				i--;
				continue;
			}
			
			
			switch (select) {
			case 1:
				System.out.println("닭을 선택하셨습니다.");
				subject[i] = new Chicken();
				break;
			case 2:
				System.out.println("새를 선택하셨습니다.");
				subject[i] = new Bird();
				break;
			}

		}
		System.out.println("연구 대상을 날려봅시다!!!");

		for (int i = 0; i < 4; i++) {
			System.out.print((i+1) + "번 연구 대상: ");
			subject[i].fly();;
		}

		System.out.println("연구 대상을 걷게 해봅시다!!!");
		

		for (int i = 0; i < 4; i++) {
			System.out.print((i+1) + "번 연구 대상: ");
			subject[i].walk();
		}

	}

	public static void animalFly(Fly animal) {
		animal.fly();
	}

	public static void animalWalk(Walk animal) {
		animal.walk();
	}

}
