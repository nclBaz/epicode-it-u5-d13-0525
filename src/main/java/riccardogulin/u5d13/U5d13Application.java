package riccardogulin.u5d13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import riccardogulin.u5d13.composite.Element;
import riccardogulin.u5d13.composite.Libro;
import riccardogulin.u5d13.composite.Page;
import riccardogulin.u5d13.composite.Section;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class U5d13Application {

	public static void main(String[] args) {

		SpringApplication.run(U5d13Application.class, args);

//		User user = new User("admin@mail.com", "1234", "ADMIN");
//
//		LoggerFilter loggerFilter = new LoggerFilter();
//		AuthenticationFilter authenticationFilter = new AuthenticationFilter();
//		AuthorizationFilter authorizationFilter = new AuthorizationFilter();
//
//		// Imposto l'ordine della catena
////		loggerFilter.setNext(authorizationFilter);
////		authenticationFilter.setNext(authorizationFilter);
//		// logger -> authentication -> authorization
//
//		authorizationFilter.setNext(authenticationFilter);
//		authenticationFilter.setNext(loggerFilter);
//		// authorization -> authentication -> logger
//
//		// Facciamo partire la catena
//		authorizationFilter.doFilter(user);

		Page page1 = new Page("Ciao");
		Page page2 = new Page("Page 2");
		ArrayList<Element> sections = new ArrayList<>();
		sections.add(page1);
		sections.add(page2);

		Section chapter1 = new Section(sections);

		Libro libro = new Libro("LOTR", "Tolkien", List.of(chapter1));
		libro.printContent();
		System.out.println("Totale pagine: " + libro.getNumberOfPages());


	}

}
