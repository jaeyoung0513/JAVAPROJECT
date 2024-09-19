package pakage2;

public class Square extends Shape {
	
	private Point leftTop;
	private Point rightBottom;

	public Square(String pBrushColor, String pPenColor,Point pLeftTop, Point pRightBottom) {
		super(pBrushColor, pPenColor);
		this.leftTop = pLeftTop;
		this.rightBottom = pRightBottom;
	}
	
	@Override
	void drawing() {



		
		System.out.println("왼쪽 위 좌표:" + this.leftTop.x +","+this.leftTop.y + " 오른쪽 아래 좌표 :" + this.rightBottom.x +"," + this.rightBottom.y + "의 사각형이 그려집니다.");
	}
	
	Point getLeftTop () {
		return this.leftTop;
	}
	
	Point getRightBottom () {
		return this.rightBottom;
	}

}
