/**  Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */

package org.example;

import java.util.LinkedList;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class Home16 {
    private static LinkedList stack = new LinkedList();
    public static void main(String[] args) {
        push();
        System.out.println("LinkedList: " + stack);
        ex();
    }
    private static boolean push() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите элемент массива (каждый новый элемент массива вводится после Enter), для выхода введите слово stop: ");
            String text = scanner.nextLine();
            if (text.equals("stop")) {
                return false;
            }
            stack.addLast(text);
        }
    }
    private static void ex() {
        for(int i = stack.size()-1; i>=0; i--){
                if(i == 0) {
                    System.out.print(stack.get(i));
                }else{
                    System.out.print(stack.get(i) + ", ");
                }
            }
        }
    }

