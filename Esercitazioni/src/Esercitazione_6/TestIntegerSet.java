package bin.es6;

public class TestIntegerSet{
    public static void main(String args[]){
        /*
        IntegerSet testSet = new IntegerSet();
        IntegerSet testSet2 = new IntegerSet();

        testSet.insertElement(1);
        testSet2.insertElement(2);
        testSet2.insertElement(3);
        testSet.insertElement(3);
        IntegerSet union = testSet.unionOfIntegerSet(testSet2);
        IntegerSet intersection = testSet.intersectionOfIntegerSet(testSet2);
        
        String ass = union.toString();
        String ass2 = intersection.toString();
        System.out.println(testSet.toString());
        System.out.println(testSet2.toString());
        System.out.println("U " +ass + "\nI " + ass2);
        */

        IntegerSetv2 testSet = new IntegerSetv2();
        IntegerSetv2 testSet2 = new IntegerSetv2();

       // testSet.insertElement(1);
        testSet.insertElement(2);
      //  testSet2.insertElement(2);
        testSet2.insertElement(3);
        testSet2.insertElement(5);
        testSet.insertElement(9);
        testSet2.insertElement(9);
        IntegerSetv2 union = testSet.unionOfIntegerSet(testSet2);
        IntegerSetv2 intersection = testSet.intersectionOfIntegerSet(testSet2);
        // testSet2.deleteElement(9);
        String ass = union.toString();
        String ass2 = intersection.toString();
        System.out.println(testSet.toString());
        System.out.println(testSet2.toString());
        System.out.println("U " +ass + "\nI " + ass2);
    }
}