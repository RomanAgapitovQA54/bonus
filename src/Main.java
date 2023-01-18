public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1100;

        int bonus;

        if (replenishment <= 1000) {
            bonus = 0;
        } else {
            bonus = replenishment / 100;
        }
        System.out.println("Ваши бонусы составляют: " + bonus + " рублей");

        if (replenishment > 1000) {
            balance = replenishment + balance + bonus;
        } else {
            balance = (balance + replenishment);
        }
        System.out.println("Ваш баланс составляет: " + balance + " рублей");
    }
}