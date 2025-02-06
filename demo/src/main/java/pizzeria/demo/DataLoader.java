@Component
public class DataLoader implements CommandLineRunner {
    private final PizzaRepository pizzaRepository;
    private final DrinkRepository drinkRepository;
    private final ToppingRepository toppingRepository;

    public DataLoader(PizzaRepository pizzaRepository, DrinkRepository drinkRepository, ToppingRepository toppingRepository) {
        this.pizzaRepository = pizzaRepository;
        this.drinkRepository = drinkRepository;
        this.toppingRepository = toppingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        pizzaRepository.findAll().forEach(pizza -> System.out.println("Pizza: " + pizza.getNome()));
        drinkRepository.findAll().forEach(drink -> System.out.println("Drink: " + drink.getNome()));
    }
}
