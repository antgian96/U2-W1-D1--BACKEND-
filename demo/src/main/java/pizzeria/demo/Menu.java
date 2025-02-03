package pizzeria.demo;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;

    public Menu(List<Pizza> pizze, List<Bevanda> bevande) {
        this.pizze = pizze;
        this.bevande = bevande;
    }

    public void stampaMenu() {
        System.out.println("Menu della Pizzeria:");

        System.out.println("\nPizze:");
        for (Pizza pizza : pizze) {
            System.out.println(pizza.getNome() + " - Prezzo: " + pizza.getPrezzo() + "€");
            System.out.println("Informazioni nutrizionali: " + pizza.getInformazioniNutrizionali());
        }

        System.out.println("\nBevande:");
        for (Bevanda bevanda : bevande) {
            System.out.println(bevanda.getNome() + " - Prezzo: " + bevanda.getPrezzo() + "€");
            System.out.println("Informazioni nutrizionali: " + bevanda.getInformazioniNutrizionali());
        }
    }
}
