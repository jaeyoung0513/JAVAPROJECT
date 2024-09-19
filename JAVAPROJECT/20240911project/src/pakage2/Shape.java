package pakage2;

public abstract class Shape {
	
	private String brushColor;
	private String penColor;
	
	public Shape (String pBrushColor, String pPenColor) {
		this.brushColor = pBrushColor;
		this.penColor = pPenColor;
	}
	
	abstract void drawing();
	
	String getBrushColor () {
		return this.brushColor;
	}
	
	String getPenColor () {
		return this.penColor;
	}

}
