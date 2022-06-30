package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Actions { //�������� ��������� ��� ��� ���� �� ����� �����

    private static ArrayList<String> patients = new ArrayList<>();


    public static void setPatients() { //���������� ���������
        System.out.print("�������� id �������� ��� ����������: ");
        String id = s.nextLine();
        System.out.print("�������� ��� �������� ��� ����������: ");
        String name = s.nextLine();
        getDate();
        patients.add(" " + id + " " + name + " " + getDate() + "\n");
    }

    public static void removePatients() {//�������� ���������
        getPatients();
        System.out.println("�������� ����� ��������, ��� �������� ������ �������: ");
        int number = s.nextInt();
        System.out.println("�� �������� ��������: " + patients.get(number));
        patients.remove(number);
    }


    public static void getPatients() { //������� ������ � ����������
        System.out.println(patients);
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }


}
