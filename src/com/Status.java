package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Status extends Appointment {

    protected static Scanner s = new Scanner(System.in);
    private static final ArrayList<Integer> idStatus = new ArrayList<>();
    private static final ArrayList<String> typeStatus = new ArrayList<>();

    private static void setStatus() {
        typeStatus.add("�����");
        typeStatus.add("� ��������");
        typeStatus.add("�������");
        typeStatus.add("������� ������");
        typeStatus.add("��������");
        for(int i = 0; i < typeStatus.size(); i++){
            idStatus.add(i);
        }
    }

    private static void getStatus() {
        if(idStatus.isEmpty()) {
            setStatus();
        } else {
            for (int i = 0; i < idStatus.size(); i++) {
                System.out.print("ID �������: " + idStatus.get(i));
                System.out.print(" ��� �������: " + typeStatus.get(i) + "\n");
            }
        }
    }

    private static void choiceStatus(int number) {
        getStatus();
        System.out.println("�������� ����� ������ �� ID: ");
        number = s.nextInt();
        idStatus.set(id,)
    }
}
