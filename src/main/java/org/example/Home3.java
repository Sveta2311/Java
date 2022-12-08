/** Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */

package org.example;

import java.util.Scanner;

public class Home3 {
    public static void main(String[] args) {
        System.out.print(ex1());
    }

    static boolean ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        if (a < 0) return true;
        else return false;
    }
}