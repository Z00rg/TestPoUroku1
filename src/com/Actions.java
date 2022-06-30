package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Actions {


    protected static Scanner s = new Scanner(System.in);

     public Actions() {
         System.out.println("Напишите help для получения списка доступных команд");
         setCommand();

     }

     public void setCommand() {
         System.out.print("Напишите команду: ");
         String command = s.nextLine();
         for(int i = 0; i < 10; i++) { //написать цикл для вывода списка команд заного
             switch (command) {
                 case ("help"): // вызов хелп листа
                     helpList();
                     setCommand();
                     break;
                 case ("actionSetPatients"): //добавление пациента
                     Patients.setPatients();
                     setCommand();
                     break;
                 case ("actionGetPatients")://вывод массива пациентов
                     Patients.getPatients();
                     setCommand();
                     break;
                 case ("actionRemovePatients")://удаление пациента
                     Patients.removePatients();
                     setCommand();
                     break;
                 case ("actionSetDoctors"): //добавление доктора
                     Doctors.setDoctors();
                     setCommand();
                     break;
                 case ("actionGetDoctors"): //вывод массива с докторами
                     Doctors.getDoctors();
                     setCommand();
                     break;
                 case ("actionChangeDoctors"): //изменение фио доктора
                     Doctors.changeDoctors();
                     setCommand();
                     break;
                 case ("actionRemoveDoctors"): //удаление фио доктора
                     Doctors.removeDoctors();
                     setCommand();
                     break;
                 case ("actionAppointment"): //место под операции с записями
                     System.out.println("Тут будет список и действия с записями");
                     break;
                 case ("exit"):
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Вы ввели неправильную команду");
                     setCommand();
             }
         }

     }


     public void helpList() {
         System.out.println("Для добавления пациентов: actionSetPatients");
         System.out.println("Для вывода списка пациентов: actionGetPatients");
         System.out.println("Для вывода списка пациентов: actionRemovePatients");
         System.out.println("Для добавления докторов: actionSetDoctors");
         System.out.println("Для изменения докторов: actionChangeDoctors");
         System.out.println("Для добавления докторов: actionRemoveDoctors");
         System.out.println("Для вывода списка докторов: actionGetDoctors");
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
