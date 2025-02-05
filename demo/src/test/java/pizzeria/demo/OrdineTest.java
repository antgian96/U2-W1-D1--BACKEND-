import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class OrdineTest {

    @Test
    public void testCalcoloImportoTotale() {
        Pizza pizza = new Pizza("Margherita", 5.0);
        Drink cocaCola = new Drink("Coca Cola", 2.5, "Calories: 150");

        // Creiamo un ordine con una pizza e una bevanda
        Ordine ordine = new Ordine(1, 4, Arrays.asList(pizza, cocaCola));

        // Il totale dovrebbe essere 5.0 (pizza) + 2.5 (beverage) + 4 coperti * 1.0 = 12.5
        assertEquals(12.5, ordine.getImportoTotale(), "L'importo totale dell'ordine dovrebbe essere 12.5");
    }
    @Test
    public void testStatoOrdineECoperti() {
        Pizza pizza = new Pizza("Margherita", 5.0);
        Ordine ordine = new Ordine(1, 4, Arrays.asList(pizza));

        ordine.setStato("In corso");

        assertEquals("In corso", ordine.getStato(), "Lo stato dell'ordine dovrebbe essere 'In corso'");
        assertEquals(4, ordine.getCoperti(), "Il numero di coperti dell'ordine dovrebbe essere 4");
    }

    @ParameterizedTest
    @CsvSource({
            "Margherita, 5.0, Coca Cola, 2.5, 12.5", // Una pizza e una bevanda
            "Margherita, 5.0, Acqua, 1.0, 11.0",    // Una pizza e una bevanda economica
            "Hawaiian, 7.0, Coca Cola, 2.5, 14.5",  // Una pizza con topping e bevanda
            "Margherita, 5.0, Coca Cola, 2.5, 12.5"  // Un altro ordine con la stessa pizza
    })
    public void testCalcoloImportoTotaleParametrico(String pizzaNome, double pizzaPrezzo, String drinkNome, double drinkPrezzo, double expectedTotale) {
        Pizza pizza = new Pizza(pizzaNome, pizzaPrezzo);
        Drink drink = new Drink(drinkNome, drinkPrezzo, "Calories: 150");

        Ordine ordine = new Ordine(1, 4, Arrays.asList(pizza, drink));

        assertEquals(expectedTotale, ordine.getImportoTotale(), "Il calcolo dell'importo totale è errato");
    }

}
