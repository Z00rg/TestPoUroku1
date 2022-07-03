package com;

import java.util.ArrayList;



public class Appointment extends Actions {
    protected static int id;
    private static final ArrayList<Integer> appointmentId = new ArrayList<>(); //id �������
    private static final ArrayList<String> appointmentPatients = new ArrayList<>(); // �������� �� ������
    private static final ArrayList<String> appointmentNamePet = new ArrayList<>(); //������ ������� �� ������
    private static final ArrayList<String> appointmentTypePet = new ArrayList<>(); //��� ������� �� ������
    private static final ArrayList<String> appointmentDoctors = new ArrayList<>(); //������� �� ������
    private static final ArrayList<String> appointmentTime = new ArrayList<>(); //����� ������
    private static final ArrayList<String> appointmentDate = new ArrayList<>(); //���� ������
    protected static final ArrayList<String> status = new ArrayList<>(); //������� ������

    public static void setAppointments() { //����� ��� ���������� ������ ������ �������� � �����
        System.out.println("������ ������������������ ���������: ");
        Patients.getPatients();
        System.out.println("�������� ��������� � ��� ������� �� ������");
        System.out.print("������� id ��� ������: ");
        int number = s.nextInt();
        System.out.println("������ ��������: ");
        Doctors.getDoctors();
        System.out.print("������� id ������� ��� ������: ");
        int id = s.nextInt();
        System.out.print("������� ���� ������ �� ����� � ������� \"dd-MM\": ");
        String date = s.nextLine();
        date = s.nextLine();
        System.out.print("������� ����� ������ �� ����� � ������� \"HH:mm\": ");
        String time = s.nextLine();
        if (number + 1 > patients.size()) { //����� ��� ������ �� ������ ��� ����� ����� ������ ������� �������, �� ����� ������� �������� ��� � ���� ������, �� ������ ����� ����� ����)
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else if (id + 1 > doctors.size()) {
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
            appointmentPatients.add(patients.get(number));
            appointmentNamePet.add(namePet.get(number));
            appointmentTypePet.add(typePet.get(number));
            appointmentDoctors.add(doctors.get(id));
            appointmentDate.add(date);
            appointmentTime.add(time);
            status.add("�����");
            int idAppointments = appointmentDoctors.size();
            appointmentId.add(idAppointments - 1);
            System.out.println("�� �������� ������ ��������� " + patients.get(number) + " � ��� ������� " + namePet.get(number) + " � ����� " + doctors.get(id));
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
            System.out.println("�� �������� ����� ��������� " + appointmentPatients.get(number) + " � ��� ������� " + appointmentNamePet.get(number));
            appointmentId.remove(number);
            appointmentPatients.remove(number);
            appointmentNamePet.remove(number);
            appointmentTypePet.remove(number);
            appointmentDoctors.remove(number);
            appointmentDate.remove(number);
            appointmentTime.remove(number);
            status.remove(number);
            for (int i = number; i < appointmentId.size(); i++) { //���� ��� �������� id �� �������, ����� �� ������ ������������������
                appointmentId.set(i, appointmentId.get(i) - 1);
            }
        }

    }

    public static void getAppointments() { //����� ��� ��������� ������ ������� ��������� � ������
        if (appointmentDoctors.isEmpty()) {
            System.out.println("������� ������, ������� �������� ������ � �������");
        } else {
            for (int i = 0; i < appointmentPatients.size(); i++) {
                System.out.print("ID ������: " + appointmentId.get(i));
                System.out.print(" ��������: " + appointmentPatients.get(i));
                System.out.print(" ������ �������: " + appointmentNamePet.get(i));
                System.out.print(" ��� �������: " + appointmentTypePet.get(i));
                System.out.print(" ������: " + appointmentDoctors.get(i));
                System.out.print(" ���� ������: " + appointmentDate.get(i));
                System.out.print(" ����� ������: " + appointmentTime.get(i));
                System.out.print(" ������ ������: " + status.get(i) + "\n");
            }
        }
    }
}



