package pakage2;

public class Triangle extends Shape {
	private Point top;
	private Point left;
	private Point right;

	public Triangle(String pBrushColor, String pPenColor,Point pTop, Point pLeft, Point pRight) {
		super(pBrushColor, pPenColor);
		
		this.top = pTop;
		this.left = pLeft;
		this.right = pRight;
	}
	
	@Override
	void drawing() {
		System.out.println("면색:" + super.getBrushColor() + " 선색:" + super.getPenColor() + " 의 도형이 그려집니다.");
		System.out.println("위 좌표:" + this.top.x + ","+this.top.y + " 왼쪽 좌표:" + this.left.x+ "," + this.left.y + " 오른쪽 좌표:" + this.right.x+ "," + this.right.y + "의 삼각형이 그려집니다.");
	}
	
	Point Top () {
		return this.top;
		
	}
	
	Point getLeft () {
		return this.left;
	}
	
	Point getRight () {
		return this.right;
	}

}
