public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int deposit = 1010;
        int bonus = deposit / 100;

        if (deposit <= 1000) {
            System.out.println("Ваш баланс равен " + (balance + deposit));
            System.out.println("Пополните счёт более чем на 1000 рублей и получите бонус 1 рубль за каждые полные 100 рублей пополнения");
        } else {
            System.out.println("Ваш баланс равен " + (balance + deposit + bonus));
            System.out.println("Бонусов начислено " + bonus);
        }

    }
}

//// Объявляете переменные для входных данных и
//// параметров программы: начального счёта,
//// суммы пополнения и тп
//// Условным оператором проверяете, превысила ли
//// сумма пополнения порог, и для этих двух разных
//// сценариев рассчитываете сумму бонуса и выводите
//// на экран.
