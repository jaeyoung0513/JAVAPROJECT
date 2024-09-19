
public class User implements Payment, Login {

	boolean login_flag = false;
	String PaymentStatus = null;

	@Override
	public void login(String id, String pw) {
		if (id.equals("admin") && pw.equals("1234")) {
			this.login_flag = true;
			System.out.println(id + "님 로그인이 성공했습니다.");
		}
		else {
			System.out.println("로그인 정보가 틀렸습니다.");
			this.login_flag = false;
		}
		

	}

	@Override
	public void logout() {
		System.out.println("로그아웃 했습니다.");
		this.login_flag = false;
	}

	@Override
	public boolean isLogin() {
		return this.login_flag;
	}

	@Override
	public void processPayment(int money) {
		if (this.login_flag) {
			System.out.println(money + "원이 결재되었습니다.");
			this.PaymentStatus = "주문에 대한 결재가 완료되었습니다.";

		} else {
			this.PaymentStatus = "로그인이 되지않아 결재가 불가합니다.";

		}

	}

	@Override
	public String getPaymentStatus() {
		return this.PaymentStatus;
	}

}
