
public class UserMain {

	public static void main(String[] args) {
		User user1 = new User();
		
		loginManager(user1);
		
		paymentManager(user1);
		
		user1.logout();

	}
	
	public static void loginManager(Login user) {
		user.login("admin", "1234");
	}
	
	public static void paymentManager(Payment user) {
		user.processPayment(50000);
		System.out.println(user.getPaymentStatus());
	}

}
