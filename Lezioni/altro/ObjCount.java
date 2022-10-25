public class ObjCount{
    public static int globalCount;
    public int localRank;
    ObjCount(int number){
        System.out.println("Instanced " + number);
        value = number;
        localRank = globalCount + 1;
        ++globalCount;
    }
    public int value;
}