package bin.es5;

public class Persona{
    private String name;
    private String surname;
    private int age;
    private static int count;
    private int localCount;

    public Persona(){
        this.setName(null);
        this.setSurname(null);
        this.setAge(0);
        setCount();
    }

    public Persona(String newName, String newSurname, int newAge){
        this.setName(newName);
        this.setSurname(newSurname);
        this.setAge(newAge);
        setCount();
    }

    private void setCount(){
        count++;
        this.localCount = count;
    }

    public static int getCount(){
        return count;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSurname(String newSurname){
        this.surname = newSurname;
    }

    public void setAge(int newAge){
        if(newAge > 0){
            this.age = newAge;
        } else {
            System.out.println("Eta' non valida, impostata a valore di default (0)");
            this.age = 0;
        }
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    public int getInstanceNumber(){
        return localCount;
    }


    public String toString(){
        return name + "\n" + surname + "\n" + age;
    }
    public boolean equals(Persona guy){
        return (this.getAge() == guy.getAge()) && ((this.getName()).equals(guy.getName())) && ((this.getSurname()).equals(guy.getSurname()));
    }
}