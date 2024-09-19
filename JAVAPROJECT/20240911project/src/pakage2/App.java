package pakage2;

import java.util.Scanner;

public class App {
	
	public static void shapeDrawing(Shape shape) {
		shape.drawing();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("그릴 도형을 선택하세요 (삼각형:1, 사각형:2)");
		int select = input.nextInt();
		
		if (select == 1) {
			Triangle tri = new Triangle("노랑","파랑",new Point(42,34),new Point(12,1),new Point(14,2));
			App.shapeDrawing(tri);
		}
		else if (select == 2) {
			Square square1 = new Square("검정","빨강",new Point(12,43),new Point(25,13));
			App.shapeDrawing(square1);
		}
		
//		Shape a = new Shape("s","a"); // abstract 클래스는 상속한 클래스를 통해서만 객체를 형성할 수 있다;
		

	}

}
