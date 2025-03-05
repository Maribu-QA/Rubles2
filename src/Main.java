public class Main {

    public static void main(String[] args) {

        int initialBalance = 250;
        int added = 1500;

        int bonus = 0;
        if (added > 1000) {
            bonus = added / 100;
        }
        int finalBalance = initialBalance + added + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
