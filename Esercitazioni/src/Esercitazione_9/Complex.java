package bin.es9;
import java.lang.Math;

public class Complex extends Numero implements Aritmetica{
    double real;
    double imma;

    public Complex(){
        // Niente
    }

    public Complex(double re, double im){
        this.setReal(re);
        this.setImma(im);
    }

    public Complex(double re){
        this.setReal(re);
    }

    public Complex somma(Complex other){
        double sumreal;
        double sumimma;
        
        sumreal = this.getReal() + other.getReal();
        sumimma = this.getImma() + other.getImma();

        return new Complex(sumreal, sumimma);
    }

    public Complex sottrai(Complex other){
        double diffreal;
        double diffimma;
        
        diffreal = this.getReal() - other.getReal();
        diffimma = this.getImma() - other.getImma();

        return new Complex(diffreal, diffimma);
    }

    public double distance(Complex other){
        double dist;
        double realDist;
        double immaDist;

        realDist = this.getReal() - other.getReal();
        immaDist = this.getImma() - other.getImma();
        realDist = Math.pow(realDist, 2);
        immaDist = Math.pow(immaDist, 2);
        dist = Math.sqrt(realDist + immaDist);

        return Math.abs(dist);
    }

    public Numero somma(Numero... numeri){
        for(Numero instanceCheck : numeri){
            if(!(instanceCheck instanceof Complex)){
                System.out.println("ERRORE: Impossibile sommare tipi di numeri diversi!");
                return null;
            }
        }
        Complex ratSum = new Complex(0);
        for(Numero tmp: numeri){
            ratSum = ratSum.somma((Complex)tmp);
        }
        return ratSum;
    }
    
    public Numero sottrai(Numero... numeri){
        for(Numero instanceCheck : numeri){
            if(!(instanceCheck instanceof Complex)){
                System.out.println("ERRORE: Impossibile sottrarre tipi di numeri diversi!");
                return null;
            }
        }
        Complex ratSub = new Complex(0);
        for(Numero tmp: numeri){
            ratSub = ratSub.sottrai((Complex)tmp);
        }
        return ratSub;
    }    

    public boolean equals(Complex other){
        double compD1 = Math.abs(this.getReal() - other.getReal());
        double compD2 = Math.abs(this.getImma() - other.getImma());

        return compD1 < 0.0001 && compD2 < 0.0001;
    }

    public void setReal(double re){
        this.real = re;
    }

    public void setImma(double im){
        this.imma = im;
    }

    public double getReal(){
        return this.real;
    }

    public double getImma(){
        return this.imma;
    }

    public String toString(){
        return this.getReal() + " + i(" + this.getImma() + ")";
    }
}