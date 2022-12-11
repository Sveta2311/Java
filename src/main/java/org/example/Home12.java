/** Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */

package org.example;
import java.util.Scanner;

public class Home12 {
    public static void main(String[] args) {
        System.out.print(palindrome());
    }public static boolean palindrome() {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        str1 = str1.replaceAll("\\s", "");
        StringBuilder strBuilder = new StringBuilder(str1);
        strBuilder.reverse();
        String str2 = strBuilder.toString();

        return str1.equalsIgnoreCase(str2);
    }
}
