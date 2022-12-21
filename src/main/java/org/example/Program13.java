/**Написать метод, который переведет число из римского формата записи в арабский.
 * Например, MCMXXIX = 1929
 */


package org.example;

import java.util.HashMap;
import java.util.Map;

public class Program13 {
    public static void main(String[] args) {
        ex1();
    }


    private static void ex1() {

        Map<Character, Integer> db = new HashMap<>();
        db.put('I', 1);
        db.put('V', 5);
        db.put('X', 10);
        db.put('L', 50);
        db.put('C', 100);
        db.put('D', 500);
        db.put('M', 1000);
        String roman = "MCMXXIX";
        int end = roman.length()-1;
        char[] arr = roman.toCharArray();
        int arabian;
        int result = db.get(arr[end]);
        for (int i = end-1; i >=0; i--) {
            arabian = db.get(arr[i]);

            if (arabian < db.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
             }
        }
        System.out.println(result);
    }
}