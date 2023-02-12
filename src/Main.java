public class Main {
    public static void main(String[] args) {

        int account = 100; // счёт клиента

        int replenishment = 1100; // сумма пополнения

        int limit = 1000; // сумма пополнения для получения бонусов

        int bonus;
        int result;
        if (replenishment > limit) {
            bonus = replenishment / 100;
            result = account + bonus + replenishment;
            System.out.println("Начислено " + bonus + " бонусных рублей" + ", на счету " + result + " рублей . ");
        } else {
            bonus = 0;
            result = account + replenishment;
            System.out.println("Бонусов нет" + ", на счету " + result + " рублей ");
        }
    }
}



