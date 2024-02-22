package Listing3;

class Basket {
    void payCash(double money) {
        System.out.println("Оплачено наличными: " + money);
    }
    void payCard(String cardNum) {
        System.out.println("Оплачено по кредитной карте #" + cardNum);
    }
    void payCheck(String accountNum, String bankCode) {
        System.out.println("Переведено на счет #" + accountNum + " в банке " + bankCode);
    }
}
class BasketDemo {
    public static void main(String[] args) {
        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();
        System.out.print("b1: ");
        b1.payCash(1200.0);
        System.out.print("b2: ");
        b2.payCard("123456789");
        System.out.print("b3: ");
        b3.payCheck("987654321", "5500");
    }
}
