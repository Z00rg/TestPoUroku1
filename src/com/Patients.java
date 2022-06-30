package com;

import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Actions { //добавить изменение фио или хотя бы всего сразу

    private static ArrayList<Integer> idPatients = new ArrayList<>();
    protected static ArrayList<String> datePatients = new ArrayList<>();

    public static void setPatients() { //добавление пациентов
        System.out.print("Напишите фио пациента для добавления: ");
        String name = s.nextLine();
        getDate();
        patients.add(name);
        int id = patients.size(); //Знаю, что вроде есть lastIndexOf метод, но с ним не получилось
        idPatients.add(id - 1); // можно было оставить и в функциях с удалением и тд сделать плюс один, но решил оставить так, с 0
        datePatients.add(getDate());
    }

    public static void removePatients() {//удаление пациентов
        getPatients(); //вывод пациентов
        System.out.print("Напишите номер пациента, фио которого хотите удалить: ");
        int number = s.nextInt();
        System.out.println("Вы удаляете пациента: " + patients.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
        for(int i = number; i < idPatients.size(); i++ ){ //цикл для смещения id на единицу, чтобы не ломать последовательность
            idPatients.set(i,idPatients.get(i) - 1);
        }
    }


    public static void getPatients() { //выводит массив с пациентами

        for(int i = 0; i < idPatients.size(); i++) { //перебор массивов и вывод данных построчно друг за другом
            System.out.print("ID: " + idPatients.get(i));
            System.out.print(" Initials: " + patients.get(i));
            System.out.print(" Date of registration: " + datePatients.get(i) + "\n");
        }
    }

    public static String getDate() { //метод для получения сегодняшней даты в нужном формате
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }


    public static void changePatients() { //изменение фио пациента
        getPatients();
        System.out.print("Напишите номер пациента по id, фио которого хотите изменить: ");
        int number = s.nextInt();
        System.out.println("Вы изменяете пациента: " + patients.get(number));
        System.out.print("Напишите новое фио пациента: ");
        String name = s.nextLine();
        name = s.nextLine();
        patients.set(number, name);
    }




}
