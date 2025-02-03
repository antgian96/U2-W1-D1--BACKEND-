package pizzeria.demo;

public class Topping {
    private String nome;
    private double prezzo;

    public Topping(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;

    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
