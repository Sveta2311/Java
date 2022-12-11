/** Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class Home13 {
    static Logger logger = Logger.getLogger("Home13");

    public static void main(String[] args) {
        GetLine();
        PrintIntoFile();
    }

    private static String GetLine() {
        System.out.print("Введите слово (например, TEST): ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(word+' ');
        }
        System.out.printf(sb.toString());
        return sb.toString();
    }
    private static void PrintIntoFile() {
            try (PrintWriter pw = new PrintWriter("src/main/resources/files/test.txt")) {
                String line = GetLine();
                pw.print(line);
            }
            catch (FileNotFoundException e){
                logger.warning("Файл не найден: " + e.getMessage());
            }
        }
    }