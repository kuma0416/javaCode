package ch4;

public class boolComplement {
    public static void main(String[] argv){
        boolean lightOn = false;
        System.out.println("light on? " + lightOn);
        lightOn = !lightOn;
        System.out.println("light on? " + lightOn);
    }
}
