package bin.es7;
import static java.lang.Math.random;

public class Dado extends Randomizzatore{
    private int faces;
    private int lastRoll;

    public Dado(){
        super(6);
    }

    public Dado(int faceNumber){
        super(faceNumber);
    }

    public void lancia(){
        for(int i = 0; i < 1 + ((int) (random() * 10)); ++i){
            super.rollRandomNumber();
            System.out.print(super.getLastRoll() + " ");
        }  
    }
}