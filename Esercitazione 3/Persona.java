package prg.es03;

public class Persona{
    public String name = new String();
    public String surname = new String();
    public int age;
    public Persona(String newName, String newSurname, int newAge){
        name = newName;
        surname = newSurname;
        age = newAge;
    }

    public String toString(){
        String toReturn = new String();
        toReturn = name + "\n" + surname + "\n" + age;
        return toReturn;
    }
    public boolean equals(Persona guy){
        if(guy.age == age && guy.name == name && guy.surname == surname){
            return true;
        }
        return false;
    }
}