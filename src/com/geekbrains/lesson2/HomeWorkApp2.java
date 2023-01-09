package com.geekbrains.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("checkSum(5, 6) = " + checkSum(5, 6));
        checkPositive(3);
        System.out.println("checkNegative(-1) = " + checkNegative(-1));
        printString("Hi", 3);
        System.out.println("isLeapYear(2) = " + isLeapYear(800));
    }

    private static boolean checkSum(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;
    }

    private static void checkPositive(int a) {
        if (a >= 0) {
            System.out.println(a + " - положительное число.");
        } else {
            System.out.println(a + " - отрицательное число.");
        }
    }

    private static boolean checkNegative(int a) {
        return !(a > 0);
    }

    private static void printString(String str, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(str);
        }
    }

    private static boolean isLeapYear(int year) {
        if ((year % 400) == 0) {
            return true;
        }
        if ((year%100) == 0) {
            return false;
        }
        return (year % 4) == 0;
    }
}
