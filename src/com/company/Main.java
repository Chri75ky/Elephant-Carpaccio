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
        } else if (stateCode.equalsIgnoreCase("TX")) {
            finalPrice = (amount * price) + (amount * price * 0.0625);
        } else if (stateCode.equalsIgnoreCase("AL")) {
            finalPrice = (amount * price) + (amount * price * 0.04);
        } else if (stateCode.equalsIgnoreCase("CA")) {
            finalPrice = (amount * price) + (amount * price * 0.0825);
        }

        System.out.println(finalPrice);

    }
}
