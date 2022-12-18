/** Реализовать консольное приложение, которое:
 * 1.Принимает от пользователя строку вида text~num
 * 2.Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * 3.Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

package org.example;

import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        ex1();
    }
    private static void ex1 () {
            Scanner in = new Scanner(System.in);
            List<String> wordsList = new ArrayList<>();
            Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");
            int num = 0;

            while (true) {
                System.out.println();
                System.out.print("Введите строку: ");
                String inputString = in.nextLine();

                if (inputString.length() == 0) {
                    System.out.println("Строка не должна быть пустой");
                    continue;
                }

                if (inputString.equals("print~all")) {
                    for (int i = 0; i < wordsList.size(); i++) {
                        System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
                    }
                } else if (inputString.equals("stop")) {
                    System.exit(0);
                }

                if (inputString.contains("\\~")) {
                    System.out.println("Строка не содержит тильду");
                    continue;
                }

                String[] parts = inputString.split("\\~");
                String word = parts[0];
                try {
                    num = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Выражение не содержит числа");
                    continue;
                }

                if (num <= 0 || num > wordsList.size() + 1) {
                    System.out.println("Число должно быть в пределах списка от 1 до " + (wordsList.size() + 1));
                    continue;
                }

                if (word.equals("print")) {
                    System.out.printf("Под номером %d находится слово: %s%n", num, wordsList.get(num - 1));
                } else if (num == wordsList.size() + 1) {
                    wordsList.add(word);
                    System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
                } else {
                    String oldWord = wordsList.get(num - 1);
                    wordsList.set(num - 1, word);
                    System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
                }

            }

        }
    }

