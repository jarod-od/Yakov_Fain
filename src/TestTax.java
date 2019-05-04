public class TestTax {
    public static void main(String[] args) {
//        Tax t = new Tax();// закоментили строчку, т.к. тестим класс NJTax, что бы увидеть расчет.
        NJTax t = new NJTax();
        t.grossIncome = 50000;
        t.numberOfDependens = 2;
        t.state = "NJ";

        double yourTax = t.calcTax();
        double njt = t.adjustForStudents(yourTax);

        System.out.println("You tax is " + njt);// Напечать вывело 4 тыс, т.к. 50 тыс => дохода и пошло на 8%
    }
}
