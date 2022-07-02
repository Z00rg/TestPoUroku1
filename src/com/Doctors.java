package com;

import java.util.ArrayList;

public class Doctors extends Actions{

    private static final ArrayList<Integer> idDoctors = new ArrayList<>();

    public static void setDoctors() { //���������� ��������
        System.out.print("�������� ��� ����� ��� ����������: ");
        String name = s.nextLine();
        doctors.add(name);
        int id = doctors.size(); //����, ��� ����� ���� lastIndexOf �����, �� � ��� �� ����������
        idDoctors.add(id - 1); // ����� ���� �������� � � �������� � ��������� � �� ������� ���� ����, �� ����� �������� ���, � 0
        System.out.println("�� �������� �������: " + name);
    }

    public static String getDoctors() { //����� ��������
        if (doctors.isEmpty()) { //�������� �� ������� �������
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            for(int i = 0; i < doctors.size(); i++) {
                System.out.print("ID: " + idDoctors.get(i));
                System.out.print(" Initials: " + doctors.get(i) + "\n");
            }
        }
        return("����� ������");
    }

    public static void changeDoctors() { //��������� �������� �� ���� ����� ��� ����� ������������ � ����������, �� � ��� ������)
        if (doctors.isEmpty()) { //�������� �� ������� �������
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            getDoctors();
            System.out.print("�������� id ������� �� ������, ��� �������� ������ ��������: ");
            int number = s.nextInt();
            if(number + 1 > idDoctors.size()){ //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������
                System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
            } else {
                System.out.println("�� ��������� �����: " + doctors.get(number));
                System.out.print("�������� ����� ��� �������: ");
                String name = s.nextLine();
                name = s.nextLine();
                doctors.set(number, name);
            }
        }
    }

    public static void removeDoctors() { //�������� ��������
        if (doctors.isEmpty()) { //�������� �� ������� �������
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            getDoctors();
        System.out.print("�������� id �������, ��� �������� ������ �������: ");
        int number = s.nextInt();
            if(number + 1 > idDoctors.size()){ //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������
                System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
            } else {
        System.out.println("�� �������� ���: " + doctors.get(number));
        doctors.remove(number);
        idDoctors.remove(number);
        for(int i = number; i < idDoctors.size(); i++) {
            idDoctors.set(i, idDoctors.get(i) - 1);
        }
        }
        }
    }

    }




