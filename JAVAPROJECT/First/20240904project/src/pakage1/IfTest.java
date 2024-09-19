package pakage1;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

//		int num = 30;
//		if(num > 15) {
//			System.out.println("숫가 15보다 큽니다.");
//		}
//		
//		System.out.println("이 문장은 if문 외부에 있습니다.");

//		System.out.println("당신의 나이를 입력하세요.");
//		
//		Scanner s = new Scanner(System.in); // 키보드 입력의 객체변수는 s
//		int age = s.nextInt();
//		
//		if( age >= 18) {
//			System.out.println("당신의 나이는 18세 이상입니다.");
//			System.out.println("당신의 투표할 자격이 있습니다.");
//			
//		}
//			System.out.println("이 문장은 if문 외부에 있습니다.");
//			

//		int num = 49;
//		
//		if (num < 50) {
//			System.out.println("숫자가 50보다 작습니다.");
//		}
//		else {
//			System.out.println("숫자가 50 이상입니다.");
//		}

//		System.out.print("숫자를 입력하세요 : ");
//		
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		
//		if( num % 2 == 0) {
//			System.out.println(num + "은 짝수입니다.");
//		}
//		else {
//			System.out.println(num + "은 홀수입니다.");
//		}
//			
//		System.out.println("이 문장은 if문 외부에 있습니다.");

//		System.out.print("(0~100)사이의 점수를 입력하세요 : ");
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		
//		if (num > 100 || num < 0) {
//            System.out.println("입력범위를 벗어난 점수 입니다.");
//        }
//		else {
//			System.out.println(num + "점이 입력되었습니다.");
//		}

//		int num = 25;
//		
//		if(num == 10) {
//			System.out.println("숫자가 10 입니다.");
//		}
//		else if(num == 15) {
//			System.out.println("숫자가 15 입니다.");    // ~else if 예제 (조건문이 얼마나 많이 붙든 결국은 하나만 실행된다)
//		}
//		else if(num == 20) {
//			System.out.println("숫자가 20 입니다.");
//		}
//		else {
//			System.out.println("숫자가 존재하지 않습니다.");
//		}

//		System.out.println("점수를 입력하세요.");
//
//		Scanner s = new Scanner(System.in);
//		int grade = s.nextInt();
//
//		if (grade < 0 || grade > 100) {
//			System.out.println("점수는 0에서 100 사이의 값이어야 합니다.");
//		}
//
//		else {
//
//			if (grade >= 90) {
//				System.out.println("A 학점");
//			} else if (grade >= 80) {
//				System.out.println("B 학점");
//			} else if (grade >= 70) {
//				System.out.println("C 학점");
//			} else if (grade >= 60) {
//				System.out.println("D 학점");
//			} else {
//				System.out.println("F 학점");
////			}
//		}
		
//		int num = 70;
//		if (num < 100) {
//			System.out.println("숫자가 100보다 작습니다.");
//			if (num > 70) {
//				System.out.println("숫자가 50보다 큽니다.");
//			}
//		}
		
//		System.out.println("3개의 숫자를 입력하세요.");
//		
//		Scanner s = new Scanner(System.in);
//		
//		int x = s.nextInt();
//		int y = s.nextInt();
//		int z = s.nextInt();
//		
//		if (x >= y) {
//			if (x > z) {
//				System.out.println(x + "는 가장 큰 정수입니다.");
//			}
//			else {
//				System.out.println(x + "는 가장 큰 정수가 아닙니다.");
//			}
//		}
//		else {
//			System.out.println(x + "는 가장 큰 정수가 아닙니다.");
//		}
		
//		char grade = 'A';
//		
//		switch (grade) { // 간단한 조건문일 경루 다중 if 보다 switch 케이지가 더 가독성이 좋다. 스위치 케이지의 괄호 안에는 연산자가 들어갈 수 있으나 정수값이 나와야한다.
//		case 'A' :
//			System.out.println("매우 우수");
//			break; // 속해 있는 블록을 탈출한다(반복문에서도 쓰임). 
//		case 'B' :
//			System.out.println("우수");
//			break;
//		case 'C' :
//			System.out.println("좋음");
//			break;
//		case 'D' :
//			System.out.println("쫌 만 더 열심히");
//			break;
//		case 'F' :
//			System.out.println("개망");
//			break;
//		default:
//			System.out.println("잘못된 등급");
//		
//		}
//		
//		System.out.print("점수를 입력하세요 : ");
//		
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		
		
//		if (num>=0 & num<=100) {
//		switch (num / 10) {
//		case 10 :
//		case 9 :
//			System.out.println("A 학점");
//			break;
//		case 8 : 
//			System.out.println("B 학점");
//			break;
//		case 7 : 
//			System.out.println("C 학점");
//			break;
//		case 6 : 
//			System.out.println("D 학점");
//			break;
//		default : 
//			System.out.println("F 학점");
//			break;
//		}
//		
//		
//		}
//		else {
//			System.out.println("점수를 잘못 입력하셨습니다.");
//		}
//		
//		if (num>=0 & num<=100) {  //위 switch 조건문을 if 조건문으로 바꿔보자
//			if (num>=90) {
//				System.out.println("A 학점");
//			}
//			else if (num>=80) {
//				System.out.println("B 학점");
//			}
//			else if (num>=70) {
//				System.out.println("C 학점");
//			}
//			else if (num>=60) {
//				System.out.println("D 학점");
//			}
//			else {
//				System.out.println("F 학점");
//			}
//		}
//		else {
//			System.out.println("잘못 입력 하셨습니다.");
//		}
//		
		
//		int i; // for문 예제
//		
//		for (i=1; i<= 10; i++) {
//			System.out.print(i+" ");
//		}
//		
//		
//		int sum = 0;
//		int sum1 = 0;
//		System.out.println("5개의 숫자를 입력하세요.");
//		
//		Scanner s = new Scanner(System.in);
//		
//		for(int n=1; n <= 100; n++) { // for문 과 if 문 중첩
////			
////			int num = s.nextInt();
//			if (n%2 == 0) {
//			sum += n; 
//			}
//			else {
//			sum1 += n;
//			}
//		}
//		
//		System.out.println("짝수합계 : " + sum);
//		System.out.println("홀수합계 : " + sum1);
		
//		int sum = 0;
//		
//		for(int n=1; n <= 100; n++) {
//			if (n%3 != 0) {
//				sum += n;
//			}
//		}
//		
//		
//		System.out.println("3의 배수를 뺀 합계 : " + sum);
		
//		System.out.println("점수를 입력하세요.");
//		
//		Scanner mbc = new Scanner(System.in);
//		int num = mbc.nextInt();
//		
//		num += 10;
//		
//		num -= 2;
//		
//		
//		System.out.println(num);
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("입력할 정수의 갯수를 입력하세요 : ");
//		int a = s.nextInt();
//		int sum = 0;
//		
//		if(a>0) {
//		
//		
//		for(int i=1; i <= a; i++  ) {
//			System.out.print(i + "번째 숫자 : ");
//			int b = s.nextInt();
//			sum += b;
//				
//				
//			}
//		}
		
		
//		System.out.print("입력한 정수의 합계는 " + sum + " 입니다.");
	    
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("(0~100)까지의 수중에 하나를 선택하여 5개 입력하세요.");
//		
//		int max = 0;
//		boolean flag = false;
//
//		for (int i = 1; i <= 5; i++) {
//
//			int num = s.nextInt();
//
//			if (num < 0 || num > 100) {
//				System.out.print("입력범위가 잘못되었습니다.");
//				flag = true;
//				break; // for 문을 나감.
//			}
//
//			if (max < num) {
//				max = num;
//			}
//		}
//		
//		
//
//		if (!flag) {
//			System.out.println("입력된 수중에 최댓값은" + max + "입니다.");
//		}
		
//		Scanner s = new Scanner(System.in);
//		int choice = 1;
//		while (choice == 1) {
//			System.out.println("숫자를 입력하세요.");
//			int a = s.nextInt();
//			
//			if (a%2 == 0) {
//				System.out.println("짝수 입니다.");
//			}
//			else {
//				System.out.println("홀수 입니다.");
//			}
//			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");
//			
//			choice = s.nextInt();
//			
//		}
//		System.out.println("모든 숫자를 확인했습니다.");
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("10보다 큰 숫자를 입력하세요.");
//		int x = s.nextInt();
//		int sum = 0;
//		
//		do {
//			sum += x;
//			x--;
//		}while (x>=10);
//		
//		System.out.println("합계 : " + sum);
		
//		for (int i=0; i<=2; i++) 
//		{
//			for (int j=0; j<=(1-i); j++) {
//				System.out.print(" ");
//			}
//			for (int j=0; j<=(i*2); j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//			
//		}
		
		
		
//		for (int i=1; i<=3; i++) 
//			{
//				for (int j=1; j<=j-i; j++) {
//					System.out.print(" ");
//				}
//				for (int j=1; j<=i; j++) {
//					System.out.print("*");
//				}
//				System.out.print("\n");
//				
//			}
		
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 3; j++) {
//				if (i==3 && j==2) {
//					continue;
//				}
//				System.out.println(i + "*" + j);
//			}
//		}
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("(0~100)까지의 수중에 하나를 선택하여 5개 입력하세요.");
//		
//		int max = 0;
//
//		for (int i = 1; i <= 5; i++) {
//
//			int num = s.nextInt();
//
//			if (num < 0 || num > 100) {
//				System.out.print("입력범위가 잘못되었습니다. 다시 입력해주세요");
//				continue; // 다시 입력
//			}
//
//			if (max < num) {
//				max = num;
//			}
//		}
//
//		System.out.println("입력된 수중에 최댓값은" + max + "입니다.");
		
		
		
		
		
Scanner s = new Scanner(System.in);
		
		System.out.println("(0~100)까지의 수중에 하나를 선택하여 5개 입력하세요.");
		
		int max = 0;
		int cnt = 0;

		while(max<101) {

			int num = s.nextInt();

			if (num < 0 || num > 100) {
				System.out.println("입력범위가 잘못되었습니다. 다시 입력해주세요");
				continue;
			}
			
			cnt++;

				max = num;
				
				if (cnt == 5) {
					break;
				}
		
		} 

		System.out.println("입력된 수중에 최댓값은" + max + "입니다.");
		
		
		
		
		

	}
}
