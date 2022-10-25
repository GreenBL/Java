package bin.es4;
import java.lang.Math;

public class PuntoDouble{
    private double x, y;
    public PuntoDouble(){}
    public PuntoDouble(double newX, double newY){
        x = newX;
        y = newY;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double newX){
        x = newX;
    }
    public void setY(double newY){
        y = newY;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    public boolean equals(PuntoDouble punto){
        return (this.x == punto.getX()) && (this.y == punto.getY());
    }
    public double distance(PuntoDouble punto){
        double x1, y1, x2, y2;
        if(this.x > punto.x){
            x2 = this.x;
            x1 = punto.x;
        } else {
            x2 = punto.x;
            x1 = this.x;
        }
        if(this.y > punto.y){
            y2 = this.y;
            y1 = punto.y;
        } else {
            y2 = punto.y;
            y1 = this.y;
        }        
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public PuntoDouble middle(PuntoDouble punto){
        double midX = (this.x + punto.getX())/2;
        double midY = (this.y + punto.getY())/2;
        return new PuntoDouble(midX, midY);
    }
}