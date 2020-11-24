package ch9;

public class argConstructor {
    public static void main(String[] argv){
        testOne a = new testOne(30, 40);
        System.out.println("x = " + a.x + ", y = " + a.y);
    }
}
class testOne{
    int x, y;
    testOne(int varOne, int varTwo){
        x = varOne;
        y = varTwo;
    }
}