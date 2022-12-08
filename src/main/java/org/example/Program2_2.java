package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program2_2 {
    public static void main(String[] args) {
        ex2();

    }

    static void ex2() {
        int counter = 0;
        int result = 0;
        Random random = new Random();


//        int[] binaryArray = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        int[] binaryArray = new int[1000];
        for (int i = 0; i < binaryArray.length - 1; i++) {
            binaryArray[i] = random.nextInt(2);
        }

        System.out.println(Arrays.toString(binaryArray));

        for (int i : binaryArray) {
            if (i == 1) {
                counter += 1;
            } else {
                result = result > counter ? result : counter;
                //(условие) ? true : false

/*                if (result > counter) {
                    result = result;
                } else {
                    result = counter;
                }*/

                result = Math.max(result, counter);
                counter = 0;
            }
        }
        System.out.println(Math.max(result, counter));
    }

}