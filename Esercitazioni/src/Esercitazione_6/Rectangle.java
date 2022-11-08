package bin.es6;

public class Rectangle{
    private int width;
    private int length;

    public Rectangle(){
        this.setWidth(2);
        this.setLength(1);
    }

    public Rectangle(int w, int l){
        this.setWidth(w);
        this.setLength(l);
    }

    public void setWidth(int w){
        this.width = w;
    }

    public void setLength(int l){
        this.length = l;
    }

    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;
    }

    public int getPerimeter(){
        return (this.getLength() * 2 ) + (this.getWidth() * 2);
    }

    public int getArea(){
        return this.getLength() * this.getWidth();
    }

    public String toString(){
        return "Tipo : Rettangolo\n" + "Base = " + this.getWidth() + "\nAltezza = " + this.getLength() +
               "\nPerimetro = " + this.getPerimeter() + "\nArea = " + this.getArea();
    }
    
}