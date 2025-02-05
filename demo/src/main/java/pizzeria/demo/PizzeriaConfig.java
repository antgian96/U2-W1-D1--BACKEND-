import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

@Configuration
@PropertySource("classpath:application.properties")
public class PizzeriaConfig {

	@Value("${coperto.costo}")
	private double costoCoperto;

	@Bean
	public Topping prosciutto() {
		return new Topping("Prosciutto", 1.5);
	}

	@Bean
	public Topping ananas() {
		return new Topping("Ananas", 1.2);
	}

	@Bean
	public Pizza margherita() {
		Pizza pizza = new Pizza("Margherita", 5.0);
		pizza.aggiungiTopping(prosciutto());
		return pizza;
	}

	@Bean
	public Pizza hawaiian() {
		Pizza pizza = new Pizza("Hawaiian", 6.0);
		pizza.aggiungiTopping(prosciutto());
		pizza.aggiungiTopping(ananas());
		return pizza;
	}

	@Bean
	public Bevanda cocaCola() {
		return new Bevanda("Coca-Cola", 2.5);
	}

	@Bean
	public Bevanda acqua() {
		return new Bevanda("Acqua", 1.0);
	}

	@Bean
	public Tavolo tavolo1() {
		return new Tavolo(1, 4, "libero");
	}

	@Bean
	public Menu menu() {
		return new Menu(Arrays.asList(margherita(), hawaiian()), Arrays.asList(cocaCola(), acqua()));
	}

	@Bean
	public CommandLineRunner run(Menu menu, Tavolo tavolo1) {
		return args -> {
			tavolo1.setStato("occupato");
			Ordine ordine = new Ordine(1, tavolo1, 4, Arrays.asList(margherita(), hawaiian()), Arrays.asList(cocaCola(), acqua()), costoCoperto);
			ordine.stampaOrdine();
		};
	}
}

