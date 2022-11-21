package bin.es7;

public class Partecipante{
    private int votes;
    private String name;
    private String surname;

    public Partecipante(String nome){
        this.setNome(nome);
        this.setVotes(0);
    }

    public void setNome(String nome){
        this.name = nome;
    }

    public void setVotes(int voti){
        this.votes = voti;
    }

    public int getVotes(){
        return this.votes;
    }
    // mi secca fare i getter...

    public String toString(){
        return this.name + " [ " + this.getVotes() + " ]";
    }

}