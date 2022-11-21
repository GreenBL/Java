package bin.es6;

public class Shape{
    private String color;
    private boolean filled;

    public Shape(){
        this.setColor("white");
        this.setFilled(true);
    }

    public Shape(String color, boolean isFilled){
        this.setColor(color);
        this.setFilled(isFilled);
    }    

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean bool){
        this.filled = bool;
    }

    public String getColor(){
        return this.color;
    }

    public boolean getFilled(){
        return this.filled;
    }

    public String toString(){
        return "\nColore: " + this.getColor() + "Riempimento: " + (this.getFilled()? "Si" : "No") + "\n";
    }
}