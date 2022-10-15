package prg.es03;

public class Principale{
    public static void main(String args[]){
        Persona persona1 = new Persona("Mario", "Rossi", 10);
        Persona persona2 = new Persona("Gianmarco", "Peroni", 50);
        System.out.println(persona1.toString());
        System.out.println("\n" + persona2.toString());
        Persona persona3 = persona1;
        persona1.name = "Anna";
        persona1.surname = "Albero";
        System.out.println("\n" + persona3.toString());
        System.out.println(persona1.equals(persona2));
    }
}