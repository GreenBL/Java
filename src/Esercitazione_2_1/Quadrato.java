package classes;

public class Quadrato{
    public Quadrato(){
        System.out.println("ERROR : No int value given to class constructor");
    }
    public Quadrato(int input_lato){
        lato = input_lato;
    }
    public int lato;
    public int perimeter(){
        return lato * 4;
    }
    public int area(){
        return lato * lato;
    }
}