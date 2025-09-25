package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = calc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNum = calc.nextInt();

        calc.nextLine();

        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");
        String operation = calc.nextLine();

        int result = firstNum * secondNum;
        System.out.println("The result is : " + result);

    }
}
