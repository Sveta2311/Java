/** Написать простой класс: ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * Учесть, что под одной фамилией может находиться несколько телефонных номеров.
 Важно: каждый пользователь - уникальный ключ в коллекции. В выбранной Вами коллекции не должно быть повторений имён.
 */

package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Home20 {
    public static Map<String, ArrayList<String>> map = new HashMap<>();
    public static void main(final String[] args) {

        map.put("Андрей",  new ArrayList<>());
        map.get("Андрей").add("+7-911-00-04-99");
        map.get("Андрей").add("+7-911-50-44-77");
        map.get("Андрей").add("+7-911-55-66-77");

        map.put("Евгений",  new ArrayList<>());
        map.get("Евгений").add("+7-921-56-56-09");
        map.get("Евгений").add("+7-911-56-47-36");
        map.get("Евгений").add("+7-950-99-00-09");

        map.put("Светлана",  new ArrayList<>());
        map.get("Светлана").add("+7-906-99-79-11");
        map.get("Светлана").add("+7-907-66-47-76");
        map.get("Светлана").add("+7-907-99-00-44");

        map.put("Елена",  new ArrayList<>());
        map.get("Елена").add("+7-921-87-00-00");
        map.get("Елена").add("+7-902-87-00-00");
        map.get("Елена").add("+7-902-44-11-11");

        map.put("Кристина",  new ArrayList<>());
        map.get("Кристина").add("+7-911-97-34-00");
        map.get("Кристина").add("+7-906-55-55-55");
        map.get("Кристина").add("+7-905-99-00-03");

        String name = "";

        name = getName();
        searchByName(name);
    }

    public static String getName() {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = scanner.nextLine();
        return name;
    }

    public static void searchByName(String name){
        if (map.containsKey(name)) {
            System.out.printf("Ползователь с именем " + name + " найден, список номеров:\n");
            for (var phone : map.get(name)) {
                System.out.printf((String) phone);
                System.out.print("\n");
            }
        }else{
            ArrayList <String> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите Телефон 1: ");
            String phone1 = scanner.nextLine();
            System.out.println("Введите Телефон 2: ");
            String phone2 = scanner.nextLine();
            System.out.println("Введите Телефон 3: ");
            String phone3 = scanner.nextLine();

            list.add(phone1);
            list.add(phone2);
            list.add(phone3);
            map.put(name, list);

            printBook();
        }
    }

    public static void printBook(){
        System.out.print("\n");
        for (Map.Entry<String, ArrayList<String>> item : map.entrySet()) {
                System.out.printf(item.getKey());
                System.out.print("\n");
                for (var phone : item.getValue()) {
                    System.out.printf((String) phone);
                    System.out.print("\n");
                }
                System.out.print("----------------\n");
        }
    }
}