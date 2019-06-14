package com.jarod.fain.pet;

public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;

        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка " +
                    " и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Погружаюсь еще на " + howDeep + "метров");
//            System.out.println("Ныряю на глубину " + howDeep + " метров");
            System.out.println("Я на глубине " + currentDepth + " метров ");
            {
                return currentDepth;
            }
       /* public String say (String){
        return "Разве вы не знаете, что рыбы не говорят?";
        }
        */
        }
        return Integer.parseInt(" ");
    }
}

