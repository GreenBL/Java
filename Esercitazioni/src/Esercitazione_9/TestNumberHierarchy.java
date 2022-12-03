package bin.es9;

public class TestNumberHierarchy{
    public static void main(String args[]){
        Numero ratioA = new Razionale(8,2);
        Numero ratioB = new Razionale(2,2);
        Numero ratioC = ratioA.somma(ratioA, ratioB);
        Numero ratioDComplex = new Complex(1, 1);

        Numero testError = ratioA.somma(ratioA, ratioDComplex);

        System.out.println(ratioC);

        Aritmetica aritmeticatore = new Razionale();
        System.out.println(aritmeticatore.somma(ratioA, ratioB));
        Aritmetica aritmeticatore2 = new Complex();
        System.out.println(aritmeticatore2.somma(ratioDComplex, ratioDComplex));
    }
}