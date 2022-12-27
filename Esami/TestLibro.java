package prg.esame1;

public class TestLibro {
    public static void main(String[] args) {
        try {
            Libro test = new Libro("Roma", "Marco Spitoski", "2023");
            System.out.println(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}