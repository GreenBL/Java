package bin.es9;
import java.lang.CharSequence;

public class ReversedString implements CharSequence{
    
    private final CharSequence original;

    public ReversedString(String s){
        this.original = (CharSequence) s;
    }

    public int length(){
        return original.length();
    }

    public char charAt(int index){
        return original.charAt(original.length() - index - 1);
    }

    public CharSequence subSequence(int start, int end){
        int originalEnd = original.length() - start;
        int originalStart = original.length() - end;
        return new ReversedString((String)original.subSequence(originalStart, originalEnd));
    }

    public String toString(){
        return new StringBuilder(this).toString();
    }
}