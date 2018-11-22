package com.company;

import java.util.Scanner;

class MyClass {

boolean proverka(int a, int b) {

    int summ = a + b;

    if (summ >= 10 && summ <= 20) {

        return true;
    } else return false;

}
}

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// write your code here

        System.out.println("Введите первое число!");

        int number1 = scan.nextInt();

        System.out.println("Введите второе число!");

        int number2 = scan.nextInt();

        MyClass proverit = new MyClass();

        System.out.println("Условие проверки " + proverit.proverka(number1, number2));

    }
}
