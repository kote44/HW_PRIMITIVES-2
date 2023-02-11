public class Main {
    public static void main(String[] args) {

        int account = 100; // счёт клиента

        int replenishment1 = 300; // пополнение счёта
        int replenishment2 = 1100; // пополнение счёта

        System.out.println((account + replenishment1) + " Бонусы не начисляются");
        System.out.println((account + (replenishment2 / 100) + replenishment2) + " Бонусы начисляются");
    }

}
