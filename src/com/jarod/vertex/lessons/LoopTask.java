package com.jarod.vertex.lessons;

import java.util.Scanner;

public class LoopTask {

    /*Задача №4
Напишите программу, где пользователь вводит любое целое положительное число.
 А программа суммирует все числа от 1 до введенного пользователем числа.
Например:
если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3,
 то есть 1+2+3 и выдать ответ 6.
если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5,
 то есть 1+2+3+4+5 и выдать ответ 15.*/

    public static void main(String[] args) {
        System.out.println("Введите любое целое положительно число: ");
        Scanner sc = new Scanner (System.in);// - объявляем сканер

        int n = sc.nextInt(); //считываем с консоли введённое целое число. Для этого используем метод nextInt ()

//    Причем мы заранее знаем сколько раз будут суммироваться числа: от 1 до n, где n – введённое пользователем число.
//    А значит нам надо использовать цикл for.

        int sum = 0;
        //По условию задачи, нам надо суммировать числа от 1 до n.
        // Для этого перед циклом мы объявляем переменную int sum и присваиваем ей значение 0:
        for (int i = 1; i <= n; i++ ) {
            sum = sum +i;  //В переменную sum будут суммироваться числа с помощью цикла for
        }
        System.out.println(sum);
        }
    }
