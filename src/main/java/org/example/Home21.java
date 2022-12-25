/** Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков (ArrayList).
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 * Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
 * Выводить только те ноутбуки, что соответствуют условию
 */

package org.example;

import java.util.*;
public class Home21 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Ноутбук1", 20000, "Intel Celeron N3060", "Серый", 4);
        Laptop laptop2 = new Laptop("Ноутбук2", 22000, "Intel Core i5 1155G7", "Серый", 5);
        Laptop laptop3 = new Laptop("Ноутбук3", 25000, "Intel Core i3 1115G4", "Серебристый", 5);
        Laptop laptop4 = new Laptop("Ноутбук4", 24000, "Intel Celeron 6305", "Серебристый", 4);
        Laptop laptop5 = new Laptop("Ноутбук5", 30000, "Intel Core i3 1005G1", "Серый", 6);
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        laptopArrayList.add(laptop1);
        laptopArrayList.add(laptop2);
        laptopArrayList.add(laptop3);
        laptopArrayList.add(laptop4);
        laptopArrayList.add(laptop5);

        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(0, "");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный размер оперативной памяти(RAM): ");
        int userRam = scanner.nextInt();

        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(userRam, "");

        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        String userColor = scanner2.nextLine();

        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(0, userColor);
        }

        System.out.println("\nДвойной фильтр:\n");
        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(userRam, userColor);
        }

    }
}

