package com.company;

/**
 * Java. Уровень 1. Урок 3. Домашняя работа
 *
 * @author Евгений Лозинский
 * @version 27.11.2018
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        gameGuessTheNumber();

        }

      private static void gameGuessTheNumber() {

          Scanner scaner = new Scanner(System.in);
          int letsPlay;
          Random random = new Random();
          int secret = random.nextInt(10);

        do {
            int attempt = 0;
            System.out.println("Угадайте число от 0 до 9 с трех попыток!");
            while (true) {

                attempt = attempt+1;
                int userData = scaner.nextInt();
                if (userData == secret) {
                    System.out.println("Вы угадали число с "+ attempt+" попытки!");
                    break;
                } else if (userData < secret) {
                    System.out.println("Введенное число меньше загаданного!");
                } else if (userData > secret) {
                    System.out.println("Введенное число больше загаданного!");
                }

                if (attempt == 3) {
                    System.out.println("У вас закончились попытки!");
                    break;
                }
            }
            System.out.println("Хотите попробовать еще раз? если да наберите 1, если нет 0");
            letsPlay = scaner.nextInt();
    }   while (letsPlay == 1);

        scaner.close();

    }


    }

