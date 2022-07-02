package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Appointment extends Actions {
    protected static int id;
    private static final ArrayList<Integer> appointmentId = new ArrayList<>();
    private static final ArrayList<String> appointmentPatients = new ArrayList<>();
    private static final ArrayList<String> appointmentDoctors = new ArrayList<>();
    private static final ArrayList<String> time = new ArrayList<>();
    protected static final ArrayList<String> status = new ArrayList<>();

    public static void setAppointments() { //метод для добавления нового приема пациента к врачу
        System.out.println("Список зарегистрированных пациентов: ");
        Patients.getPatients();
        System.out.print("Введите id пациента для записи: ");
        int number = s.nextInt();
        System.out.println("Список докторов: ");
        Doctors.getDoctors();
        System.out.print("Введите id доктора для записи: ");
        int id = s.nextInt();
        System.out.print("Введите время записи на прием в формате \"dd-MM HH:mm\": ");
        String timeDate = s.nextLine();
        timeDate = s.nextLine();
        if (number + 1 > patients.size()) { //метод для защиты от ошибки при вводе числа больше размера массива, не нашел способа написать это в одну строку, но скорее всего такой есть)
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else if (id + 1 > doctors.size()) {
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            appointmentPatients.add(Patients.patients.get(number));
            appointmentDoctors.add(Doctors.doctors.get(id));
            time.add(timeDate);
            status.add("Новый");
            int idAppointments = appointmentDoctors.size();
            appointmentId.add(idAppointments - 1);
            System.out.println("Вы добавили запись пациента успешно добавили запись на прием");
        }
    }

    public static void changeAppointments() {
        getAppointments();
        System.out.print("Напишите ID приема, статус которого хотите изменить: ");
        id = s.nextInt();
        if(id + 1 > appointmentId.size()){ //метод для защиты от ошибки при вводе числа больше размера массива
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            System.out.println("Статус приема сейчас: " + status.get(id));
            Status.choiceStatus();
        }
    }

    public static void removeAppointments() { //метод удаления приема
        getAppointments();
        System.out.print("Напишите ID приема который хотите удалить: ");
        int number = s.nextInt();
        if (number + 1 > appointmentId.size()) { //метод для защиты от ошибки при вводе числа больше размера массива
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            System.out.println("Вы удаляете прием пациента: " + appointmentPatients.get(number));
            appointmentId.remove(number);
            appointmentPatients.remove(number);
            appointmentDoctors.remove(number);
            time.remove(number);
            status.remove(number);
            for (int i = number; i < appointmentId.size(); i++) { //цикл для смещения id на единицу, чтобы не ломать последовательность
                appointmentId.set(i, appointmentId.get(i) - 1);
            }
        }

    }

    public static String getAppointments() { //метод для получения списка приемов пациентов к врачам
        if (appointmentDoctors.isEmpty()) {
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            for (int i = 0; i < appointmentPatients.size(); i++) {
                System.out.print("ID приема: " + appointmentId.get(i));
                System.out.print(" Пациент: " + appointmentPatients.get(i));
                System.out.print(" Доктор: " + appointmentDoctors.get(i));
                System.out.print(" Время приема: " + time.get(i));
                System.out.print(" Статус приема: " + status.get(i) + "\n");
            }
        }

        return("Конец списка");

    }
}



