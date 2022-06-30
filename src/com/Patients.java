package com;

import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Actions { //добавить изменение фио или хотя бы всего сразу

    private static ArrayList<String> idPatients = new ArrayList<>();
    private static ArrayList<String> patients = new ArrayList<>();
    private static ArrayList<String> datePatients = new ArrayList<>();


    public static void setPatients() { //добавление пациентов
        System.out.print("Напишите id пациента для добавления: ");
        String id = s.nextLine();
        System.out.print("Напишите фио пациента для добавления: ");
        String name = s.nextLine();
        getDate();
        idPatients.add(id);
        patients.add(name);
        datePatients.add(getDate());
    }

    public static void removePatients() {//удаление пациентов
        getPatients();
        System.out.println("Напишите номер пациента, фио которого хотите удалить: ");
        int number = s.nextInt();
        System.out.println("Вы удаляете пациента: " + patients.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
    }


    public static void getPatients() { //выводит массив с пациентами

        System.out.print("ID: " + idPatients);
        System.out.print(" Initials: " + patients);
        System.out.print(" Date of registration: " + datePatients + "\n");
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void changePatients() {
        System.out.print("Напишите номер пациента по списку: ");
        int number = s.nextInt();

    }


}
