package bin.es7;
import static java.lang.Math.random;

public class Votante{
    private int phone;
    private int votes;
    private int voted;
    
    public Votante(int numeroDiTelefono){
        this.setPhone(numeroDiTelefono);
        this.setVotes(0);
        if(vota() != -1){
            this.setVoted(vota());
        }
    }

    public int vota(){
        if(getVotes() <= 5){
            this.setVotes(this.getVotes() + 1);
            return 1 + (int) (random() * 15);
        }
        return -1;
    }

    public void setVotes(int v){
        this.votes = v;
    }

    public void setPhone(int p){
        this.phone = p;
    }

    public int getPhone(){
        return this.phone;
    }

    public int getVoted(){
        return this.voted;
    }

    public void setVoted(int vo){
        this.voted = vo;
    }
    public int getVotes(){
        return this.votes;
    }

    public String toString(){
        return "+39 " + this.getPhone() + ", Voti = " + this.getVotes();
    }

    public boolean equals(Object other){
        Votante altro = (Votante)other;
        return this.getPhone() == altro.getPhone();
    }
}