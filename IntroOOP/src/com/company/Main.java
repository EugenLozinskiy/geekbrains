package com.company;

/**
 * Geekbrains. Java. Уровень 1. Урок 5. ДЗ
 *
 * @author Евгений Лозинский
 * @version 07.12.2018
 */
public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иванов", "Дмитрий", "Петрович",
                "Архитектор", "ivanovdp@mail.ru", 250000, 35);
        persArray[1] = new Person("Петров", "Андрей", "Ильич", "Разработчик",
                "petrovai@mail.ru", 150000, 48);
        persArray[2] = new Person("Сидоров", "Илья", "Петрович",
                "Разработчик", "sidorovip@mail.ru", 150000, 25);
        persArray[3] = new Person("Сидоров", "Илья", "Петрович",
                "Разработчик", "sidorovip@mail.ru", 150000, 42);
        persArray[4] = new Person("Сидоров", "Илья", "Петрович",
                "Разработчик", "sidorovip@mail.ru", 150000, 45);

        for (Person e : persArray) if (e.getAge() > 40) e.getInfo();
    }
}

class Person {
    private String lastname;
    private String name;
    private String middlename;
    private String position;
    private String email;

    private int salary;
    private int age;

    public Person(String lastname,
                  String name,
                  String middlename,
                  String position,
                  String email,
                  int salary,
                  int age) {
        this.lastname = lastname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getInfo() {
        System.out.println("Фамилия: " + lastname + " | Имя: " + name
                + " | Отчетсво: " + middlename + " | должность: " + position
                + " | Электронный адрес: " + email + " | Заработная плата: " + salary + " | Возраст: "
                + age);
    }

    int getAge() {
        return age;
    }
}