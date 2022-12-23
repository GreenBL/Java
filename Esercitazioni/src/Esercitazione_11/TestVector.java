package bin.es11;

public class TestVector {
    public static void main(String[] args) {
        VectorInteger v1, v2, ris;
        v1 = new VectorInteger(5);
        v2 = new VectorInteger(5);

        v1.set(2, 10);
        v1.set(3, 15);
        v2.set(0, 10);
        v2.set(1, 5);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        ris = v1.somma(v2);
        System.out.println("Ris: " + ris);



        //v1.set(7, 25);
        try {
            VectorInteger v3 = new VectorInteger(25);
            ris = v1.differenza(v3);
        } catch (Exception e) {
            System.out.println("Qualcosa è andato storto...");
        }

        System.out.println(ris.hashCode());

        System.out.println(v1.equals(v2));        


    }
}