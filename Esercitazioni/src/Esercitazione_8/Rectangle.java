package bin.es8;

public class Rectangle extends Shape implements Scalable, Drawable{
    private double width;
    private double length;

    public Rectangle(){
        this.setWidth(2);
        this.setLength(1);
        super.setColor("White");
        super.setFilled(true);
    }

    public Rectangle(double w, double l){
        this.setWidth(w);
        this.setLength(l);
    }

    public void setWidth(double w){
        this.width = w;
    }

    public void setLength(double l){
        this.length = l;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getPerimeter(){
        return (this.getLength() * 2 ) + (this.getWidth() * 2);
    }

    public double getArea(){
        return this.getLength() * this.getWidth();
    }

    public void scale(double scalar){
        this.setWidth(this.getWidth() * scalar);
        this.setLength(this.getLength() * scalar);
    }

    public void draw(){
        String sideBuff1 = "";
        String sideBuff2 = "";
        for(int i = 0; i < (int) this.getWidth(); ++i){
            sideBuff1 = sideBuff1 + "* ";
        }
        for(int i = 0; i < (int) this.getLength(); ++i){
            System.out.println(sideBuff1);
        }
    }

    public boolean equals(Object obj){
        Rectangle rectangle = (Rectangle) obj;
        if(this.getWidth() == rectangle.getWidth()){
            if(this.getLength() == rectangle.getLength()){
                if(this.getColor().equals(rectangle.getColor())){
                    if(this.getFilled() == rectangle.getFilled()){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString(){
        return "Tipo : Rettangolo\n" + "Base = " + this.getWidth() + "\nAltezza = " + this.getLength() +
               "\nPerimetro = " + this.getPerimeter() + "\nArea = " + this.getArea() + "\n" + getColor() + "\n" + getFilled(); 
    }
    
}