package bin.es6;

public class Square{
    private int side;

    public Square(){
        this.setSide(1);
    }

    public Square(int l){
        this.setSide(l);
    }

    public void setSide(int l){
        this.side = l;
    }


    public int getSide(){
        return this.side;
    }

    public int getPerimeter(){
        return this.getSide() * 4;
    }

    public int getArea(){
        return this.getSide() * this.getSide();
    }

    public String toString(){
        return "Tipo : Quadrato\n" + "Lato = " + this.getSide() +
               "\nPerimetro = " + this.getPerimeter() + "\nArea = " + this.getArea();
    }
    
}