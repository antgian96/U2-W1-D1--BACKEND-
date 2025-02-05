import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    @Test
    public void testPrezzoPizzaBase() {
        Pizza pizza = new Pizza("Margherita", 5.0);
        assertEquals(5.0, pizza.getPrezzo(), "Il prezzo della pizza base Margherita deve essere 5.0");
    }


    @Test
    public void testPrezzoPizzaConToppings() {
        Pizza pizza = new Pizza("Margherita", 5.0);
        Topping prosciutto = new Topping("Prosciutto", 2.0);
        pizza.aggiungiTopping(prosciutto);

        // Il prezzo dovrebbe essere 5.0 (base) + 2.0 (prosciutto)
        assertEquals(7.0, pizza.getPrezzo(), "Il prezzo della pizza con prosciutto dovrebbe essere 7.0");
    }
}
