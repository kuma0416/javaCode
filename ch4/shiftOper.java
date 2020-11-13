package ch4;

public class shiftOper {
    public static void main(String[] argv){
        int i = 2;
        System.out.println("i = 2, i << 1:" + (i<<1) + " i >> 1:" + (i>>1) + " i >>> 1:" + (i>>>1));
        i = -2;
        System.out.println("i = -2, i << 1:" + (i<<1) + " i >> 1:" + (i>>1) + " i >>> 1:" + (i>>>1));
    }
}