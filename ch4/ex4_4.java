package ch4;
import java.util.*;
public class ex4_4 {
    public static void main(String[] argv){
        int i, j, sum;
        System.out.println("input i:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("input j:");
        sc = new Scanner(System.in);
        j = sc.nextInt();
        sum = i + j;
        System.out.println("sum quare:" + sum*sum);
    }
}
