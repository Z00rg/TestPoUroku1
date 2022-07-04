package com;

import java.util.ArrayList;

public class Id { //класс для создания метода смещения id после удаления
    private static ArrayList<Integer> array = new ArrayList<>();
    private static int number;

    public static void offsetId(ArrayList<Integer> array, int number) {
        setArray(array);
        setNumber(number);
        for (int i = getNumber(); i < getArray().size(); i++) { //цикл для смещения id на единицу, чтобы не ломать последовательность
            getArray().set(i, getArray().get(i) - 1);
        }
    }

    public static ArrayList<Integer> getArray() {
        return array;
    }

    public static void setArray(ArrayList<Integer> array) {
        Id.array = array;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Id.number = number;
    }
}
