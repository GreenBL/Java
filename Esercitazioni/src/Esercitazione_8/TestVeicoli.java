package bin.es8;
import bin.es6.Point2D;

public class TestVeicoli{
    public static void main(String args[]){
        Point2D vel1 = new Point2D(0,0);
        Point2D acc1 = new Point2D(5,0);
        Point2D acc2 = new Point2D(10,0);
        Point2D acc3 = new Point2D(15,0);

        Automobile auto = new Automobile(vel1, acc2, 1300, "TARGATEST");
        Bicicletta bici = new Bicicletta(vel1, acc1, "BMX");
        Ciclomotore moto = new Ciclomotore(vel1, acc3, 65832, 250);

        System.out.println(auto.getPosVector());
        System.out.println(bici.getPosVector());
        System.out.println(moto.getPosVector());

        // non compila, ma si dovrebbero incapsulare tutte le variabili e risolvere problemi di ereditarieta'

        // errore in avanti, rendere private le variabili di istanza e usare get e set

        auto.muovi(5.0);
        bici.muovi(5.0);
        moto.muovi(5.0);

        System.out.println(auto.getPosVector());
        System.out.println(bici.getPosVector());
        System.out.println(moto.getPosVector());

        auto.muovi(5.0);
        bici.muovi(5.0);
        moto.muovi(5.0);

        System.out.println(auto.getPosVector());
        System.out.println(bici.getPosVector());
        System.out.println(moto.getPosVector());
    }
}