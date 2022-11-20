package bin.es7;

public class AbbonatoPremium extends Abbonato{
    private int bonus;
    private double moneySpent;

    public AbbonatoPremium(){
        super(null,null,0,0);
        this.setIsPremium(true);
    }

    public AbbonatoPremium(String newName, String newSurname, int newAge){
        super(newName,newSurname,newAge);
        this.setSconto(0);
        this.setIsPremium(true);
    }
    
    public AbbonatoPremium(String newName, String newSurname, int newAge, double newDiscount){
        super(newName,newSurname,newAge);
        this.setSconto(newDiscount);
        this.setIsPremium(true);
    }

    public void setBonus(int n){
        this.bonus = n;
    }

    public int getBonus(){
        return this.bonus;
    }

    public void setMoneySpent(double n){
        this.moneySpent = n;
    }

    public double getMoneySpent(){
        return this.moneySpent;
    }

    public int calculateBonus(double money){
        if(money < 100){
            this.setMoneySpent(money);
            return 0;
        }
        return this.calculateBonus(money - 100) + 1;
    }

    public double acquista(double cost){
        this.setMoneySpent(this.getMoneySpent() + cost);
        this.setBonus(this.calculateBonus(this.getMoneySpent()));
        // debug
        System.out.println("SPESA INPUT :" + cost);
        System.out.println("PERCENT SCONTO : " + super.getSconto());
        System.out.println("QUANTITA' DI BONUS DA 5 EURO : " + this.getBonus());
        return (cost - (cost * (super.getSconto()/100)) - (this.getBonus() * 5));
    }

}