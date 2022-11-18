package bin.es7;
import static java.lang.Math.random;

public class Randomizzatore{
    private int faces;
    private int lastRoll;

    public Randomizzatore(){
        this.setFaces(2);
    }

    public Randomizzatore(int n){
        this.setFaces(n);
    }

    public int getFaces(){
        return this.faces;
    }

    public void setFaces(int n){
        if(n < 2){
            this.setFaces(2);
        } else {
            this.faces = n;
        }
    }

    public int getLastRoll(){
        return this.lastRoll;
    }

    public void setLastRoll(int roll){
        this.lastRoll = roll;
    }

    public void lancia(){
        // empty method -- must be overridden and specialized
    }

    public void rollRandomNumber(){
        int roll = 1 + ((int) (random() * getFaces()));
        // if the same number was rolled on the last iteration, run the method again until it gets a different result
        if(roll == this.getLastRoll()){
            rollRandomNumber();
        } else {
            this.setLastRoll(roll);
        }
    }

    public String toString(){
        return "\nNumber of faces: " + this.getFaces() + "\n[DEBUG]: Last rolled number: " + this.getLastRoll();
    }
}