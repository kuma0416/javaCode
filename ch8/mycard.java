package ch8;

public class mycard {
    public static void main(String[] argv){
        icCard mycard = new icCard();

        //mycard.ID = "test0000";
        mycard.money = 3000;

        System.out.print("card id: " + mycard.ID + ", money: " + mycard.money);
    }
}

// class icCard {
//     String ID;
//     int money;
// }