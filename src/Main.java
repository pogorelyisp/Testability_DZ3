public class Main {
    public static void main(String[] args) {

/*
        ЕП = С * ПС * (1 + ПС)^n / ((1 + ПС)^n -1)  формула платежа
         ЕП (ежемесячный платеж)         - monthlyPayment
         C (сумма займа)                 - amount
         ПС (месячная ставка по кредиту) - monthlyRate 9.9/0.12
 */
        int amount = 1_000_000;
        double rate = 9.99;

        CreditPaymentService calculator = new CreditPaymentService();

        for (int month = 12; month <= 36; month += 12)
        {
            //    Этот цикл for начинается с переменной month равной 12,
            //    итерации выполняются до тех пор, пока month меньше или равно 36,
            //    и после каждой итерации month увеличивается на 12.
            //     Таким образом, этот цикл будет выполняться для month равного 12, 24 и 36.

            int monthlyPayment = calculator.Calculate(amount, rate, month);
            System.out.println("Ежемесячный платеж при сроке " + month + " месяцев  " + monthlyPayment);
        }

    }
}