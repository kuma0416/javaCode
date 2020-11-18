package ch8;

public class cardArray {
    public static void main(String[] argv){
        icCard[] manycard = new icCard[3];//deploy object array

        for(int i = 0; i<3; ++i){
            manycard[i] = new icCard();//Don't forget this line, deploy object space
            manycard[i].ID = 33475 + i;
            manycard[i].money = 3000 + 6000 * i;
        }

        for (icCard nowCard : manycard) {
            nowCard.showInfo();
        }
    }
}

class icCard {
    int ID;
    int money;

    void showInfo () {
        System.out.println("card ID: " + ID + ", card money: " + money);
    }
}