package bin.es6;

public class IntegerSet{
    private boolean[] set;

    public IntegerSet(){
        set = new boolean[100];
    }

    public void insertElement(int element){
        set[element] = true;
    }

    public void deleteElement(int element){
        set[element] = false;
    }

    public String toString(){
        String buff = "";
        for(int i = 0; i < set.length; ++i){
            if(set[i] == false){
                continue;
            }
            buff = buff + i + " ";
        }
        if(buff.equals("")){
            return "{" + " vuoto " +"}";
        }
        return "{ " + buff + "}";
    }

    public IntegerSet unionOfIntegerSet(IntegerSet other){
        IntegerSet union = new IntegerSet();
        for(int i = 0; i < (this.set).length; ++i){
            if(this.set[i] == true || other.set[i] == true){
                union.insertElement(i);
            }
        }
        return union;
    }

    public IntegerSet intersectionOfIntegerSet(IntegerSet other){
        IntegerSet intersection = new IntegerSet();
        for(int i = 0; i < (this.set).length; ++i){
            if(this.set[i] == true && other.set[i] == true){
                intersection.insertElement(i);
            }
        }
        return intersection;
    }
}