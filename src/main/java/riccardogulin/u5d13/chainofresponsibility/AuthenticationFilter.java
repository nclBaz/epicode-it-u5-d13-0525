package riccardogulin.u5d13.chainofresponsibility;

public class AuthenticationFilter extends BaseFilter {
	@Override
	public void doFilter(User user) {
		if (user.getEmail().equals("admin@mail.com") && user.getPassword().equals("1234")) {
			System.out.println("Credenziali ok");
			this.next(user);
		} else {
			System.out.println("Credenziali errate");
		}
	}
}
