package ch8;

public class anonymousArr {
    public static void main(String[] argv){
        testt a = new testt();
        a.showArr(new String[] {"one", "two", "three"});
    }
}
class testt{
    void showArr(String[] arr){
        for(String str: arr){
            System.out.println("arr: " + str);
        }
    }
}