package bin.es7;
import bin.es5.Persona;

public class Abbonato extends Persona{
    private double sconto;
    private boolean isPremium;

    public Abbonato(){
        super(null, null, 0);
        this.setSconto(0);
    }

    public Abbonato(String newName, String newSurname, int newAge){
        super(newName,newSurname,newAge);
        this.setSconto(0);
    }
    
    public Abbonato(String newName, String newSurname, int newAge, double newDiscount){
        super(newName,newSurname,newAge);
        this.setSconto(newDiscount);
    }

    public double acquista(double cost){
        return cost - (cost * (this.getSconto()/100));
    }

    public boolean getIsPremium(){
        return this.isPremium;
    }
    
    public void setIsPremium(boolean premium){
        this.isPremium = premium;
    }

    public void setSconto(double discount){
        if(discount >= 0 && discount <= 100){
            this.sconto = discount;
        } else {
            this.sconto = 0;
        }
    }

    public double getSconto(){
        return this.sconto;
    }

    public String toString(){
        return super.getName() + " " + super.getSurname() + " , Age : " + super.getAge() + "\ndiscount amount : " + this.getSconto() + "%"+ (isPremium ? "\nPREMIUM" : "");
    }
}