package ch4;

public class shortCircut {
    public static void main(String[] argv){
        int i = 3, j = 4;
        System.out.println("Is i++, j the same? " + ((true | (i++) == j)) + "\ni:" + i);
        i = 3; j = 4;
        //System.out.println("Is i++, j the same? " + ((true || (i++) == j)) + "\ni:" + i);
    }
}
