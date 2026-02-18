package riccardogulin.u5d13.chainofresponsibility;

import lombok.Setter;

@Setter
public abstract class BaseFilter {
	private BaseFilter next;

	public abstract void doFilter(User user);

	public void next(User user) {
		if (this.next != null) this.next.doFilter(user); // Se c'è un next andiamo avanti con la catena
		else System.out.println("Catena terminata");
	}
}
