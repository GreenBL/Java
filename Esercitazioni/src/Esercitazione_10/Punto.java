package bin.es10;
import java.lang.Math;

public class Punto{
    private double x, y;
    private int localCount;
    private static int counter;
    private static final double range = 0.000000000000000000000001;

    public Punto(){
        this.setX(0);
        this.setY(0);
        ++counter;
        localCount = counter;
    }
    public Punto(double newX, double newY){
        this.setX(newX);
        this.setY(newY);
        ++counter;
        localCount = counter;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public void setY(double newY){
        this.y = newY;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public String toString(){
        return "Punto " + localCount + " = " + "(" + this.x + " ," + this.y + ")";
    }

    public boolean equals(Punto punto){
        double diffX = Math.abs(this.getX() - punto.getX());
        double diffY = Math.abs(this.getY() - punto.getY());
        if((diffX < range) && (diffY < range)){
            return true;
        }
        return false;
    }

    public double distance(Punto punto){
        return Math.sqrt(Math.pow(this.getX() > punto.getX()? this.getX() - punto.getX(): punto.getX() - punto.getX(), 2) + 
                Math.pow(this.getY() > punto.getY()? this.getY() - punto.getY(): punto.getY() - punto.getY(), 2));
    }

    public Punto middle(Punto punto){
        double midX = (this.getX() + punto.getX())/2;
        double midY = (this.getY() + punto.getY())/2;
        return new Punto(midX, midY);
    }
}