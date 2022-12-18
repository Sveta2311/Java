/** В шаблоне MyStack с урока реализовать методы.
 */

package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class Home17 {
    private static LinkedList stack = new LinkedList();
    public static void main(String[] args) {
        push();
        System.out.println("LinkedList: " + stack);
        System.out.println("Последний элемент в стеке: " + peek());
        System.out.println("Посмотреть и извлечь последний элемент из стека: " + pop());
        System.out.println("LinkedList без последнего элемента: " + stack);
    }
    private static boolean push() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите элемент стека (каждый новый элемент стека вводится после Enter), для выхода введите слово stop: ");
            String text = scanner.nextLine();
            if (text.equals("stop")) {
                return false;
            }
            stack.addLast(text);
        }
    }
    private static String peek() {
        return (String) stack.getLast();
    }
    private static String pop() {
        return (String) stack.removeLast();
    }
}
