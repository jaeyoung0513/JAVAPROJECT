package package1;

public class PageProcess {
	private Student[] stuList = null;
	private MenuManager menu = null;
	private Admin admin = null;
	private int scoreCount = 0;
	private final int STU_COUNT=3;
	
	public PageProcess() {
		this.menu = new MenuManager();
		this.stuList = new Student[3];
		
	}
	

}
