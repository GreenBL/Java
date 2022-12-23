package bin.es11;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Rubrica {
    private Collection<Contatto> dati;

    public Rubrica(){
        dati = new TreeSet<>();
    }

    public void aggiungi(Contatto c) {
        dati.add(c);
    }

    public void stampaAmici() {
        Iterator<Contatto> i = dati.iterator();
        while(i.hasNext()) {
            i.next().stampaSeAmico();
        }
    }

    public void stampaColleghi() {
        Iterator<Contatto> i = dati.iterator();
        while(i.hasNext()) {
            i.next().stampaSeCollega();
        }
    }

    public void stampa() {
        Iterator<Contatto> i = dati.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(dati);
    }

    public Contatto trova(String nome, String cognome) {
        Iterator<Contatto> i = dati.iterator();
        Contatto cercato;
        while(i.hasNext()) {
            cercato = i.next();
            if(cercato.getNome().equals(nome) && cercato.getCognome().equals(cognome)) {
                return cercato;
            }
        }
        return null;
    }

    public void cancella(){
        dati.clear();
    }
}