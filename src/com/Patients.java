package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Actions {

    private static final ArrayList<Integer> idPatients = new ArrayList<>(); //id пациентов
    private static final ArrayList<String> datePatients = new ArrayList<>(); //дата регистрации

    public static void setPatients() { //добавление пациентов
        System.out.print("Напишите ФИО владельца для добавления: ");
        String name = s.nextLine();
        System.out.print("Напишите кличку вашего питомца: ");
        String pet = s.nextLine();
        System.out.print("Напишите вид вашего питомца (собака, кошка и т.д.): ");
        String type = s.nextLine();
        getDate();
        patients.add(name);
        namePet.add(pet);
        typePet.add(type);
        int id = patients.size(); //Вроде есть еще lastIndexOf метод, но с ним не получилось
        idPatients.add(id - 1); // можно было оставить и в функциях с удалением и тд сделать плюс один, но решил оставить так, с 0
        datePatients.add(getDate());
        System.out.println("Вы добавили владельца " + name + " и его питомца: " + pet);
    }

    public static void removePatients() {//удаление пациентов
        getPatients(); //вывод пациентов
        System.out.print("Напишите id владельца, которого хотите удалить: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()) { //метод для защиты от ошибки при вводе числа больше размера массива
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
        System.out.println("Вы удаляете владельца " + patients.get(number) + " и его питомца: " + namePet.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
        namePet.remove(number);
        typePet.remove(number);
        for(int i = number; i < idPatients.size(); i++ ) { //цикл для смещения id на единицу, чтобы не ломать последовательность
            idPatients.set(i, idPatients.get(i) - 1);
        }
        }
    }


    public static void getPatients() { //выводит массив с пациентами
//        if (idPatients.isEmpty()) {
//            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");   // хотел сюда добавить вот такую проверку на пустоту таблицы, но она конфиликтует с методом
//        } else {                                                                       // getDate() и я не смог понять почему, но это я реализовал только в Doctors
        for(int i = 0; i < idPatients.size(); i++) { //перебор массивов и вывод данных построчно друг за другом, так сделал для красоты вывода и чтобы не было скобок
            System.out.print("ID: " + idPatients.get(i));
            System.out.print(" ФИО владельца: " + patients.get(i));
            System.out.print(" Кличка питомца: " + namePet.get(i));
            System.out.print(" Вид питомца: " + typePet.get(i));
            System.out.print(" Дата регистрации: " + datePatients.get(i) + "\n");
        }
    }

    public static String getDate() { //метод для получения сегодняшней даты в нужном формате
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }


    public static void changePatients() { //изменение фио пациента
        getPatients();
        System.out.print("Напишите номер пациента по id, фио владельца которого хотите изменить: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()){ //метод для защиты от ошибки при вводе числа больше размера массива
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            System.out.println("Вы изменяете владельца: " + patients.get(number));
            System.out.print("Напишите новое фио владельца: ");
            String name = s.nextLine();
            name = s.nextLine();
            patients.set(number, name);
        }
    }


}
