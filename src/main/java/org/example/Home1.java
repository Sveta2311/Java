/** Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */

package org.example;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        System.out.print(ex1());
    }

    static boolean ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.print("Сумма a + b : ");
        System.out.println(sum);
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }
}
