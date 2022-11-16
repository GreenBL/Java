package bin.es6;
import java.util.ArrayList;

public class IntegerSetv2{
    private ArrayList<Integer> set;

    public IntegerSetv2(){
        this.set = new ArrayList<>();
    }

    public void insertElement(int element){
        (this.set).add(element);
    }

    public void deleteElement(int element){
        (this.set).remove((Object)element);
    }

    public String toString(){
        String buff = "";
        for(int e: this.set){
            buff = buff + e + " ";
        }
        if(buff.equals("")){
            return "{" + " vuoto " +"}";
        }
        return "{ " + buff + "}";
    }

    public IntegerSetv2 unionOfIntegerSet(IntegerSetv2 other){ // broken , fix needed
        IntegerSetv2 union = new IntegerSetv2();
        int temp;
        for(int i = 0; i < (this.set).size(); ++i){
            temp = (this.set).get(i);
            if(!(other.set).contains(temp)){
                (union.set).add(temp);
            }
            if((other.set).contains(temp)){
                (union.set).add(temp);
            }
        }
        for(int i = 0; i < (other.set).size(); ++i){
            temp = (other.set).get(i);
            if(!(this.set).contains(temp)){
                (union.set).add(temp);
            }
        }

        return union;
    }

    public IntegerSetv2 intersectionOfIntegerSet(IntegerSetv2 other){
        IntegerSetv2 intersection = new IntegerSetv2();
        for(int e: this.set){
            if((other.set).contains(e)){
                (intersection.set).add(e);
            }
        }
        return intersection;
    }
}