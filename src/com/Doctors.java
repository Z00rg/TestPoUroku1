package com;

import java.util.ArrayList;

public class Doctors extends Actions{ //����������� ����������

    public static void setDoctors() { //���������� ��������
        System.out.print("�������� ��� ����� ��� ����������: ");
        String name = s.nextLine();
        doctors.add(name);
    }

    public static void getDoctors() { //����� ��������
        if (doctors.isEmpty()) {
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            System.out.println("������ ��������:");
            System.out.println(doctors);
        }
    }

    public static void changeDoctors() { //��������� ��������
        if (doctors.isEmpty()) {
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            getDoctors();
            System.out.print("�������� ����� ������� �� ������, ������� � 0, ��� �������� ������ ��������: ");
            int number = s.nextInt();
            System.out.println("�� ��������� �����: " + doctors.get(number));
            System.out.print("�������� ����� ��� �������: ");
            String name = s.nextLine();
            name = s.nextLine();
            doctors.set(number, name);
        }
    }

    public static void removeDoctors() { //�������� ��������
        if (doctors.isEmpty()) {
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            getDoctors();
        System.out.println("�������� ����� �������, ��� �������� ������ �������: ");
        int number = s.nextInt();
        System.out.println("�� �������� ���: " + doctors.get(number));
        doctors.remove(number); }
    }

    }




