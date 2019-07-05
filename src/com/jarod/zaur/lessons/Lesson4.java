package com.jarod.zaur.lessons;

 public class Lesson4 {

     String car;
     double distance;
     int time;
     int speed;
 }
     class TestLesson{

        public static void main (String[] args){
            Lesson4 foo = new Lesson4();
            foo.car = "Dodge";
            foo.distance = 5.5;

            System.out.print("My car is " + foo.car +" i ride almost " + foo.distance + " km");
        }

    }

