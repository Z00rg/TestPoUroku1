package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Patients extends Actions {

    private static final ArrayList<Integer> idPatients = new ArrayList<>();
    private static final ArrayList<String> datePatients = new ArrayList<>();

    public static void setPatients() { //���������� ���������
        System.out.print("�������� ��� �������� ��� ����������: ");
        String name = s.nextLine();
        getDate();
        patients.add(name);
        int id = patients.size(); //����� ���� ��� lastIndexOf �����, �� � ��� �� ����������
        idPatients.add(id - 1); // ����� ���� �������� � � �������� � ��������� � �� ������� ���� ����, �� ����� �������� ���, � 0
        datePatients.add(getDate());
        System.out.println("�� �������� ��������: " + name);
    }

    public static void removePatients() {//�������� ���������
        getPatients(); //����� ���������
        System.out.print("�������� id ��������, ��� �������� ������ �������: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()) { //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
        System.out.println("�� �������� ��������: " + patients.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
        for(int i = number; i < idPatients.size(); i++ ) { //���� ��� �������� id �� �������, ����� �� ������ ������������������
            idPatients.set(i, idPatients.get(i) - 1);
        }
        }
    }


    public static String getPatients() { //������� ������ � ����������
//        if (idPatients.isEmpty()) {
//            System.out.println("������� ������, ������� �������� ������ � �������");   // ����� ���� �������� ��� ����� �������� �� ������� �������, �� ��� ������������ � �������
//        } else {                                                                       // getDate() � � �� ���� ������ ������, �� ��� � ���������� ������ � Doctors
        for(int i = 0; i < idPatients.size(); i++) { //������� �������� � ����� ������ ��������� ���� �� ������, ��� ������ ��� ������� ������ � ����� �� ���� ������
            System.out.print("ID: " + idPatients.get(i));
            System.out.print(" ���: " + patients.get(i));
            System.out.print(" ���� �����������: " + datePatients.get(i) + "\n");
        }
        return("");
    }

    public static String getDate() { //����� ��� ��������� ����������� ���� � ������ �������
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }


    public static void changePatients() { //��������� ��� ��������
        getPatients();
        System.out.print("�������� ����� �������� �� id, ��� �������� ������ ��������: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()){ //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
            System.out.println("�� ��������� ��������: " + patients.get(number));
            System.out.print("�������� ����� ��� ��������: ");
            String name = s.nextLine();
            name = s.nextLine();
            patients.set(number, name);
        }
    }




}
