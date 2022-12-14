package bin.es8;
import bin.es6.Point2D;

public abstract class Veicolo{
    public Point2D posVector = new Point2D(0,0);
    public Point2D velVector;
    public Point2D accVector;
    
    private double tempoTotale; // Delta T (∆t)

    public Veicolo(){}

    public abstract void muovi(double time);

    public void incrementaTempoTotale(double deltaT){
        this.tempoTotale += deltaT;
    }

    public double getTempoTotale(){
        return this.tempoTotale;
    }

    public void setPosVector(double x, double y){
        this.posVector.setX(x);
        this.posVector.setY(y);
    }

    public Point2D getPosVector(){
        return this.posVector;
    }

    public Point2D getVelVector(){
        return this.velVector;
    }

    public Point2D getAccVector(){
        return this.accVector;
    }

    public void printPosition(){
        System.out.println(posVector);
    }

}