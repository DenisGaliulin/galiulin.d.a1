public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int cashaccount = 200;
        int paidfor = 1200;
        int bonus = paidfor / 100;


        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (paidfor > 1000) {
            System.out.println("итоговый сумма на счету:" + (paidfor + cashaccount +bonus));
        }else {
            System.out.println("итоговый сумма на счету:" + (paidfor + cashaccount));
        }
    }
}