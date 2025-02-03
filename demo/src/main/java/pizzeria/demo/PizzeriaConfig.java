package pizzeria.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
public class PizzeriaConfig {

	@Bean
	public Topping prosciutto() {
		return new Topping("Prosciutto", 1.5);
	}

	@Bean
	public Topping ananas() {
		return new Topping("Ananas", 1.2);
	}

	@Bean
	public Topping doppioProsciutto() {
		return new Topping("Doppio Prosciutto", 2.0);
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
	public Menu menu() {
		return new Menu(Arrays.asList(margherita(), hawaiian()), Arrays.asList(cocaCola(), acqua()));
	}
}
