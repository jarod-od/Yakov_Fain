package com.jarod.zaur.lessons.Homework;

public class Student {

    int id;
    String name;
    String surname;
    int course;

    double midleRangeMath;
    double midleRangeGeography;
    double midleRangeHistory;
}
    class StudentTest {
    public static void main (String[] args){
        Student first = new Student();
        first.id = 1;
        first.name = "John";
        first.surname = "Doe";
        first.course = 3;
        first.midleRangeMath = 7.9;
        first.midleRangeGeography = 8.8;
        first.midleRangeHistory = 9.4;

        Student second = new Student();
        second.id = 2;
        second.name = "Piter";
        second.surname = "Pen";
        second.course = 3;
        second.midleRangeMath = 9.4;
        second.midleRangeGeography = 7.0;
        second.midleRangeHistory = 8.0;

        Student third = new Student();
        third.id = 3;
        third.name = "Bobby";
        third.surname = "Braun";
        third.course = 3;
        third.midleRangeMath = 8.0;
        third.midleRangeGeography = 8.0;
        third.midleRangeHistory = 9.5;

        System.out.println("Средняя оценка студента " + first.name + " " + first.surname + " = " + (first.midleRangeMath + first.midleRangeGeography + first.midleRangeHistory)/3);
        System.out.println("Средняя оценка студента " + second.name + " " + second.surname + " = " + (second.midleRangeMath + second.midleRangeGeography + second.midleRangeHistory)/3);
        System.out.println("Средняя оценка студента " + third.name + " " +third.surname + " = " + (third.midleRangeMath + third.midleRangeGeography + third.midleRangeHistory)/3);
    }
}
