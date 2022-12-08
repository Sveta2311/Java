/** Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
 */

package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Home6 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int a = scanner.nextInt();
        Random random = new Random();
        int[] binaryArray = new int[a];
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2);
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(binaryArray));
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) binaryArray[i] = 1;
            else binaryArray[i] = 0;
        }
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(binaryArray));
        }
    }

