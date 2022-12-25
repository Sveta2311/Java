/**Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
 * Распечатайте содержимое данного множества.
 */

package org.example;

import java.util.*;

public class Program14 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 7, 4, 5, 6, 3));
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 7, 2, 4, 5, 6, 3));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 7, 4, 5, 6, 3));
        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);
    }
}

