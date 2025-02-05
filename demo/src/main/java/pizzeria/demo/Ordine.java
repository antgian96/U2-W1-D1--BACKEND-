import java.time.LocalDateTime;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private String stato;  // "in corso", "pronto", "servito"
    private Tavolo tavolo;
    private int coperti;
    private LocalDateTime oraAcquisizione;
    private List<Pizza> pizze;
    private List<Bevanda> bevande;
    private double importoTotale;

    public Ordine(int numeroOrdine, Tavolo tavolo, int coperti, List<Pizza> pizze, List<Bevanda> bevande, double coperto) {
        this.numeroOrdine = numeroOrdine;
        this.stato = "in corso";
        this.tavolo = tavolo;
        this.coperti = coperti;
        this.oraAcquisizione = LocalDateTime.now();
        this.pizze = pizze;
        this.bevande = bevande;
        calcolaImportoTotale(coperto);
    }

    private void calcolaImportoTotale(double coperto) {
        double totalePizze = pizze.stream().mapToDouble(Pizza::getPrezzo).sum();
        double totaleBevande = bevande.stream().mapToDouble(Bevanda::getPrezzo).sum();
        this.importoTotale = totalePizze + totaleBevande + (coperti * coperto);
    }

    public void stampaOrdine() {
        System.out.println("Ordine #" + numeroOrdine);
        System.out.println("Tavolo: " + tavolo.getNumero() + " (Stato: " + tavolo.getStato() + ")");
        System.out.println("Coperti: " + coperti);
        System.out.println("Ora di acquisizione: " + oraAcquisizione);
        System.out.println("Stato: " + stato);
        System.out.println("Totale: " + importoTotale + "€");

        System.out.println("\nPizze:");
        pizze.forEach(pizza -> System.out.println(pizza.getNome() + " - Prezzo: " + pizza.getPrezzo() + "€"));

        System.out.println("\nBevande:");
        bevande.forEach(bevanda -> System.out.println(bevanda.getNome() + " - Prezzo: " + bevanda.getPrezzo() + "€"));
    }
}
