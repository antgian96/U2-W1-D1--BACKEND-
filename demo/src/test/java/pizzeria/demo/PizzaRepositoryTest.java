public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    Pizza findByNome(String nome);
}
@SpringBootTest
public class PizzaRepositoryTest {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Test
    public void testFindByNome() {
        Pizza pizza = pizzaRepository.findByNome("Margherita");
        assertNotNull(pizza);
        assertEquals("Margherita", pizza.getNome());
    }
}
