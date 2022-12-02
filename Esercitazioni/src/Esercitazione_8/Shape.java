package bin.es8;

public abstract class Shape{
    public String color;
    public boolean isFilled;
    
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

    public abstract String toString();
    
    public abstract boolean equals(Object shape);
}