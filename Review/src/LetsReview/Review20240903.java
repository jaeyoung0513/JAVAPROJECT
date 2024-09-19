package LetsReview;
  //패키지는 기능을 기반으로 클래스를 구성하는 데 사용됨

public class Review20240903 /*클래스명은 대부분 첫 글자가 대문자로 시작함*/

{  
	public static void main(String[] args) {
		/*main 메서드는 자바 가상 머신(JVM)에서 호출해야 하기 때문에 반드시 어디서나 
		 *접근 가능해야 합니다. 그래서 public(공용)으로 선언됩니다.*/
		/*static 키워드는 "정적"이라는 의미를 가지고 있습니다. 
		 * 정적 메서드는 인스턴스(객체)를 생성하지 않고도 호출할 수 있습니다.*/
		/*void는 "리턴 값이 없다"는 뜻입니다. 메서드가 어떤 값도 
		 * 반환하지 않음을 나타냅니다.*/

	
		System.out.println("Hello Jaeyoung");
		System.out.println( ); // 괄호 안의 내용을 출력한 후 줄바꿈
		System.out.print("안녕하세요\n"); // 괄호 안의 내용을 출력한 후 줄바꿈하지 않음
		/* 작은따옴표는 한글자만 입력가능하고 2글자이상은 큰따옴표를 사용한다*/
		
		/*변수 선언의 기본 형식
		• 변수를 사용하려면 먼저 변수를 선언해야 함 (예 : int myVar;)
		→자료형(data type): 변수에 저장할 수 있는 데이터의 유형
		→변수명(variable name): 메모리 주소를 대신하는 메모리 주소의 이름을 지정
		*/
		/* ■변수 초기화 
		 * • 지정된 메모리 위치에 값을 입력하는 것 
		 * • 변수 초기화는 변수 선언과 동시에 값을 할당하는 것
		 */ 
		int days = 10; // 변수를 선언함과 동시에 초기화한 예시
		System.out.println(days); // days 변수 출력됨
		
		int speed; // 변수를 선언하기만 하고 초기화는 하지 않은 상태
		speed = 20; // 변수에 값을 할당하여 초기화한 상태
		System.out.println(speed); 
		
		/*
		 * ■상수 변수
		 * • 프로그램이 실행되는 동안 메모리에 저장된 데이터를 변경할 수 없고 
		 *   반드시 선언 과 동시에 초기화해야 함 
		 *   • 상수는 final 키워드를 이용하여 선언함
		 */
		final int AGE = 32;
		// AGE = 40; // error 상수 변수이므로 초기화하여 값을 변경할 수 없다
		int count = 10;
		count = 11; // 상수 변수가 아니므로 초기화하여 값을 변경할 수 있다
		System.out.print("상수 AGE 값은"+' ');
		System.out.println(AGE);
		System.out.print("변수 count 값은"+' ');
		System.out.println(count);
	
		final double PI = 3.14; // 상수 변수 파이를 이용하여 연산하기 예시
		/* double 이라는 자료형은 통상적인 실수를 나타낼 때 사용된다. */
		System.out.print("반지름 3인 원의 넓이는"+' ');
		System.out.println(3 * 3 * PI);
		
		int a = 10; // 4바이트의 저장공간 (32비트)
		short s = 6; // 2바이트의 저장공간 (16비트)
		byte b = 2; // 1바이트의 저장공간 (8비트)
		long l = 125362133223L; // 8바이트의 저장공간 (64비트) 
		System.out.println(a + s + b + l);
		/* 위 자료형은 모두 정수 자료형이며 통상적으로는 'int' 가 사용된다. */
		
//		float f = 65.20298f; // 4바이트의 저장공간
//		double d = 876.765d; // 8바이트의 저장공간 
//		System.out.println(f);
//		System.out.println(d);
		/* 위 자료형은 모두 실수 자료형이며 통상적으로는 'double' 이 사용된다. */
		
		char ch = 'J'; 
		/*• 문자와 숫자 등 문자 집합의 기호를 나타내는 데 사용함
		  • 작은따옴표로 값을 묶어 표현함*/
		char ch2 = 'a';
		char ch3 = 'v';
		char ch4 = 'a';
		System.out.print(ch);
		System.out.print(ch2);
		System.out.print(ch3);
		System.out.print(ch4);
		System.out.printf('\n' + "%c%c%c%c\n", ch, ch2, ch3, ch4);
		
		/* ■문자열 자료형 
		 * • 문자열을 저장하는 데 사용함 
		 * • 큰따옴표로 값을 묶어 표현함
		 * • String 자료형은 클래스에 해당하므로 반드시 대문자로 시작해야 함
		 */
		String str = "Java";
		String str2 = "Program";
		
		System.out.print(str);
		System.out.println(' ' + str2);
		
		/*■불리언 자료형 
		 * • boolean 자료형 (1byte) 
		 * • 값은 true와 false, 두 가지뿐임 
		 * • if 또는 while과 같은 제어문을 제어하는 조건식에 사용함
		 */
		boolean t = true;
		boolean f = false;
		
		System.out.println(t);
		System.out.println(f);
		
		
		/*문자열과 변수를 결합하여 출력하여 보자*/
		String myName = "류재영";
		int myAge = 32;
		System.out.println("이름 :  " + myName);
		System.out.println("나이 :  " + myAge);
		
		/*■이스케이프 문자 출력
		 * • 자바에는 이스케이프 문자를 표현하는 다양한 이스케이프 시퀀스가 있음
		 * \b=백스페이스(\b 뒤에 문자나 공백을 출력하면, 앞에 출력된 글자를 지운다), 
		 * \b 뒤에 아무런 출력이 없다면 화면의 변화도 없다
		 * \t=탭, 
		 * \n=줄 바꿈(Enter), 
		 * \r=캐리지 리턴(줄바꿈 없이 출력 커서를 맨 앞으로 이동한다, 
		 * 이때 기존에 출력된 문자를 덮어쓸 수 있다) 
		 * \"=큰따옴표를 출력한다
		 * \'=작은따옴표를 출력한다
		 * \\=역슬래시 하나를 출력한다
		 */
		
	}

}
	
