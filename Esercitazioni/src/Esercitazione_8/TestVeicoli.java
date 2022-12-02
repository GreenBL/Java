package bin.es8;

public class TestVeicoli{
    public static void main(String args[]){
        LaMiaAuto grandePunto = new LaMiaAuto();

        System.out.println(grandePunto.toString());

        grandePunto.setAccelX(2);

        grandePunto.muovi(5);

        System.out.println(grandePunto.toString());

        LaMiaAuto fiesta = new LaMiaAuto();

        fiesta.setAccelX(4);
        fiesta.muovi(5);
        System.out.println(fiesta.toString());

        fiesta.setAccelX(-2);
        fiesta.muovi(2);
        System.out.println(fiesta.toString());
    }
}