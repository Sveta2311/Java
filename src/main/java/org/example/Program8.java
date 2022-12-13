/** Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на экран.
 */

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class Program8 {
    public static void main(String[] args) {
        ex();
    }

    private static void ex() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

//        list.sort(Comparator.naturalOrder());
//        Collections.sort(list);
//        list.sort(Integer::compare);

        System.out.println(list);
    }
}



