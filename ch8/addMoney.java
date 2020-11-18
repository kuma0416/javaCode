package ch8;

public class addMoney {
    public static void main(String[] argv){
        icCardN1 mycard = new icCardN1();
        mycard.id = "ax782";
        mycard.money = 300;
        mycard.showInfo();
        mycard.add(300);
        mycard.showInfo();
    }
}

class icCardN1 {
    int money;
    String id;

    void showInfo(){
        System.out.println("Card id: " + id + ", money: " + money);
    }

    void add(int value){
        money += value;
        System.out.println("add " + value + " dollars into icCard.");
    }
}