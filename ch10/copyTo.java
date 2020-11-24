package ch10;

public class copyTo {
    public static void main(String[] argv){
        String testS = "this is a test string.";
        char dest[] = new char[4];
        testS.getChars(10, 14, dest, 0);
        System.out.println(new String(dest));
        //System.out.println(dest);
    }
}
