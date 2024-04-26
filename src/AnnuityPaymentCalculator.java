public class AnnuityPaymentCalculator {

/*
        ЕП = С * ПС * (1 + ПС)^n / ((1 + ПС)^n -1)  формула платежа
         ЕП (ежемесячный платеж)         - monthlyPayment
         C (сумма займа)                 - amount
         ПС (месячная ставка по кредиту) - monthlyRate 9.9/0.12
 */
    // n (количество месяцев)        - month
    // double у = Math.pow(x, a);

    public int Calculate(int amount, double rate, int month) {
        double monthlyRate = rate / 12.0 / 100.0;
        double fraction = Math.pow((1 + monthlyRate), month);
        double numerator = amount * monthlyRate * fraction;
        double denominator = (fraction - 1);

        return (int) (numerator / denominator);

    }
}