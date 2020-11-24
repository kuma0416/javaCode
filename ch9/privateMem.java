package ch9;

public class privateMem{
    public static void main(String[] argv){
        privateCl a = new privateCl();
        a.show();
        a.modifyVar(20);
        a.show();
    }
}
class privateCl {
    private int i = 1;
    void show(){
        System.out.println(i);
    }
    void modifyVar(int value){
        this.i = value;
    }
}