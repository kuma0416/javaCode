package ch7;

public class test {
    public static void main(String[] argv){
        int[] a = {5, 6, 7, 8};
        int[] b = {1, 2, 3, 4};
        System.out.println(b[(a=b)[2]]);
    }
}
