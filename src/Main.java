public class Main {
    public static void main(String[] args) {

        int x = 100; // счёт клиента

        int y = 300; // пополнение счёта
        int z = 1100; // пополнение счёта

        System.out.println((x + y) + " Бонусы не начисляются");
        System.out.println((x + (z / 100) + z) + " Бонусы начисляются");
    }

}
