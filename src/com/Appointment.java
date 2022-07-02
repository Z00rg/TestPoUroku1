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

    public static void setAppointments() { //����� ��� ���������� ������ ������ �������� � �����
        System.out.println("������ ������������������ ���������: ");
        Patients.getPatients();
        System.out.print("������� id �������� ��� ������: ");
        int number = s.nextInt();
        System.out.println("������ ��������: ");
        Doctors.getDoctors();
        System.out.print("������� id ������� ��� ������: ");
        int id = s.nextInt();
        System.out.print("������� ����� ������ �� ����� � ������� \"dd-MM HH:mm\": ");
        String timeDate = s.nextLine();
        timeDate = s.nextLine();
        if (number + 1 > patients.size()) { //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������, �� ����� ������� �������� ��� � ���� ������, �� ������ ����� ����� ����)
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else if (id + 1 > doctors.size()) {
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
            appointmentPatients.add(Patients.patients.get(number));
            appointmentDoctors.add(Doctors.doctors.get(id));
            time.add(timeDate);
            status.add("�����");
            int idAppointments = appointmentDoctors.size();
            appointmentId.add(idAppointments - 1);
            System.out.println("�� �������� ������ �������� ������� �������� ������ �� �����");
        }
    }

    public static void changeAppointments() {
        getAppointments();
        System.out.print("�������� ID ������, ������ �������� ������ ��������: ");
        id = s.nextInt();
        if(id + 1 > appointmentId.size()){ //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
            System.out.println("������ ������ ������: " + status.get(id));
            Status.choiceStatus();
        }
    }

    public static void removeAppointments() { //����� �������� ������
        getAppointments();
        System.out.print("�������� ID ������ ������� ������ �������: ");
        int number = s.nextInt();
        if (number + 1 > appointmentId.size()) { //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
            System.out.println("�� �������� ����� ��������: " + appointmentPatients.get(number));
            appointmentId.remove(number);
            appointmentPatients.remove(number);
            appointmentDoctors.remove(number);
            time.remove(number);
            status.remove(number);
            for (int i = number; i < appointmentId.size(); i++) { //���� ��� �������� id �� �������, ����� �� ������ ������������������
                appointmentId.set(i, appointmentId.get(i) - 1);
            }
        }

    }

    public static String getAppointments() { //����� ��� ��������� ������ ������� ��������� � ������
        if (appointmentDoctors.isEmpty()) {
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            for (int i = 0; i < appointmentPatients.size(); i++) {
                System.out.print("ID ������: " + appointmentId.get(i));
                System.out.print(" �������: " + appointmentPatients.get(i));
                System.out.print(" ������: " + appointmentDoctors.get(i));
                System.out.print(" ����� ������: " + time.get(i));
                System.out.print(" ������ ������: " + status.get(i) + "\n");
            }
        }

        return("����� ������");

    }
}



