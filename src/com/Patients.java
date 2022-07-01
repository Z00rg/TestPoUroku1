package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Actions {

    private static final ArrayList<Integer> idPatients = new ArrayList<>();
    private static final ArrayList<String> datePatients = new ArrayList<>();

    public static void setPatients() { //добавление пациентов
        System.out.print("Ќапишите ‘»ќ пациента дл€ добавлени€: ");
        String name = s.nextLine();
        getDate();
        patients.add(name);
        int id = patients.size(); //¬роде есть еще lastIndexOf метод, но с ним не получилось
        idPatients.add(id - 1); // можно было оставить и в функци€х с удалением и тд сделать плюс один, но решил оставить так, с 0
        datePatients.add(getDate());
        System.out.println("¬ы добавили пациента: " + name);
    }

    public static void removePatients() {//удаление пациентов
        getPatients(); //вывод пациентов
        System.out.print("Ќапишите id пациента, фио которого хотите удалить: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()) { //метод дл€ защиты от ошибки при вводе числа больше размера массива
            System.out.println("¬ы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
        System.out.println("¬ы удал€ете пациента: " + patients.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
        for(int i = number; i < idPatients.size(); i++ ) { //цикл дл€ смещени€ id на единицу, чтобы не ломать последовательность
            idPatients.set(i, idPatients.get(i) - 1);
        }
        }
    }


    public static String getPatients() { //выводит массив с пациентами
//        if (idPatients.isEmpty()) {
//            System.out.println("“аблица пуста€, сначала добавьте данные в таблицу");   // хотел сюда добавить вот такую проверку на пустоту таблицы, но она конфиликтует с методом
//        } else {                                                                       // getDate() и € не смог пон€ть почему, но это € реализовал только в Doctors
        for(int i = 0; i < idPatients.size(); i++) { //перебор массивов и вывод данных построчно друг за другом, так сделал дл€ красоты вывода и чтобы не было скобок
            System.out.print("ID: " + idPatients.get(i));
            System.out.print(" ‘»ќ: " + patients.get(i));
            System.out.print(" ƒата регистрации: " + datePatients.get(i) + "\n");
        }
        return("");
    }

    public static String getDate() { //метод дл€ получени€ сегодн€шней даты в нужном формате
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }


    public static void changePatients() { //изменение фио пациента
        getPatients();
        System.out.print("Ќапишите номер пациента по id, фио которого хотите изменить: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()){ //метод дл€ защиты от ошибки при вводе числа больше размера массива
            System.out.println("¬ы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            System.out.println("¬ы измен€ете пациента: " + patients.get(number));
            System.out.print("Ќапишите новое фио пациента: ");
            String name = s.nextLine();
            name = s.nextLine();
            patients.set(number, name);
        }
    }




}
