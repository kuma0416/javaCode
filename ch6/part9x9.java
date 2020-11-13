package ch6;

public class part9x9 {
    public static void main(String args[]){
        outloop: for(int x=1;x<=9;x++){
            for(int y=1;y<=9;y++){
                if(x*y>=25){
                    System.out.print("\n");
                    continue outloop;
                }
                System.out.print(x + "*" + y + "=" + x*y + "\t");
            }
            System.out.println("");
        }
    }
}
