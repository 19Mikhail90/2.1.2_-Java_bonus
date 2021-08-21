public class Main {
    public static void main(String[] args) {
        int initialAccount = 100; // начальный баланс
        int replenishmentAmount = 999; //сумма пополнения

        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / 100); //если сумма пополнения больше 1000, то высчитывается бонус

        } else {
            bonus = 0;
        }
        System.out.println("Ваш бонус составляет " + bonus + " р.");
    }
}

