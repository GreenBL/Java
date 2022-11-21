package bin.es6;
import static java.lang.Math.PI;

public class Circle extends Shape{
    private int radius;

    public Circle(){
        super("bianco", false);
        this.setRadius(1);
        
    }

    public Circle(int newRadius, String color, boolean isFilled){
        super(color, isFilled);
        this.setRadius(newRadius);
    }

    public void setRadius(int newRadius){
        this.radius = newRadius;
    }

    public int getRadius(){
        return this.radius;
    }

    public double getCircumference(){
        return 2 * PI * this.getRadius();
    }

    public double getArea(){
        return (this.getRadius() * this.getRadius()) * PI; 
    }

    public String toString(){
        return "Tipo : Cerchio\n" + "Raggio = " + this.getRadius() +
               "\nCirconferenza = " + this.getCircumference() + "\nArea = " + this.getArea()
               + super.toString();
    }
}