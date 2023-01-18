package magazzino;

public class TestMagazzino {
    public static void main(String[] args) {
        Magazzino mag = new Magazzino();
        try {
            //Articolo art1 = new Vestito("XXL", 12, "brutto", "Armani", 500);
            Articolo art2 = new Scarpa(34, 12, "brutto", "Armani", 500);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        String check = "pass";
        System.out.println(check);
    }   
}