package letsreview;

import java.util.Scanner;

public class Repeat0904 {

	public static void main(String[] args) {
		
//		int x = 10, y = 20; 
//		System.out.println("x + y = " + (x + y)); //30
//		System.out.println("x - y = " + (x - y)); //-10
//		System.out.println("x * y = " + (x * y)); //200
//		System.out.println("x / y = " + (x / y)); //0
//		System.out.println("x % y = " + (x % y)); //10 
		
//		int a = 10;
//		double b = 2.0;
//		System.out.println("a + b = " + (a + b)); // 12.0
//		System.out.println("a - b = " + (a - b)); // 8.0
//		System.out.println("a * b = " + (a * b)); // 20.0
//		System.out.println("a / b = " + (a / b)); // 5.0
//		System.out.println("a % b = " + (a % b)); // 0
		
//		int x = 10, y = 10;
//		System.out.println(x == 10);
//		System.out.println("x와 y는 같습니까?" + (x == y));
		
//		int a = 10, b = 25;
//		System.out.println("a == b = " + (a == b)); // false
//		System.out.println("a != b = " + (a != b)); // true
//		System.out.println("a > b = " + (a > b)); // false
//		System.out.println("a < b = " + (a < b)); // true
//		System.out.println("b >= a = " + (b >= a)); // true
//		System.out.println("b <= a = " + (b <= a)); // false
		
//		int x = 10;
//		System.out.println(x < 10 && x < 20); // false
//		System.out.println(x < 10 || x < 20); // true
//		System.out.println(!(x < 10 && x < 20)); // true
		
//		int a = 5, b = 10;
//		System.out.println(a > b); // false
//		System.out.println(!(a > b)); // true
//		System.out.println((a == b) && (a == 5)); // false
//		System.out.println((a != b) && (a == 5)); // true
//		System.out.println(!((a != b) && (a == 5))); // false
		
//		int x = 10;
//		System.out.println(x); // 10
//		x += 2;
//		System.out.println(x); // 12
//		x *= 2;
//		System.out.println(x); // 24
//		x -= 2;
//		System.out.println(x); // 22
		
//		int a = 10, b = 20;
//		int c;
		
//		System.out.println(c = a); // 10
//		System.out.println(b += a); // 30
//		System.out.println(b -= a); // 20
//		System.out.println(b *= a); // 200
//		System.out.println(b %= a); // 0
		
//		int x = 10;
//		System.out.println(x++); // 10
//		System.out.println(++x); // 12
//		System.out.println(x--); // 12
//		System.out.println(--x); // 10
		
//		int a = 10, b = 10, c = 10, d = 10;
//		
//		System.out.println("a++ => " + (a++)); // a++ => 10
//		System.out.println("a => " + a); // a = 11
//		System.out.println("++b => " + (++b)); // ++b => 11
//		System.out.println("c-- => " + (c--)); // c-- => 10
//		System.out.println("--d => " + (--d)); // --d => 9
		
//		double d = 3.14;
//		long l = (long)d;
//		int i = (int)l;
//		System.out.println(d); // 3.14
//		System.out.println(l); // 3
//		System.out.println(i); // 3
		
//		int x = 10;
//		double y = 3.0;
//		
//		System.out.println(x / y); // 3.3333333333333335
//		System.out.println(x / (int) y); // 3
//		System.out.println((int) (x / y)); // 3
		
		
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("당신의 이름을 입력하세요 : ");
//		String name = input.nextLine();		
//		System.out.print("당신의 이름 : " + name);
		
//		Scanner s1 = new Scanner(System.in);
//		
//		System.out.println("정수값 입력하기");
//		int n = s1.nextInt();
//		
//		System.out.println("실수값 입력하기");
//		double db = s1.nextDouble();
//		
//		System.out.println("정수값 : " + n);
//		System.out.println("실수값 : " + db);
		
//		int num = 10;
//		if (num > 15) {
//			System.out.println("숫자가 15보다 큽니다.");
//		}
//		System.out.println("이 문장은 if문 외부에 있습니다.");
		
//		System.out.println("당신의 나이를 입력하세요.");
//		
//		Scanner s = new Scanner(System.in);
//		int age = s.nextInt();
//		
//		if (age >= 18) {
//			System.out.println("당신의 나이는 18세 이상입니다.");
//			System.out.println("당신은 투표할 권한이 있습니다.");
//		}
//		else {
//		System.out.println("당신은 투표할 권한이 없습니다.");
//		}
		
		
//		System.out.println("숫자를 입력하세요.");
//		
//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		
//	    if (num%2 == 0) {
//	    	System.out.println(num + "은 짝수입니다.");
//	    }
//		
//	    else {
//	    	System.out.println(num + "은 홀수입니다.");
//	    }
		
		
		
		
		
		
		
		
	    Scanner s = new Scanner(System.in);
			
		System.out.print("입력할 정수의 개수를 적어주세요 : ");
		int n = s.nextInt();
		
		int sum = 0;
		
		if (n > 0) {  
	            for (int i = 1; i <= n; i++) {
	                System.out.print(i + "번째 정수 : ");
	                int p = s.nextInt();
	                sum += p;
	            }
	        }
		
		System.out.print("정수의 총합 : " + sum);
		
				
		
		
		

	}

}
