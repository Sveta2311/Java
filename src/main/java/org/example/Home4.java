/** Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз.
 */

package org.example;

import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
}