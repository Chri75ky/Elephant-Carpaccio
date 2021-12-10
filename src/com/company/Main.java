package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World! :)");
        System.out.println("Indtast antal varer og pris!");
        int amount = in.nextInt();
        int price = in.nextInt();
        in.nextLine();
        System.out.println("Giv os statskoden:");
        String stateCode = in.nextLine();
        double finalPrice = 0;
        if (stateCode.equalsIgnoreCase("UT")) {
            finalPrice = (amount * price) + (amount * price * 0.0685);
        } else if (stateCode.equalsIgnoreCase("NV")) {
            finalPrice = (amount * price) + (amount * price * 0.08);
        }

        System.out.println(finalPrice);

    }
}
