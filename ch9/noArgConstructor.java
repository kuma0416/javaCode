package ch9;

public class noArgConstructor {
    public static void main(String[] argv){
        test a = new test();
        System.out.println("x = " + a.x + ", y = " + a.y);
    }
}
class test{
    int x, y;
    test(){
        x = 10;
        y = 20;
    }
}