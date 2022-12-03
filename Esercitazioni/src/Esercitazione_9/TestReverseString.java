package bin.es9;

public class TestReverseString{
    public static void main(String args[]){
        String s = "Questo e solo un esempio";
        ReversedString rs = new ReversedString(s);
        System.out.println(rs.subSequence(0, 7));
    }
}