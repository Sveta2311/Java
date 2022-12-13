/** Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */

package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Home15 {
    public static void main(String[] args) {
        oddNumbers();
    }

    private static void oddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину списка целых чисел: ");
        int a = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            list.add(random.nextInt(-50,50));
        }

        System.out.println("Сформированный список, заданной длины: " + list);
        System.out.println("Минимальное значение из списка: ");
        System.out.println(Collections.min(list));
        System.out.println("Максимальное значение из списка: ");
        System.out.println(Collections.max(list));

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(Math.abs(sum));
        double result = (Math.abs(sum))/a;
        System.out.println("Среднее арифметическое из этого списка: ");
        System.out.println(result);
        }
    }
