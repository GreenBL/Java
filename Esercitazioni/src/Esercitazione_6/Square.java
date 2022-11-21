package bin.es6;

public class Square extends Rectangle{

    public Square(){
        this.setSide(1);
    }

    public Square(int l){
        this.setSide(l);
        super.setColor("white");
        super.setFilled(true);
    }

    public void setSide(int l){
        super.setWidth(l);
        super.setLength(l);
    }


    public int getSide(){
        return super.getWidth();
    }

    public int getPerimeter(){
        return this.getSide() * 4;
    }

    public int getArea(){
        return this.getSide() * this.getSide();
    }

    public String toString(){
        return "Tipo : Quadrato\n" + "Lato = " + this.getSide() +
               "\nPerimetro = " + this.getPerimeter() + "\nArea = " + this.getArea() + "\n" 
               + "\nColore: " + super.getColor() + "Riempimento: " + (super.getFilled()? "Si" : "No");
    }
    
}