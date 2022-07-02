package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Думаю что тут я не особо реализовал наследование, оно мне понадобилось только для прописывания методов
//для записи на прием, чтобы получать строки из массивов докторов и пациентов
//еще этот код достаточно можно подсократить, даже знаю в некоторых местах как, но времени на это немного не хватило)
//Сделал немного больше чем в тз, добавил в каждую таблицу изменение, удаление, добавление и выдачу + у каждого массива
//есть id для более удобного ориентирования и записи на прием
public class Main {
    public static void main(String[] args) {
        Authentification.authentificate();
        Actions actions = new Actions();


    }


}