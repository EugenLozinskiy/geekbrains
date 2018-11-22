package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// write your code here

        System.out.println("Введите первое число!");

        int number1 = scan.nextInt();

        if (number1 >= 0) {

            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }
}
