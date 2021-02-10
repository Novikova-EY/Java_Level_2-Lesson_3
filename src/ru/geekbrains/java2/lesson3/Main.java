package ru.geekbrains.java2.lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] array = {"апельсин", "яблоко", "лимон", "апельсин",
                "груша", "лимон", "апельсин", "груша", "апельсин", "Апельсин",
                "груша", "апельсин", "авокадо", "апельсин", "яблоко", "апельсин"}; // Исходный массив для задания №1
        doTask1(array); // Реализация решения задания №1

        PhoneBook phoneArray = new PhoneBook(); // Исходные данные для задания №2
        phoneArray.addNew("Иванов", "8(925) 111-11-11");
        phoneArray.addNew("Петров", "8(925) 222-22-22");
        phoneArray.addNew("Васечкин", "8(925) 333-33-33");
        phoneArray.addNew("Иванов", "8(925) 444-44-44");
        phoneArray.addNew("Петров", "8(925) 555-55-55");

        phoneArray.doTask2("Иванов"); // Реализация решения задания №2
    }

    /** Решение задания №1 */
    private static void doTask1(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));// создаем коллекцию из массива
        HashSet<String> arrayUnique = new HashSet(arrayList); // создаем коллекцию уникальных значений
        ArrayList<String> arrayUniqueToCompare = new ArrayList(arrayList); //переводим коллекцию уникальных значений к типу ArrayList для последующего сравнения
        Map<String, Integer> countArray = new HashMap<>(); // создаем коллекцию, куда будем помещать пару - уникальное значение/кол-во

        for (int i = 0; i < arrayUniqueToCompare.size(); i++) {
            int count = Collections.frequency(arrayList, arrayUniqueToCompare.get(i));
            countArray.put(arrayUniqueToCompare.get(i), count);
        }

        System.out.println("Исходный массив" + arrayList);
        System.out.println("Массив уникальных значений" + arrayUnique);
        System.out.println("Массив частоты упоминаний уникальных значений" + countArray);
    }
}
