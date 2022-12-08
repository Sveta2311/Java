/** Написать метод, который определяет, является ли год високосным,
 * и возвращает boolean (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

package org.example;

import java.util.Scanner;

public class Home5 {public static void main(String[] args) {
    System.out.print(ex1());
}
    static boolean ex1() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите год: ");
    int year = scanner.nextInt();
    if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) return false;
    else return true;
    }
}

