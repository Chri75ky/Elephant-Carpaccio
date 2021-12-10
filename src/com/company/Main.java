package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World! :)");
        System.out.println("Indtast antal varer og pris!");
        int amount = in.nextInt();
        int price = in.nextInt();
        double finalPrice = (amount * price) + (amount * price * 0.0685);
        System.out.println(finalPrice);

    }
}
