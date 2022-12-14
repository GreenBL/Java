package bin.es8;
import static java.lang.Math.PI;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super("bianco", false);
        this.setRadius(1);      
    }

    public Circle(double newRadius, String color, boolean isFilled){
        super(color, isFilled);
        this.setRadius(newRadius);
    }

    public void setRadius(double newRadius){
        if(newRadius < 0.0) {
            setRadius(0.0);
        }
        this.radius = newRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getCircumference(){
        return 2 * PI * this.getRadius();
    }

    public double getArea(){
        return (this.getRadius() * this.getRadius()) * PI; 
    }

    @Override
    public void scale(double scalar){
        setRadius(getRadius() * scalar);
    }
    
    @Override
    public String toString(){
        return "Tipo : Cerchio\n" + "Raggio = " + this.getRadius() +
               "\nCirconferenza = " + this.getCircumference() + "\nArea = " + this.getArea()
               + super.toString();
    }
}