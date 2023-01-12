package com.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 1};
        System.out.println("Arrays.toString(arr) before = " + Arrays.toString(arr));
        change(arr);
        System.out.println("Arrays.toString(arr) after = " + Arrays.toString(arr));

        createArray();
        doubleNum();
        squareArray(5);

        int[] array = createSpecificArray(10, 777);
        System.out.println(Arrays.toString(array));

        minMax();
    }

    private static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
    }

    private static void createArray() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
    }

    private static void doubleNum() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Arrays.toString(arr3) before = " + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("Arrays.toString(arr3) after = " + Arrays.toString(arr3));
    }

    private static void squareArray(int length) {
        int[][] arr4 = new int[length][length];
        System.out.println("Arrays.toString(arr4) before");
        printIntSquareArray(arr4);
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
        }
        System.out.println("Arrays.toString(arr4) after");
        printIntSquareArray(arr4);
    }

    private static void printIntSquareArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[] createSpecificArray(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }

    private static void minMax() {
        int[] ints = {12, 0, -323, 9495, -111};
        System.out.println(Arrays.toString(ints));
        int min = 0, max = 0;
        for (int i : ints) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("min = %d, max = %d", min, max);
    }
}
