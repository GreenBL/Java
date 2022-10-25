public class TestObjCount{
    public static void main(String args[]){
        ObjCount a = new ObjCount(11);
        ObjCount b = new ObjCount(12);
        ObjCount c = new ObjCount(13);
        ObjCount d = new ObjCount(14);
        ObjCount e = new ObjCount(15);

        System.out.println("A object " + a.value + " = " + a.localRank + "st instance of object"
                            + "\ntotal of " + a.globalCount + " objects instanced!");
        System.out.println("B object " + b.value + " = " + b.localRank + "nd instance of object"
                            + "\ntotal of " + b.globalCount + " objects instanced!");
        System.out.println("C object " + c.value + " = " + c.localRank + "rd instance of object"
                            + "\ntotal of " + c.globalCount + " objects instanced!");
        System.out.println("D object " + d.value + " = " + d.localRank + "th instance of object"
                            + "\ntotal of " + d.globalCount + " objects instanced!");
        System.out.println("E object " + e.value + " = " + e.localRank + "th instance of object"
                            + "\ntotal of " + e.globalCount + " objects instanced!");


    }
}