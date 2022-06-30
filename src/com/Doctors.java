package com;

import java.util.ArrayList;

public class Doctors extends Actions{ //заприватить переменные

    public static void setDoctors() { //добавление докторов
        System.out.print("Напишите ФИО врача для добавления: ");
        String name = s.nextLine();
        doctors.add(name);
    }

    public static void getDoctors() { //вывод докторов
        if (doctors.isEmpty()) {
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            System.out.println("Список докторов:");
            System.out.println(doctors);
        }
    }

    public static void changeDoctors() { //изменение докторов
        if (doctors.isEmpty()) {
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            getDoctors();
            System.out.print("Напишите номер доктора по списку, начиная с 0, фио которого хотите изменить: ");
            int number = s.nextInt();
            System.out.println("Вы изменяете врача: " + doctors.get(number));
            System.out.print("Напишите новое фио доктора: ");
            String name = s.nextLine();
            name = s.nextLine();
            doctors.set(number, name);
        }
    }

    public static void removeDoctors() { //удаление докторов
        if (doctors.isEmpty()) {
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            getDoctors();
        System.out.println("Напишите номер доктора, фио которого хотите удалить: ");
        int number = s.nextInt();
        System.out.println("Вы удаляете фио: " + doctors.get(number));
        doctors.remove(number); }
    }

    }




