/** Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
 * Пример: вход "aaaabbbcdd".
 */

package org.example;

public class Program4 {
    public static void main(String[] args) {
        System.out.println(buildString('X', 'o', 21));
        System.out.println(buildString());
    }

    private static String buildString(char c1, char c2, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    private static String buildString() {
        return buildString('F', '_', 10);
    }
}

