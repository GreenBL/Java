package bin.es10;
import java.lang.Math;

public class Razionale{
    private int num, den;

    public Razionale(){}
    public Razionale(int newNum){
        this.setNum(newNum);
        this.setDen(1);
        this.semplifica();
    }
    public Razionale(int newNum, int newDen){
        this.setNum(newNum);
        this.setDen(newDen);
        this.semplifica();
    }

    public void setNum(int newNum){
        this.num = newNum;
    }

    public void setDen(int newDen) throws IllegalArgumentException {
        if (newDen == 0) throw new IllegalArgumentException();
        this.den = newDen;
    }

    public int getNum(){
        return this.num;
    }

    public int getDen(){
        return this.den;
    }

    public String toString(){
        String sign = "";
        if(this.getNum() < 0 || this.getDen() < 0){
            sign = "-";
        }
        if(this.getNum() != this.getDen()){
            if(getLCM(this.getDen(), this.getNum()) == this.getNum()){ // se il mcm dei due = num. allora . . .
                return sign + Math.abs(this.getNum() / this.getDen()); // num. multiplo del den.
            }
            return sign + "(" + Math.abs(this.getNum()) + " / " + Math.abs(this.getDen()) + ")"; // caso normale
        }
        return sign + "1"; // num. e den. uguali 
    }

    public boolean equals(Razionale x){
        return (this.getNum() == x.getNum()) && (this.getDen() == x.getDen());
    }

    private static int getGCD(int a, int b){
        return b == 0 ? a : getGCD(b, a % b);
    }

    private static int getLCM(int a, int b){
        return a * b / getGCD(a, b);
    }

    public Razionale somma(Razionale b){
        if(this.getDen() != b.getDen()){
            return new Razionale((this.getNum() * b.getDen()) + (b.getNum() * this.getDen()), this.getDen() * b.getDen());
        }
        return new Razionale(this.getNum() + b.getNum(), this.getDen());
    }

    public Razionale sottrai(Razionale b){
        if(this.getDen() != b.getDen()){
            return new Razionale((this.getNum() * b.getDen()) - (b.getNum() * this.getDen()), this.getDen() * b.getDen());
        }
        return new Razionale(this.getNum() - b.getNum(), this.getDen());
    }

    public Razionale moltiplica(Razionale b){
        return new Razionale(this.getNum() * b.getNum(), this.getDen() * b.getDen());
    }

    public Razionale moltipica(int n, int d) throws ArithmeticException {
        if (d == 0) {
            throw new ArithmeticException()
        }
        return new Razionale(getNum() * n, getDen() * d);
    }

    public Razionale dividi(Razionale b){
        return new Razionale(this.getNum() * b.getDen(), this.getDen() * b.getNum());
    }

    public Razionale dividi(int n, int d) throws ArithmeticException {
        if (d == 0 || n == 0) throw new ArithmeticException();
        return new Razionale(this.getNum() * d, this.getDen() * n);
    }
    
    private void semplifica(){
        int gCD = (getGCD(this.getNum(), this.getDen()));
        // System.out.println("GCD = " + gCD);
        // System.out.println("[info] " + this.getDen() / (getGCD(this.getNum(), this.getDen())));
        this.setNum(this.getNum() / gCD);
        this.setDen(this.getDen() / gCD);
        // System.out.println("\t\t\t\t\t[info] Numero correttamente semplificato");        
    }
}