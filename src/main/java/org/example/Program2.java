package org.example;
/** Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        ex2();

    }

    static void ex2() {
        int counter = 0;
        int result = 0;
        int[] binaryArray = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        for (int i : binaryArray) {
            if (i == 1) {
                counter += 1;
            } else {
//                result = result > counter ? result : counter;
                result = Math.max(result, counter);
                counter = 0;
            }
        }
        System.out.println(Math.max(result, counter));
    }

}