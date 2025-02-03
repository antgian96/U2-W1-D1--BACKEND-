package pizzeria.demo;

public class Bevanda {
    private String nome;
    private double prezzo;

    public Bevanda(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getInformazioniNutrizionali() {
        return "Calorie: " + (int) (prezzo * 50);

    }

}
