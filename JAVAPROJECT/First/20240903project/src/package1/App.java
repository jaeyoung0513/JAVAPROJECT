package package1;

public class App {

	public static void main(String[] args) {
 
		/*
		변수명은 영문자(대·소문자), 숫자, 밑줄(_), 달러 기호($)로만 구성할 수 있음 
		(되도록 소문자로 시작, 여러 단어일 경우 카멜 형식을 이용하자)
		변수명은 숫자로 시작할 수 없음 
		변수명에는 공백을 포함할 수 없음
		자바에서 미리 정의된 키워드를 변수명으로 사용할 수 없음
		*/
		
//		int speed = 10; /* 정수를 표현하는 변수는 통상적으로 int 자료형을 사용한다 */
//		int days = 20;
//
//		System.out.println(speed);
//		System.out.println(days);
//		System.out.println(speed + days);


//		final int SPEED=40;  /* 상수는 final 키워드를 이용하여 선언함 */
//	
//		int count = 10;
//		//SPEED=40; /* SPEED는 상수 변수이기 떄문에 에러발생*/
//		count=14; /* 상수가 아닌 int 값은 변경이 가능하다 */
//		System.out.println("상수 SPEED 값은 ");
//		System.out.println(SPEED);
//		System.out.println("변수 count 값은 ");
//		System.out.println(count);

//		final double PI = 3.14; /* 상수를 지정하고 상수를 사용하여 연산을 해보자 */
//		System.out.println("반지름이 3인 원의 넓이를 구합니다");
//		System.out.print(3 * 3 * PI);
//		System.out.println("입니다");
//		System.out.println(5 / 2.0); /* 정수와 정수를 연산할 경우 소수점이 표현되지 않고 정수만 나온다. 실수가 필요할 경우 둘중 하나만 실수로 바꿔줘도 된다. */
//		
		
//		int a = 10;
//		short s = 2;
//		byte b = 6;
//		long l = 125362133223L; /* long 자료형 구분을 위해 숫자뒤에 꼭 L를 붙여주자(에러 발생) */
//		System.out.println(a);
//		System.out.println(s);
//		System.out.println(b);
//		System.out.println(l);
		
//			
//		float f = 65.20298f; // float은 f를 지우면 에러가 남
//		double d = 876.765; // 오류 최소화를 위해 실수는 double 자 료형을 사용하는 것이 좋다
//		System.out.println(f);
//		System.out.println(d); 
//		
//		char ch = 'J'; //(한 단어만 쓰는 경우는 거의 없기 때문에 해당 자료형은 자주 사용되진 않는다)
//		char ch1 = 'a';
//		char ch2 = 'v';
		
//		System.out.println(ch);
//		System.out.println(ch1); 
//		System.out.println(ch2); 
//		System.out.println(ch3); 
//		System.out.printf("%d %d %d %d\n", (int)ch, (int)ch1, (int)ch2, (int)ch3);
//		System.out.printf("%c %c %c %c\n", ch, ch1, ch2, ch3);
//		System.out.println(ch+ch1+ch2+ch3);
// 
//		String str = "Java";
//		String str2 = "Program"; 
//		String str3 = str+' '+str2; // 작은 따옴표는 문자 하나를 표현할 때 사용한다
//		System.out.println(str);
//		System.out.println(str2);
//		System.out.println(str3);
//		
//		boolean t = true;
//		boolean f = false;
//		
//		System.out.println(t);
//		System.out.println(f);
//
//		String myName = "류재영"; // 문자열 자료형 변수	
//		int myAge = 32; // 정수 자료형
//		System.out.println("이름: "+ myName);
//		System.out.print("나이: " + myAge); 
//		
//		System.out.println("Java\\\\ Program");
//		String myName = "류재영";
//		int myAge = 32;
//		System.out.print("이름 :\t" + myName + "\n");
//		System.out.print("나이 :\t" + myAge + "\n");
		
		int x = 10, y = 20;
		System.out.println("x + y = " + (x + y));		
		System.out.println("x - y = " + (x - y));
	}

}