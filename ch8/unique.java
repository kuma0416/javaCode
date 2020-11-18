package ch8;

public class unique {
    public static void main(String[] argv){
        test a, b, c;
        a = new test();
        b = new test();
        System.out.println("a == b ? " + (a==b));

        c = b;
        c.x = 10;
        System.out.println("c ==b ? " + (c==b));
        System.out.print("a.");
        a.show();
        System.out.print("b.");
        b.show();
        System.out.print("c.");
        c.show();
    }
}

class test {
    int x = 3;

    void show(){
        System.out.println("x = " + x);
    }
}