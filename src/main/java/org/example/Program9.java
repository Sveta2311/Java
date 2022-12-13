/** Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program9 {
    public static void main(String[] args) {
        Planets();
    }

    private static void Planets() {
       List<String> v = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
               "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        System.out.println(v);
        List<String> b = new ArrayList<>();
        for (int i = 0; i < v.size()-1; i++) {
            int counter = 1;
            for (int j = 1; j < v.size(); j++) {
                if (v.get(i)==v.get(j)) {counter+=1;}
            }
            if (b.contains(v.get(i)) == false){
                b.add(v.get(i));
                System.out.printf("%s,%s\n",v.get(i),counter);
            }
            counter = 1;
        }
    }
}