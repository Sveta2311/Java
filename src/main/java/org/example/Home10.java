/** Написать метод, принимающий на вход два аргумента: len и initialValue,
 * и возвращающий одномерный массив типа int длиной len,
 * каждая ячейка которого равна initialValue.
 */

package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Home10 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива (длину): ");
        int len = scanner.nextInt();
        int[] UserArray = new int[len];
        System.out.print("Введите элемент массива (initialValue): ");
        int a = scanner.nextInt();
        for (int i = 0; i < UserArray.length; i++) {
            UserArray[i] = a;
        }
        System.out.println("Сформированный массив: ");
        System.out.println(Arrays.toString(UserArray));
    }
}

