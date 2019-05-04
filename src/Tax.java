public class Tax {
    int numberOfDependens; // кол-во иждивенцев
    double grossIncome;// Доход годовой
    String state; // место проживания, штат

    // Расчитываем сумму налогов
    public double calcTax() {
        if (grossIncome < 50000){
            return grossIncome*0.06;// Если доход до 50 тыс, то налог = 6%
        }
        else{
            return grossIncome*0.08;// Если больше 50 тыс, то налог = 8%
        }
    }
}
