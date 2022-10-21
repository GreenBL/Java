public class Persona{
    public String name;
    public String surname;
    public int age;
    public Persona(String newName, String newSurname, int newAge){
        name = newName;
        surname = newSurname;
        age = newAge;
    }

    public String toString(){
        return name + "\n" + surname + "\n" + age;
    }
    public boolean equals(Persona guy){
        return (this.age == guy.age) && (this.name.equals(guy.name)) && (this.surname.equals(guy.surname));
    }
}