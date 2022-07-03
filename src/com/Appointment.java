package com;

import java.util.ArrayList;



public class Appointment extends Actions {
    protected static int id;
    private static final ArrayList<Integer> appointmentId = new ArrayList<>(); //id записей
    private static final ArrayList<String> appointmentPatients = new ArrayList<>(); // пациенты на запись
    private static final ArrayList<String> appointmentNamePet = new ArrayList<>(); //кличка питомца на запись
    private static final ArrayList<String> appointmentTypePet = new ArrayList<>(); //вид питомца на запись
    private static final ArrayList<String> appointmentDoctors = new ArrayList<>(); //доктора на запись
    private static final ArrayList<String> appointmentTime = new ArrayList<>(); //время записи
    private static final ArrayList<String> appointmentDate = new ArrayList<>(); //дата записи
    protected static final ArrayList<String> status = new ArrayList<>(); //статусы записи

    public static void setAppointments() { //метод для добавления нового приема пациента к врачу
        System.out.println("Список зарегистрированных пациентов: ");
        Patients.getPatients();
        System.out.println("Выберите владельца и его питомца из списка");
        System.out.print("Введите id для записи: ");
        int number = s.nextInt();
        System.out.println("Список докторов: ");
        Doctors.getDoctors();
        System.out.print("Введите id доктора для записи: ");
        int id = s.nextInt();
        System.out.print("Введите дату записи на прием в формате \"dd-MM\": ");
        String date = s.nextLine();
        date = s.nextLine();
        System.out.print("Введите время записи на прием в формате \"HH:mm\": ");
        String time = s.nextLine();
        if (number + 1 > patients.size()) { //метод для защиты от ошибки при вводе числа больше размера массива, не нашел способа написать это в одну строку, но скорее всего такой есть)
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else if (id + 1 > doctors.size()) {
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            appointmentPatients.add(patients.get(number));
            appointmentNamePet.add(namePet.get(number));
            appointmentTypePet.add(typePet.get(number));
            appointmentDoctors.add(doctors.get(id));
            appointmentDate.add(date);
            appointmentTime.add(time);
            status.add("Новый");
            int idAppointments = appointmentDoctors.size();
            appointmentId.add(idAppointments - 1);
            System.out.println("Вы добавили запись владельца " + patients.get(number) + " и его питомца " + namePet.get(number) + " к врачу " + doctors.get(id));
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
            System.out.println("Вы удаляете прием владельца " + appointmentPatients.get(number) + " и его питомца " + appointmentNamePet.get(number));
            appointmentId.remove(number);
            appointmentPatients.remove(number);
            appointmentNamePet.remove(number);
            appointmentTypePet.remove(number);
            appointmentDoctors.remove(number);
            appointmentDate.remove(number);
            appointmentTime.remove(number);
            status.remove(number);
            for (int i = number; i < appointmentId.size(); i++) { //цикл для смещения id на единицу, чтобы не ломать последовательность
                appointmentId.set(i, appointmentId.get(i) - 1);
            }
        }

    }

    public static void getAppointments() { //метод для получения списка приемов пациентов к врачам
        if (appointmentDoctors.isEmpty()) {
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            for (int i = 0; i < appointmentPatients.size(); i++) {
                System.out.print("ID приема: " + appointmentId.get(i));
                System.out.print(" Владелец: " + appointmentPatients.get(i));
                System.out.print(" Кличка питомца: " + appointmentNamePet.get(i));
                System.out.print(" Вид питомца: " + appointmentTypePet.get(i));
                System.out.print(" Доктор: " + appointmentDoctors.get(i));
                System.out.print(" Дата приема: " + appointmentDate.get(i));
                System.out.print(" Время приема: " + appointmentTime.get(i));
                System.out.print(" Статус приема: " + status.get(i) + "\n");
            }
        }
    }
}



