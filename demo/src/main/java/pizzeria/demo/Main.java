@SpringBootApplication
public class PizzeriaApplication implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        menu.stampaMenu();
        List<Object> ordineElementi = Arrays.asList(menu.pizze().get(0), menu.bevande().get(0));
        Ordine ordine = new Ordine(1, 4, ordineElementi);
        ordine.stampaOrdine();
    }

    public static void main(String[] args) {
        SpringApplication.run(PizzeriaApplication.class, args);
    }
}
