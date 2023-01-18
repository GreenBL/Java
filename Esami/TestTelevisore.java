package prg.esame4;

public class TestTelevisore {
    public static void main(String[] args) {
        Televisore tv = new Televisore();
        tv.set(Televisore.MARCA, "Samsung");
        tv.set(Televisore.MODELLO, "ABZ-253");
        tv.set(Televisore.DIMENSIONI, "59"); // lancia numberformatexception se arg[1] non è un numero
    }
}