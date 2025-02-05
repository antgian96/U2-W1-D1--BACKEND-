public class Tavolo {
    private int numero;
    private int copertiMassimi;
    private String stato;  // "occupato" o "libero"

    public Tavolo(int numero, int copertiMassimi, String stato) {
        this.numero = numero;
        this.copertiMassimi = copertiMassimi;
        this.stato = stato;
    }

    public int getNumero() {
        return numero;
    }

    public int getCopertiMassimi() {
        return copertiMassimi;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
