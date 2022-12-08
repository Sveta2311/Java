/** Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
 * то есть [0][0], [1][1], [2][2], …, [n][n].
 */

package org.example;

import java.util.Scanner;

public class Home9 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадратного массива: ");
        int a = scanner.nextInt();
        int[][] UserArray = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j) || (i == a - 1 - j)) {
                    UserArray[i][j] = 1;
                }
            }
        }

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(UserArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
