package ch8;

public class memberVar {
    public static void main(String[] argv){
        memT test = new memT();
        test.show();
    }
}

class memT {
    int x = 10;

    void show(){
        System.out.println("x = " + x + ", y = " + y);
    }

    int y = 20;
}