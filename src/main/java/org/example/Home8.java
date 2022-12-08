/** Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.
 */

package org.example;

import java.util.Arrays;

public class Home8 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        int[] UserArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(UserArray));
        for (int i = 0; i < UserArray.length; i++) {
            if (UserArray[i] < 6) UserArray[i] *= 2;
        }
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(UserArray));
    }
}


