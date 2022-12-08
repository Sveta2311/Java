/** Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.
 */

package org.example;

import java.util.Arrays;

public class Home7 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        int[] UserArray = new int[100];
        for (int i = 0; i < UserArray.length; i++) {
            UserArray[i] = i + 1;
        }
        System.out.println("Сформированный массив: ");
        System.out.println(Arrays.toString(UserArray));
    }
}


