package bin.es7;
import static java.lang.Math.random;

public class Moneta extends Randomizzatore{
    private static final int TESTA = 1;
    private static final int CROCE = 2;

    public Moneta(){
        super(2);
    }

    public void lancia(){
        for(int i = 0; i < 1 + ((int) (random() * 10)); ++i){
            super.rollRandomNumber();
            if(super.getLastRoll() == TESTA){
                System.out.print("T ");
            } else {
                System.out.print("C ");
            }
        }
    }
}