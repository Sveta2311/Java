/** Напишите метод, который вернет содержимое текущей папки в виде массива строк.
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
 */

package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program6 {

        static Logger logger = Logger.getLogger("Program6");

        public static void main(String[] args) {

            printIntoFileNames("C:\\Users\\Shark\\Desktop\\материалы по урокам");

            System.out.println("результат работы: " + test());
        }

        private static boolean test() {
            return true;
        }

        private static String buildString(char c1, char c2, int length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i % 2 == 0) {
                    sb.append(c1);
                } else {
                    sb.append(c2);
                }
            }
            return sb.toString();
        }

        private static String buildString() {
            return buildString('F', '_', 10);
        }

        private static String doSimpleString(String str) {
            //empty() - "" - true
            //"" != null - true
            //"     " - isBlank()
            //"     hello       " -> "hello" -> trim()
//        if (str.isBlank()) {
            if (str.trim().length() == 0) {
                return "";
            }

            int counter = 1;
            StringBuilder sb = new StringBuilder();
            char prev = str.charAt(0);
            char curr = str.charAt(0);

            for (int i = 1; i < str.length(); i++) {
                curr = str.charAt(i);
                prev = str.charAt(i - 1);

                if (curr != prev) {
                    sb.append(prev);
                    sb.append((counter > 1) ? counter : "");
                    counter = 0;
                }

                counter++;
            }
            if (counter != 0) {
                sb.append(curr);
                sb.append((counter > 1) ? counter : "");
            }

            return sb.toString();
        }

        private static void printIntoFileNames(String path) {
            StringBuilder sb = new StringBuilder();
            logger.setLevel(Level.ALL);
            Handler handler = new ConsoleHandler();
            handler.setLevel(Level.ALL);
            logger.addHandler(handler);

            String[] names = convertPathToNamesArr(path);
            if (names == null) {
                try {
                    throw new RuntimeException("Текущая директория не содержит значимых файлов или не является " + "директорией");
                } catch (RuntimeException e) {
                    logger.severe(e.getMessage());
                }
                return;
            }

            for (String name : names) {
                sb.append(name).append(System.lineSeparator());
            }

            try (PrintWriter pw = new PrintWriter("src/main/resources/files/dir_files.txt")) {
                pw.print(sb.toString());
            } catch (FileNotFoundException e) {
                logger.severe("File not fount: " + e.getMessage());
                System.out.println(e.getMessage());
            }

        }

        private static String[] convertPathToNamesArr(String path) {
            File file = new File(path);
            return file.list();
        }
    }



