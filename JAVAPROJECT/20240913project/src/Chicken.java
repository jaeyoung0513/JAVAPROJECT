
public class Chicken extends Animal implements Fly, Walk {

	@Override
	public void walk() {
		System.out.println("닭은 땅에 먹이를 쪼아 먹으며 걷는다.");
	}

	@Override
	public void fly() {
		System.out.println("닭은 40cm 날 수 있다..");
	}

}
