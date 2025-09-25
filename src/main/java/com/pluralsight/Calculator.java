package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNum = calc.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNum = calc.nextDouble();

        calc.nextLine();

        System.out.print("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");
        String operation = calc.nextLine();

        double result = firstNum * secondNum;
        System.out.println("The result is : " + result);

    }
}
