package bin.es8;
import bin.es6.Point2D;

public abstract class VeicoloAMotore extends Veicolo{
    private int cilindrata;

    public VeicoloAMotore(){}

    public VeicoloAMotore(Point2D initVel, Point2D initAcc, int cil){
        velVector = initVel;
        accVector = initAcc;
    }

    public void setCilindrata(int nuovaCilindrata){
        this.cilindrata = nuovaCilindrata;
    }

    public int getCilindrata(){
        return this.cilindrata;
    }

    public void muovi(double time){
        incrementaTempoTotale(time);
        double t = getTempoTotale();
        double x = posVector.getX() + (velVector.getX() * t) + (accVector.getX() * t * t);
        double y = posVector.getY() + (velVector.getY() * t) + (accVector.getY() * t * t);
        setPosVector(x, y);
    }
}