package bin.es8;
import  bin.es6.Point2D;

public class Bicicletta extends Veicolo{
    private String model;

    public Bicicletta(){}

    public Bicicletta(Point2D initVel, Point2D initAcc, String modello){
        velVector = initVel;
        accVector = initAcc;
        this.model = modello;
    }

    @Override
    public void muovi(double time){
        incrementaTempoTotale(time);
        double t = getTempoTotale();
        double x = posVector.getX() + (velVector.getX() * t) + (accVector.getX() * t * t);
        double y = Math.cos(x);
        setPosVector(x, y);
    }
}