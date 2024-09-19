package pakage1;

import java.util.Scanner;

public class App {
	
//	public static void calculate(int x, double y) {
//		
//		System.out.println(2 * x * y);
//		
//	}

//	public static void calculate(int x, int y) {
//
//		System.out.println(x * y);
//
//	}
//	
//	public static void calculate(int x) {
//
//		System.out.println(x * x);
//
//	}
	
//	public static int calculate(int x) { // return 가능한 메서드를 오버로딩해도 이름과 매개변수가 같으면 같은 메서드로 인식되어 에러
//
//		return x*x;
//
//	}
	
//	public static void calculate(int x, double y) {
//
//		System.out.println(x * y);
//
//	}
//	
//	public static void calculate(double x) {
//
//		System.out.println(x * x);
//
//	}
	
//	public static int sum(int x, int y) {
//
//		return (x + y);
//
//	}
//	
//	public static int sum(int x, int y,int z) {
//
//		return (x + y + z);
//
//	}
//	
//	public static double sum(double x, double y) {
//
//		return (x + y);
//
//	}
	
	
	

	public static void main(String[] args) {
//		int a = 4;
//		final double PI = 3.14;
//		System.out.println("원의 둘레 구하는 공식 : 2 x a x 원주율 ");
//		
//		System.out.print
//		("2 x" + a + "x" + PI + "= ");
//		calculate(a,PI);
		
//		calculate(2,3);
//		calculate(2,3.14);
//		calculate(2);
//		calculate(2.5);
		
//		System.out.println("sum(10,20)의 값 : " + sum(10,20));
//		System.out.println("sum(10,20,30)의 값 : " + sum(10,20,30));
//		System.out.println("sum(10.5,20.5)의 값 : " + sum(10.5,20.5));
		
//		int[] myArr = new int[100];
//		
//		for (int i=0; i<100; i++) {
//		myArr[i]=(i+1)*10;
//		}
//		
////		myArr[0] = 10;
////		myArr[1] = 20;
////		myArr[2] = 30;
////		myArr[3] = 40;
////		myArr[4] = 50;
//		
//		for (int i = 0; i<100; i++) {
//			System.out.println(i + "번째 요소값 : " + myArr[i]);
//		}
		
//		String[] myArr; // 배열 선언
//		myArr = new String[3]; // 메모리 할당
//		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("3개 문자열을 입력하세요.");
//		
//		for (int i = 0; i < 3; i++) {
//			myArr[i] = s.nextLine();
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print(myArr[i] + "");
//		}
		
//		int[] myArr = {10, 20, 30, 40, 50};
//		
//		for (int i = 0; i < myArr.length; i++) {
//			System.out.println(i+"번째 요소값: "+ myArr[i]);
//		}
		
//		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
//		double sum = 0;
//		
//		for (int i = 0; i < gradeArr.length; i++) {
//			sum += gradeArr[i];
//		}
//		
//		double average = sum / gradeArr.length;
//		
//		
//		System.out.println("합계 : " + sum);
//		System.out.format("평균: %.0f ",average);
		
//		int[][] myArr = new int[2][4];
//		myArr[0][0] = 2;
//		myArr[0][1] = 5;
//		myArr[0][2] = 7;
//		myArr[0][3] = 4;
//		myArr[1][0] = 9;
//		myArr[1][1] = 3;
//		myArr[1][2] = 2;
//		myArr[1][3] = 8;
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 4; i++) {
//				if (i==0) {
//				sum1 += myArr[0][i];
//				}
//				else {
//					sum2 += myArr[1][i];
//					}
//			}
//		}
//			
//		System.out.println("첫번째 행의 합계 : " + sum1);
//		
//		System.out.println("두번째 행의 합계 : " + sum2);
		
		
		//학생 점수 평균 구하기 예제
		
//		final int CNT=2;//학생의 수
//		String[] title = {"국어점수 : ","수학점수 : "};
//		double[][] marks = new double[2][title.length+1]; // 배열 크기는 합계를 위해 마지막 열에 +1
//		Scanner s = new Scanner(System.in);
//		
//		for(int i = 0; i < title.length; i++) {
//			System.out.println("학생번호" + (i+1)); // i가 0이므로 +1 해주자... (학생번호0은 이상하자나..)
//			for(int j=0; j < CNT; j++) {  // 과목별 점수를 입력받기 위해 중첩반복문을 써주자!
//				System.out.print(title[j]); //String 배열로 과목명 불러옴
//				marks[i][j] = s.nextDouble(); 
//				marks[i][title.length]+= marks[i][j];
//			}
//			marks[i][title.length] = marks[i][title.length]/title.length; // 여기서 쓰이는 열의 숫자는 크기가 아니다!!!!
//		}
//		for (int i = 0; i < CNT; i++) {
//			System.out.println("학생번호" + (i + 1));
//			for (int j = 0; j < title.length; j++) {
//				System.out.print(title[j]+ marks[i][j] + " ");
//			}
//			System.out.println("평균: " + marks[i][title.length]);			
//		}
		
//		int[][] firstMatrix = { {2,3,4}, {3,2,1} };
//		int[][] secondMatrix = { {1,2,3}, {-4,-2,1} };
//		
////		int rows = 2, columns=3;
//		int rows = firstMatrix.length, columns = firstMatrix[0].length; // 선생님 오렌지
//		
//		int[][] sum = new int[rows][columns];
//		for (int i=0; i < rows; i++) {
//			for (int j=0; j<columns; j++) {
//				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
//			}
//		}
//		
//		System.out.println("두 행렬의 합: ");
//		for (int i=0; i < rows; i++) {
//			for (int j=0; j<columns; j++) {
//				System.out.print(sum[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(sum[0].length);
		
		
//		String s = " Java Programming ";
//		String b = s;
		
//		System.out.println("s.length() : " + s.length());
//		System.out.println("s.charAt(1) : " + s.charAt(1));
//		System.out.println("s.substring(6) : " + s.substring(6));
//		System.out.println("s.substring(5,13) : " + s.substring(5,13));
//		System.out.println("s.indexOf('P') : " + s.indexOf('P'));
//		System.out.println("s.toLowerCase() : " + s.toLowerCase());
//		System.out.println("s.toUpperCase() : " + s.toUpperCase());
//		
//		System.out.println(s);
//		System.out.println(b);
//		s=s.toUpperCase();
//		System.out.println(s);
//		System.out.println(s.charAt(3));
//		System.out.println(b==s);
		
		String s = " Java Programming ";
		String s1 = "Java ";
		String s2 = "Programming";
		String s3 = s1.concat(s2);  // concat 은 앞과 뒤를 이어주는 메서드
		String s4 = s.trim();
		
		System.out.println("s3 " + s3);
		System.out.println("s4 " + s4);
		System.out.println("s3.equals(s4) " + s3.equals(s4));
		System.out.println("s.replace('J','S')" + s.replace('J','S'));
		
//		String s1 = new String("java");
//		String s2 = new String("java");
//		String s3 = s1;
//
//		if (s1 == s2)
//			System.out.println("s1과 s2는 같다");
//
//		else
//			System.out.println("s1과 s2는 같지않다");
//
//		if (s1 == s3)
//			System.out.println("s1과 s3는 같다");
//
//		else
//			System.out.println("s1과 s3는 같지않다");
//
//		if (s1.equals(s2))
//			System.out.println("s1과 s2의 값은 같다");
//
//		else
//			System.out.println("s1과 s2는 값은 "
//					+ "같지않다");
		
	}

}
 