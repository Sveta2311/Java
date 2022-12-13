/** Пусть дан произвольный список целых чисел, удалить из него четные числа
 * (в языке уже есть что-то готовое для этого).
 */

package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Home14 {
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

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }
        System.out.println("Список без четных чисел: "+ odd);
    }
}