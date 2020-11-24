package ch8;

public class addMoneyMem {
    public static void main(String[] argv){
        icCardN2 mycard = new icCardN2();
        mycard.id = "ax782";
        mycard.money = 300;
        mycard.showInfo();
        mycard.add(300);
        mycard.showInfo();
    }
}

class icCardN2 {
    int money;
    String id;

    void showInfo(){
        System.out.println("Card id: " + id + ", money: " + money);
    }

    void add(int money){
        money += money;
        System.out.println("add " + money + " dollars into icCard.");
    }
}