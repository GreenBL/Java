package bin.es8;

public abstract class Shape implements Drawable, Scalable{
    public String color;
    public boolean isFilled;

    public Shape(){}

    public Shape(String color, boolean fill){
        setColor(color);
        setFilled(fill);
    }
    
    public void setColor(String colore){
        this.color = colore;
    }

    public String getColor(){
        return this.color;
    }

    public void setFilled(boolean isFill){
        this.isFilled = isFill;
    }

    public boolean getFilled(){
        return isFilled;
    }

    public abstract double getArea();

    public abstract void scale(double scalar);

    public void draw(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "\nColor:" + getColor() + "\nFilled:" + getFilled();
    }
    
    //public abstract boolean equals(Object shape);
}