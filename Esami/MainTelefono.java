package prg.esame2;

public class MainTelefono {
    public static void main(String[] args) {
        MapTelefono mappaTel = new MapTelefono();

        // dichiarazione di 4 oggetti telefono
        Telefono a = new Telefono("iPhone 13", 2022, 999);
        Telefono b = new Telefono("iPhone 3G", 2008, 699);
        Telefono c = new Telefono("Nokia 3310", 2000, 199);
        Telefono d = new Telefono("iPhone 8 Rotto", 2012, 10);

        mappaTel.add(c);
        mappaTel.add(b);
        mappaTel.add(d);
        mappaTel.add(a);

        mappaTel.print();
    }
}