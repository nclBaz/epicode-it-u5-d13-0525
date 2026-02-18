package riccardogulin.u5d13.chainofresponsibility;

public class AuthorizationFilter extends BaseFilter {
	@Override
	public void doFilter(User user) {
		if (user.getRole().equals("ADMIN")) {
			System.out.println("Benvenuto admin");
			this.next(user);
		} else {
			System.out.println("Solo gli admin possono accedere!");
		}
	}
}
