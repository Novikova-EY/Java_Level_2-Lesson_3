package ru.geekbrains.java2.lesson3;

import java.util.*;

public class PhoneBook {

    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>(); //переводим данные массива в HashMap коллекцию

    /** Создаем коллекцию фамилий в привязке к массиву номеров*/
    public void addNew(String name, String phoneNumber) {

        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            HashSet<String> phoneArray = new HashSet<>();
            phoneArray.add(phoneNumber);
            phoneBook.put(name, phoneArray);
        }
    }

    /** Выводим в консоль массив телефонов для искомой фамилии*/
    public void doTask2(String nameToFind){
        if (phoneBook.containsKey(nameToFind)) {
            System.out.println("Номер телефона "+ nameToFind + phoneBook.get(nameToFind));
        } else {
            System.out.println("Такой записи в телефонной книге нет.");
        }
    }
}
