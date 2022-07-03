package com;

import java.util.Scanner;

public class Authentification {

    private static final String LOGIN = "admin";
    private static final String PASSWORD = "1234";

    public static boolean authenticate() {
        Scanner s = new Scanner(System.in);

        boolean isLoginSuccess = false;

        for (int maxCount = 3; maxCount > 0 && !isLoginSuccess; maxCount--) {
            System.out.print("Login: ");
            var login = s.nextLine();

            System.out.print("Password: ");
            var password = s.nextLine();

            if (login.equals(LOGIN) && password.equals(PASSWORD)) {
                isLoginSuccess = true;
                System.out.println("Authentification complete");
            } else {
                System.out.println("Осталось попыток: " + (maxCount-1));
            }
        }

        return isLoginSuccess;
    }
}









