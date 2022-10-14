package classes;
import classes.Quadrato;
public class TestQuadrato{
    public static void main(String args[]){
        Quadrato square = new Quadrato(5);
        System.out.println("perimetro = " + square.perimeter());
        System.out.println("area = " + square.area());
    }
}