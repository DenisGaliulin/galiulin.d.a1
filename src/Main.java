public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int cashAccount = 200;
        int paidFor = 1200;
        int bonus = paidFor / 100;


        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (paidFor > 1000) {
            System.out.println("итоговый сумма на счету:" + (paidFor + cashAccount + bonus));
        } else {
            System.out.println("итоговый сумма на счету:" + (paidFor + cashAccount));
        }
    }
}