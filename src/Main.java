    public class Main {
        public static void main(String[] args) {
            int initialAccount = 100; // начальный баланс
            int replenishmentAmount = 999; //сумма пополнения
            int balans = initialAccount + replenishmentAmount; // баланс счёта

            if (replenishmentAmount > 1000) { int bonus =  replenishmentAmount / 100;//если сумма пополнения больше 1000
                System.out.println("Ваш бонус составляет "  + bonus +" р.") ;
            }
            if (replenishmentAmount <= 1000) {int bonus = 0;  // а если сумма пополнения равна или меньше 1000, то бонус ноль
                System.out.println("Ваш бонус составляет "  + bonus +" р."); }}}
