package ch4;
import java.util.*;

public class input {
    public static void main(String[] argv){
        int numOfApple, item, fin;

        System.out.println("please input how many apples to distribute:");
        Scanner sc = new Scanner(System.in);
        numOfApple = sc.nextInt();

        item = numOfApple/7;
        fin = numOfApple%7;

        System.out.println(numOfApple + " apples should be distributed to 7 people.\neveryone would get " + item + " apples, and left over " + fin);
    }
}
