package riccardogulin.u5d13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import riccardogulin.u5d13.chainofresponsibility.AuthenticationFilter;
import riccardogulin.u5d13.chainofresponsibility.AuthorizationFilter;
import riccardogulin.u5d13.chainofresponsibility.LoggerFilter;
import riccardogulin.u5d13.chainofresponsibility.User;

@SpringBootApplication
public class U5d13Application {

	public static void main(String[] args) {

		SpringApplication.run(U5d13Application.class, args);

		User user = new User("admin@mail.com", "1234", "ADMIN");

		LoggerFilter loggerFilter = new LoggerFilter();
		AuthenticationFilter authenticationFilter = new AuthenticationFilter();
		AuthorizationFilter authorizationFilter = new AuthorizationFilter();

		// Imposto l'ordine della catena
//		loggerFilter.setNext(authorizationFilter);
//		authenticationFilter.setNext(authorizationFilter);
		// logger -> authentication -> authorization

		authorizationFilter.setNext(authenticationFilter);
		authenticationFilter.setNext(loggerFilter);
		// authorization -> authentication -> logger

		// Facciamo partire la catena
		authorizationFilter.doFilter(user);
	}

}
