package riccardogulin.u5d13.chainofresponsibility;

public class LoggerFilter extends BaseFilter {
	@Override
	public void doFilter(User user) {
		System.out.println("Ho ricevuto il seguente utente: " + user);
		this.next(user);
	}
}
