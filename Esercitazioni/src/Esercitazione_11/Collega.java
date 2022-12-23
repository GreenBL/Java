package bin.es11;

public class Collega extends Contatto {
    private String qualifica;

    public Collega() {

    }

    public Collega(String nome, String cognome, String telefono, String qualifica) {
        super(nome, cognome, telefono);
        this.qualifica = qualifica;
    }

    @Override
    public String toString() {
        return super.toString() + " Qualifica: " + qualifica;
    }

    @Override
    public void stampaSeCollega() {
        System.out.println(this);
    }
}