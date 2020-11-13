package ch7;

public class argvTest {
    public static void main(String[] argv){
        int i = 0, sum = 0;
        if(argv.length>0){
            i = Integer.parseInt(argv[0]);
        }
        for(int index=1; index<=i;index++){
            sum+=index;
        }
        System.out.print("sum: " + sum);
    }
}
