/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве
 * и верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */


package org.example;

import java.util.*;

import static org.example.Program7.ex;

public class Program15 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++)
            list.add(random.nextInt(0, 100));
//        System.out.println(list);
//        System.out.println(ex(list));
        Cat cat1 = new Cat("Барсик", 10, 1, "Черный", "Британец");
//        cat.setName("Барсик");
//        cat.setAge(12);
//        cat1.jump();
//        cat1.run();
//        cat1.printInfo();
        System.out.println("\n -----------");
        Cat cat2 = new Cat("Пушок", 22, 2, "Серый", "Мейкун");
//        cat2.printInfo();
        ArrayList<Cat> catArrayList = new ArrayList<>();
        catArrayList.add(cat1);
        catArrayList.add(cat2);

        cat2.setSpeak(true);

        for (Cat cat : catArrayList) {
//            System.out.println(item);
            cat.printInfo();
            cat.run();
            cat.jump();
            cat.speak();
        }

    }


    private static double ex(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        double res = (double) set.size() * 100 / list.size();
        return res;
    }
}
