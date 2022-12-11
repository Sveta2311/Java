/** Напишите метод, который сжимает строку.
 * Пример: вход "aaaabbbcdd".
 */

package org.example;

public class Program5 {
    public static void main(String[] args) {
        System.out.println(doSimpleString("aaaabbbcdd"));
    }

    private static String doSimpleString(String str) {
        //empty() - "" - true
        //"" != null - true
        //"     " - isBlank()
        //"     hello       " -> "hello" -> trim()
//        if (str.isBlank()) {
        if (str.trim().length() == 0) {
            return "";
        }

        int counter = 1;
        StringBuilder sb = new StringBuilder();
        char prev = str.charAt(0);
        char curr = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            curr = str.charAt(i);
            prev = str.charAt(i - 1);

            if (curr != prev) {
                sb.append(prev);
                sb.append((counter > 1) ? counter : "");
                counter = 0;
            }

            counter++;
        }
        if (counter != 0) {
            sb.append(curr);
            sb.append((counter > 1) ? counter : "");
        }

        return sb.toString();
    }
}



