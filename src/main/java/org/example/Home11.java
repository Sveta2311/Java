/** Задать одномерный массив и найти в нем минимальный и максимальный элементы.
 */

package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class Home11 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int a = scanner.nextInt();
        Random random = new Random();
        int[] UserArray = new int[a];
        for (int i = 0; i < UserArray.length; i++) {
            UserArray[i] = random.nextInt(-50,50);
        }
        int min = UserArray[0];
        int max = UserArray[0];
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(UserArray));

        for (int i = 0; i < UserArray.length; i++) {
            min = (min < UserArray[i]) ? min : UserArray[i];
            max = (max > UserArray[i]) ? max : UserArray[i];
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}

