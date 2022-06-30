package com;

import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Actions { //�������� ��������� ��� ��� ���� �� ����� �����

    private static ArrayList<String> idPatients = new ArrayList<>();
    private static ArrayList<String> patients = new ArrayList<>();
    private static ArrayList<String> datePatients = new ArrayList<>();


    public static void setPatients() { //���������� ���������
        System.out.print("�������� id �������� ��� ����������: ");
        String id = s.nextLine();
        System.out.print("�������� ��� �������� ��� ����������: ");
        String name = s.nextLine();
        getDate();
        idPatients.add(id);
        patients.add(name);
        datePatients.add(getDate());
    }

    public static void removePatients() {//�������� ���������
        getPatients();
        System.out.println("�������� ����� ��������, ��� �������� ������ �������: ");
        int number = s.nextInt();
        System.out.println("�� �������� ��������: " + patients.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
    }


    public static void getPatients() { //������� ������ � ����������

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
        System.out.print("�������� ����� �������� �� ������: ");
        int number = s.nextInt();

    }


}
