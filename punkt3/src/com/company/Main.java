package com.company;

class MyClass {

    int Vichislit(int a, int b, int c, int d) {

        int vichislenie = a * (b + (c / d));
        return vichislenie;

    }

}

public class Main {

    public static void main(String[] args) {

        MyClass test = new MyClass();

	    System.out.println("Вычисляется выражение 8 * (6 + (4 / )2). ИТОГ = " + test.Vichislit(8,6,4,2));

    }
}
