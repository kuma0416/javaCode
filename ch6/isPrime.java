package ch6;
import java.io.*;

public class isPrime {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            Integer inputNum = Integer.parseInt(str);
            boolean isPrime = true;
            double range = inputNum/2;
            for(int i=2;i<=range;i++){
                if(inputNum%i==0 && isPrime==true){
                    System.out.print(inputNum + " not prime, can be " + i);
                    isPrime = false;
                } else if(inputNum%i==0) {
                    System.out.print(", " + i);
                }
            }
            if(isPrime==true){
                System.out.print(inputNum + " is prime!");
            }else{
                System.out.print(" completely divided");
            }
            System.out.print("\n");
        }
    }
}
