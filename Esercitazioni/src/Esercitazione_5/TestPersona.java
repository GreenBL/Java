package bin.es5;

public class TestPersona{
    public static void main(String args[]){
        Persona persona1 = new Persona("Silvio", "Berlusconi", 86);
        Persona persona2 = new Persona("Silvio", "Berlusconi", 86);
        System.out.println("Persona n. " + persona1.getInstanceNumber() + "\n" + persona1.toString());
        System.out.println("Persona n. " + persona2.getInstanceNumber() + "\n" + persona2.toString());
        System.out.println("Le due persone" + (persona1.equals(persona2)? " sono" : " non sono") + " uguali");
        System.out.println(Persona.getCount() + " persone istanziate");
    }
    
}