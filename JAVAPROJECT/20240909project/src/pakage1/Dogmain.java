package pakage1;

public class Dogmain {
	
	

	public static void main(String[] args) {
//		Dog bori = new Dog("닥스훈트", "검정색");
//		System.out.println("보리의 품종 : " + bori.breed);
//		System.out.println("보리의 색깔 : " + bori.color);
//		
//		bori.eat();
//		bori.scratch();
//		bori.bowwow();
		
		Dogclass bori = new Dogclass();
		bori.setBreed("닥스훈트");
		bori.setColor("검정색");
		
		Dogclass bockSoon = new Dogclass();
		bockSoon.setBreed("풍산개");
		bockSoon.setColor("흰색");
		
		Dogclass bockDol = new Dogclass();
		bockDol.setBreed("풍산개");
		bockDol.setColor("흰색");
		
		System.out.println("보리의 품종,색 : " + bori.getBreed() + bori.getColor());
		System.out.println("복순의 품종,색 : " + bockSoon.getBreed() + bockSoon.getColor());
		System.out.println("복돌의 품종,색 : " + bockDol.getBreed() + bockDol.getColor());
				
		
	}

}
