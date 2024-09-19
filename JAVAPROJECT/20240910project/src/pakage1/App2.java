package pakage1;

import java.
util.Scanner;

public class App2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Student[] stList = new Student[3];
		stList[0] = new Student("1654748","aa");
		stList[1] = new Student("2654321","bb");
		stList[2] = new Student("3446845","cc");
		
		System.out.println("<<시험성적을 입력하자.>>");
		
		for (int i = 0; i<stList.length; i++) {
			System.out.println(stList[i].getId()+"번 "+stList[i].getName()+"학생 점수를 입력해라.");
			
			System.out.print("국어 : ");
			int kor = s.nextInt();
			System.out.print("영어 : ");
			int eng = s.nextInt();
			System.out.print("수학 : ");
			int mat = s.nextInt();
			
			stList[i].setKor(kor);
			stList[i].setEng(eng);
			stList[i].setMat(mat);
		}
		
		System.out.println("모든 학생의 점수 입력이 끝났다.");
		
		for (int i = 0; i <stList.length; i++) {
			System.out.print("이름 : ");
			System.out.print(stList[i].getName()+" ");
			System.out.print("국어 : ");
			System.out.print(stList[i].getKor()+" ");
			System.out.print("영어 : ");
			System.out.print(stList[i].getEng()+" ");
			System.out.print("수학 : ");
			System.out.print(stList[i].getMat()+" ");
			System.out.print("총점 : ");
			System.out.print(stList[i].getKor()+stList[i].getEng()+stList[i].getMat()+" ");
			System.out.print("평균 : ");
			System.out.print((stList[i].getKor()+stList[i].getEng()+stList[i].getMat())/stList.length);
			System.out.println();
		}
		
		
		
		

//<<시험성적을 입력합니다.>>
//1번 aa학생 점수를 입력합니다.
//국어 : 입력
//영어 : 입력
//수학 : 입력
//2번 bb학생 점수를 입력합니다.
//국어 : 입력
//영어 : 입력
//수학 : 입력
//3번 cc학생 점수를 입력합니다.
//국어 : 입력
//영어 : 입력
//수학 : 입력
//		
//모든 학생의 점수 입력이 끝났습니다.
//이름 : aa 국어 : 90 영어 : 80 수학 :70 총점: 240 평균: 80
//이름 : aa 국어 : 90 영어 : 80 수학 :70 총점: 240 평균: 80
//이름 : aa 국어 : 90 영어 : 80 수학 :70 총점: 240 평균: 80

	}

}
