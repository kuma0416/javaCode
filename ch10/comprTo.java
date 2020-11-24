package ch10;

public class comprTo {
    public static void main(String[] argv){
        String a = "abcd";
        System.out.println(a.compareTo("abcb"));
        System.out.println(a.compareTo("abcd"));
        System.out.println(a.compareTo("abce"));
        System.out.println(a.compareTo("abcde"));
        System.out.println(a.compareTo("Abcd"));
        System.out.println(a.compareTo("bbcd"));
    }
}
