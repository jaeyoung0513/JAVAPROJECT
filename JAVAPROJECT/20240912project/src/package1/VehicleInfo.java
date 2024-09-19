package package1;

public class VehicleInfo {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Car myCar = new Car();
		
//		Bike bike=null;
//		if(myBike instanceof Bike) { // 동적으로 업캐스팅된 객체를 확인할 때 쓸 수 있다
		Bike bike =(Bike) myBike; // 이를 사용하여 다운캐스팅을 할 수 있다
//		}
		
		myBike.printType(); // TwoWheeler 부터 상속되어 Bike 클래스에서 재정의된 추상 메서드
		bike.printBrand(); // 업캐스팅된 myBike 변수를 Bike 클래스로 다운캐스팅하여 새로운 bike 변수로 재선언하여 안보이던 메서드를 생성 가능.
		myBike.printPrice(); // Vehicle 슈퍼클래스에서 부터 상속되어 Bike 클래스에서 재정의된추상 메서드
		System.out.println("-------------");
		myCar.printType();
		myCar.printBrand();
		myCar.printPrice(); // Vehicle 슈퍼클래스에서 부터 상속되어 Car 클래스에서 재정의된추상 메서드

	}

}
