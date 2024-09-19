package pakage1;

import java.util.Scanner;

public class SoundofAnimal {

	public static void printanimalSound(Animal animal) {
		animal.animalSound();
	}

	public static void main(String[] args) {
//		Cat myCat = new Cat();
//		Kitten myKitten = new Kitten();
//		Animal jaeYoung = new Animal();
//		
//		myCat.sound();
//		myKitten.sound();
//	    jaeYoung.sound();

//		Animal myAnimal = new Animal();
//		Animal myPig = new Pig();
//		Animal myDog = new Dog();
//		
//		myAnimal.animalSound();
//		myPig.animalSound();
//		myDog.animalSound();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("동물을 선택하세요 (돼지(1),개(2),고양이는(3),새끼고양이(4))");
			int select = input.nextInt();

			if (select == 1) {
				SoundofAnimal.printanimalSound(new Pig());
				break;
			} else if (select == 2) {
				printanimalSound(new Dog()); // 같은 클래스에 있는 메서드이므로 클래스명을 안붙여도 상관없다
				break;
			}

			else if (select == 3) {
				SoundofAnimal.printanimalSound(new Cat());
				break;
			}

			else if (select == 4) {
				SoundofAnimal.printanimalSound(new Kitten());
				break;
			}
			
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			
		}

	}

}
