package com;


import java.util.ArrayList;
import java.util.Scanner;

public class Actions {


    protected static final ArrayList<String> patients = new ArrayList<>();
    protected static final ArrayList<String> doctors = new ArrayList<>();
    protected static Scanner s = new Scanner(System.in);

     public Actions() {
         System.out.println("Напишите help для получения списка доступных команд");
         setCommand();

     }

     public void setCommand() {
         System.out.print("Напишите команду: ");
         String command = s.nextLine();

             switch (command) {
                 case ("help"): // вызов хелп листа
                     helpList();
                     setCommand();
                 case ("1"): //добавление пациента
                     Patients.setPatients();
                     setCommand();
                 case ("2")://вывод массива пациентов
                     Patients.getPatients();
                     setCommand();
                 case ("3")://удаление пациента
                     Patients.removePatients();
                     setCommand();
                 case ("4")://смена фио пациента
                     Patients.changePatients();
                     setCommand();
                 case ("5"): //вывод массива с докторами
                     Doctors.getDoctors();
                     setCommand();
                 case ("6"): //добавление доктора
                     Doctors.setDoctors();
                     setCommand();
                 case ("7"): //изменение фио доктора
                     Doctors.changeDoctors();
                     setCommand();
                 case ("8"): //удаление фио доктора
                     Doctors.removeDoctors();
                     setCommand();
                 case ("9"): //добавление приема
                     Appointment.setAppointments();
                     setCommand();
                 case ("10"): //выдача всех приемов
                     Appointment.getAppointments();
                     setCommand();
                 case ("11"): //изменение статуса приема
                     Appointment.changeAppointments();
                     setCommand();
                 case ("12"): //удаление приема
                     Appointment.removeAppointments();
                     setCommand();
                 case ("exit"):
                     System.out.println("Exiting program...");
                     System.exit(0);
                 default:
                     System.out.println("Вы ввели неправильную команду");
                     setCommand();
             }


     }


     public void helpList() {
         System.out.println("Для добавления нового пациента: 1");
         System.out.println("Для вывода списка пациентов: 2");
         System.out.println("Для удаления пациентов: 3");
         System.out.println("Для смены фио пациентов: 4");
         System.out.println("Для вывода списка докторов: 5");
         System.out.println("Для добавления нового доктора: 6");
         System.out.println("Для изменения докторов: 7");
         System.out.println("Для удаления докторов: 8");
         System.out.println("Для добавления нового приема: 9");
         System.out.println("Для вывода списка приемов: 10");
         System.out.println("Для изменение статуса приема: 11");
         System.out.println("Для удаления приема: 12");
         System.out.println("Закончить работу: exit");

     }



}
