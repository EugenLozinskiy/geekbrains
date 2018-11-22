package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите год!");

        int year = scan.nextInt();

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {

            System.out.println(year + "- это високостный год");
        } else System.out.println(year +" - это не високостный год");
    }
    }

