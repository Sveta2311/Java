package org.example;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        ex1();

    }

    private static void ex1() {
        System.out.print("Введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        System.out.println("Привет, " + name);
        System.out.printf("Привет, %s%n", name);
    }
}
