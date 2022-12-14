package bin.es8;

public class Square extends Rectangle{

    public Square(){}

    public Square(double l){
        super(l,l);
        super.setColor("white");
        super.setFilled(true);
        this.setSide(l);
    }

    public Square(double l, String color, boolean fill){
        super(l, l, color, fill);
    }

    public void setSide(double l){
        super.setWidth(l);
        super.setLength(l);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length){
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public void scale(double scalar){
        setSide(getSide() * scalar);
    }
    public double getSide(){
        return super.getWidth();
    }

    @Override
    public String toString(){
        return "Tipo : Quadrato\n" + "Lato = " + this.getSide() +
               "\nPerimetro = " + this.getPerimeter() + "\nArea = " + this.getArea() + "\n" 
               + "\nColore: " + super.getColor() + "Riempimento: " + (super.getFilled()? "Si\n" : "No\n");
    }
    
}