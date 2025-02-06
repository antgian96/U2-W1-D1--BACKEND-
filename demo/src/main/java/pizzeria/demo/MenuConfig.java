@Configuration
public class MenuConfig {
    private final ToppingRepository toppingRepository;
    private final PizzaRepository pizzaRepository;
    private final DrinkRepository drinkRepository;

    public MenuConfig(ToppingRepository toppingRepository, PizzaRepository pizzaRepository, DrinkRepository drinkRepository) {
        this.toppingRepository = toppingRepository;
        this.pizzaRepository = pizzaRepository;
        this.drinkRepository = drinkRepository;
    }

    @Bean
    public Topping prosciutto() {
        return toppingRepository.save(new Topping("Prosciutto", 2.0));
    }

    @Bean
    public Pizza margherita() {
        return pizzaRepository.save(new Pizza("Margherita", 5.0));
    }

    @Bean
    public Drink cocaCola() {
        return drinkRepository.save(new Drink("Coca Cola", 2.5, "Calories: 150"));
    }
}
