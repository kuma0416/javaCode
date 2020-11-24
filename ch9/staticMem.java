package ch9;

public class staticMem {
    public static void main(String[] argv){
        testNN a = new testNN(20, 30);
        testNN b = new testNN(30, 40);
        testNN c = new testNN(40, 50);
        System.out.println("x: " + a.x + ", y:" + a.y);
        System.out.println("x: " + b.x + ", y:" + b.y);
        System.out.println("x: " + c.x + ", y:" + c.y);
    }

}
class testNN{
    int x;
    static int y;

    testNN(int x, int y){
        this.x = x;
        this.y = y;
    }
}