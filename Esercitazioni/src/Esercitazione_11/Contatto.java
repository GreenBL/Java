package bin.es11;

import java.util.Objects;

public class Contatto implements Comparable<Contatto> {
    private String nome, cognome, telefono;

    public Contatto(){
        this("-", "-", "#");
    }

    public Contatto(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public int compareTo(Contatto altro) {
        if(this.getCognome().equals(altro.getCognome())) {
            return this.getNome().compareTo(altro.getNome());
        }
        return this.getCognome().compareTo(altro.getCognome());
    }

    public int hashCode() {
        return Objects.hash(nome, cognome);
    }

    public String toString() {
        return nome + " " + cognome + " " + telefono;
    }

    public boolean equals(Object altro) {
        Contatto c = (Contatto)altro;
        return (c.getNome().equals(this.getNome())) && (c.getCognome().equals(this.getCognome()));
    }

    // metodi pseudo-astratti [specializzare in base all'amico o collega] - polimorfismo

    public void stampaSeAmico() {
        ;
    }

    public void stampaSeCollega() {
        ;
    }


}