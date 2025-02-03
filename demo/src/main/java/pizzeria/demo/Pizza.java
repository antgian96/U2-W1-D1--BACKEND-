package pizzeria.demo;

public class Pizza {
    private String nome;
    private double prezzo;
    private List<Topping> toppings;

    public Pizza(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.toppings = new ArrayList<>();
    }

    public void aggiungiTopping(Topping topping) {
        toppings.add(topping);
    }

    public string getNome() {
        String toppingsName = toppings.stream()
                .map(Topping::getNome)
                .collect(Collectors.joining8(" + "));
        return nome + (toppings.isEmpty() ? "" : "( " + toppingsNames + ")");
    }

    public double getPrezzo() {
        double prezzoTotale = prezzo;
        for (Topping topping : toppings) {
            prezzoTotale += topping.getPrezzo();
        }
        return prezzoTotale;
    }

    public String getInformazioniNutrizionali() {
        return "Calorie:" + (int) (prezzo * 100);
    }
    }


}
