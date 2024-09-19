
public class AbstractClass01 {

	public static void main(String[] args) {
//		Shape s1 = new Circle ("빨간색", 2.2);
//		Shape s2 = new Rectangle ("노란색", 2, 4);
//		
//		System.out.println(s1); // 투스트링 메서드가 컴파일에 의해 자동 실행된다
//		System.out.println(s2.toString());
		
		Circle c1 = new Circle("빨강",2.2);
		c1.count++;
		Circle c2 = new Circle("노랑",3.3);
		c2.count++;
		System.out.println(c1.count);

	}

}
