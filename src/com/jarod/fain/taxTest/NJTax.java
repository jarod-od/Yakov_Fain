package com.jarod.fain.taxTest;

/* Создаём подкласс класса Тах, что бы расчитать налог в штате со спец условиями
Условия - если в семье есть студент, то налог равен = налог - 500$*/
public class NJTax extends Tax {
    //создаем метод с параметром Тах, который вернет Тах-500.
    public double adjustForStudents (double tax){
        return tax - 500;
    }

    // Расчитываем сумму налогов
    public double calcTax() {
        if (grossIncome < 50000){
            return grossIncome*0.10;// Если доход до 50 тыс и это штат NJ и есть студент то налог = 10%
        }
        else{
            return grossIncome*0.13;// Если больше 50 тыс, то налог = 13%
        }
    }
}
