/** 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 */

package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program10 {

    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(0, 100);
        }
        System.out.println(System.currentTimeMillis() - start);

        LinkedList<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(0, 100);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}

