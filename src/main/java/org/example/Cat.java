/**1. Продумайте структуру класса Кот.
 * Какие поля и методы будут актуальны для приложения, которое является
 а) информационной системой ветеринарной клиники
 б) архивом выставки котов
 в) информационной системой Театра кошек Ю. Д. Куклачёва
 Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
package org.example;

public class Cat {
    private String name;
    private double weight;
    private int age;
    private String color;
    private String breed;
    private boolean speak; //false

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    public Cat(String name, double weight, int age, String color, String breed) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void run() {
        System.out.println(name + " умеет бегать");
    }

    public void jump() {
        System.out.println(name + " умеет прыгать");
    }

    public void speak() {
        if (speak) {
            System.out.println(name + " орёт громкое МЯУ");
        } else {
            System.out.println("Кот " + name + " вежливо и учтиво мурчит");
        }
    }

    public void printInfo() {
        System.out.printf("У кота %s вес: %s, color: %s, age: %s, breed: %s%n", name, weight, color, age, breed);
    }

    @Override
    public String toString() {
        return String.format("У кота %s вес: %s, color: %s, age: %s, breed: %s", name, weight, color, age, breed);
    }
}




