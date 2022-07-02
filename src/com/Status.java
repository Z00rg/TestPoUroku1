package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Status extends Appointment { //класс для выбора статуса

    protected static Scanner s = new Scanner(System.in);
    private static final ArrayList<Integer> idStatus = new ArrayList<>();
    private static final ArrayList<String> typeStatus = new ArrayList<>();

    private static void setStatus() { // поставновка статусов
        typeStatus.add("Новый");
        typeStatus.add("В процессе");
        typeStatus.add("Отменен");
        typeStatus.add("Ожидает оплаты");
        typeStatus.add("Завершен");
        for(int i = 0; i < typeStatus.size(); i++){
            idStatus.add(i);
        }
    }

    private static void getStatus() { //метод выдачи статусов с проверкой на пустоту и использованием метода добавления
        if(idStatus.isEmpty()) {
            setStatus();
            for (int i = 0; i < idStatus.size(); i++) {
                System.out.print("ID статуса: " + idStatus.get(i));
                System.out.print(" Вид статуса: " + typeStatus.get(i) + "\n");
            }
        } else {
            for (int i = 0; i < idStatus.size(); i++) {
                System.out.print("ID статуса: " + idStatus.get(i));
                System.out.print(" Вид статуса: " + typeStatus.get(i) + "\n");
            }
        }
    }

    public static void choiceStatus() { //функция выбора статуса и поставновки его в нужный прием по id из класса Appointments
        getStatus();
        System.out.print("Выберете новый статус по ID: ");
        int number = s.nextInt();
        if(number + 1 > typeStatus.size()){ //метод для защиты от ошибки при вводе числа больше размера массива
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            status.set(id, typeStatus.get(number));
        }
    }
}
