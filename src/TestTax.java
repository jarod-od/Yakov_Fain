public class TestTax {
    public static void main(String[] args) {
        Tax t = new Tax();
        t.grossIncome = 50000;
        t.numberOfDependens = 2;
        t.state = "NJ";

        double yourTax = t.calcTax();
        System.out.println("You tax is " + yourTax);// Напечать вывело 4 тыс, т.к. 50 тыс => дохода и пошло на 8%
    }
}
