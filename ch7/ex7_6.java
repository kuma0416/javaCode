package ch7;

public class ex7_6 {
    public static void main(String[] argv){
        int[] a = {20, 30, 40, 50};
        int[] b = {1, 3, 0, 2};
        int[] c = new int[b.length];
        for(int i=0;i<b.length; i++){
            c[b[i]] = a[i];
        }
        for(int i:c){
            System.out.print(" " + i + " ");
        }
    }
}
