/** В шаблоне MyQueue с урока реализовать методы
 */

package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Home18 {

    private static Queue<String> queue = new LinkedList<String>();
    public static void main(String[] args) {
        add();
        System.out.println("Queue: " + queue);
        System.out.println("Первый элемент в очереди: " + top());
        System.out.println("Извлечь и вернуть первый элемент в очереди: " + remove());
        System.out.println("Queue без первого элемента: " + queue);
    }
    private static boolean add() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите элемент массива (каждый новый элемент массива вводится после Enter), для выхода введите слово stop: ");
            String text = scanner.nextLine();
            if (text.equals("stop")) {
                return false;
            }
            queue.offer(text);
        }
    }
    private static String top() {
        return queue.peek();
    }
    private static String remove() {
        return queue.poll();
    }
}

