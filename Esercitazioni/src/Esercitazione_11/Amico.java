package bin.es11;

public class Amico extends Contatto {
    private String indirizzo;

    public Amico() {

    }

    public Amico(String nome, String cognome, String telefono, String indirizzo) {
        super(nome, cognome, telefono);
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return super.toString() + " Indirizzo: " + indirizzo;
    }

    @Override
    public void stampaSeAmico() {
        System.out.println(this);
    }
}