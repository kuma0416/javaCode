package ch7;

public class arrayLoop {
    public static void main(String[] argv){
        double[] student = {80, 50, 89, 90, 76};
        double sum = 0;

        for(double score:student){
            sum += score;
        }
        System.out.println("student score: " + sum/5);
    }
}
