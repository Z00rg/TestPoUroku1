package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Actions {


    protected static ArrayList<String> patients = new ArrayList<>();
    protected static ArrayList<String> doctors = new ArrayList<>();
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
                     break;
                 case ("1"): //добавление пациента
                     Patients.setPatients();
                     setCommand();
                     break;
                 case ("2")://вывод массива пациентов
                     Patients.getPatients();
                     setCommand();
                     break;
                 case ("3")://удаление пациента
                     Patients.removePatients();
                     setCommand();
                     break;
                 case ("4")://смена фио пациента
                     Patients.changePatients();
                     setCommand();
                     break;
                 case ("6"): //добавление доктора
                     Doctors.setDoctors();
                     setCommand();
                     break;
                 case ("5"): //вывод массива с докторами
                     Doctors.getDoctors();
                     setCommand();
                     break;
                 case ("7"): //изменение фио доктора
                     Doctors.changeDoctors();
                     setCommand();
                     break;
                 case ("8"): //удаление фио доктора
                     Doctors.removeDoctors();
                     setCommand();
                     break;
                 case ("actionAppointment"): //место под операции с записями
                     System.out.println("Тут будет список и действия с записями");
                     break;
                 case ("exit"):
                     System.out.println("Exiting program...");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Вы ввели неправильную команду");
                     setCommand();
             }


     }


     public void helpList() {
         System.out.println("Для добавления пациентов: 1");
         System.out.println("Для вывода списка пациентов: 2");
         System.out.println("Для удаления пациентов: 3");
         System.out.println("Для смены фио пациентов: 4");
         System.out.println("Для вывода списка докторов: 5");
         System.out.println("Для добавления докторов: 6");
         System.out.println("Для изменения докторов: 7");
         System.out.println("Для удаления докторов: 8");
         System.out.println("Работа с записями на прием: actionAppointment");
         System.out.println("Закончить работу: exit");

     }

     public void actionAdd() {
         //сюда написать метод для переписывания в классы дети, действия по таблицам
     }

     public void setDate() {
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         Date date = new Date();
         System.out.println(dateFormat.format(date));
     }
}
