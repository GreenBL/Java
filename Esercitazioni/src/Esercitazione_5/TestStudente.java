package bin.es5;

public class TestStudente{
    public static void main(String args[]){
        Studente studente1 = new Studente("Mario", "Rossi", 8952153, new Date(06, 04, 2000));
        Studente studente2 = new Studente("Marco", "Valanga", 5825176, new Date(05, 02, 1989));

        System.out.println(studente1.toString());
        System.out.println(studente2.toString());
    }
}