package bin.es5;
import bin.es5.Date;

public class Studente{
    private long id;
    private Date dataNascita;
    private String nome;
    private String cognome;

    public Studente(String newNome, String newCognome, long newId, Date newDataNascita){
        this.setNome(newNome);
        this.setCognome(newCognome);
        this.setId(newId);
        this.setNascita(newDataNascita);
    }

    public String toString(){
        String matricola = String.format("%08d", this.getId());

        return this.getNome() + " " + this.getCognome() + ", Matricola " + matricola + ", nato nel " + (this.getNascita()).toString();
    }

    // set methods

    public void setNome(String a){
        this.nome = a;
    }
    public void setCognome(String b){
        this.cognome = b;
    }    
    public void setId(long c){
        if(c > 0 && c < 9999999)
            this.id = c;
        else this.id = 0; 
    }
    public void setNascita(Date d){
        if(d.getYear() >= 1900)
            this.dataNascita = d;
        else this.dataNascita = new Date(1, 1, 1970);
    }

    // get methods

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public long getId(){
        return this.id;
    }

    public Date getNascita(){
        return this.dataNascita;
    }

  

    

    

}