package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please, enter your first number");
            Scanner sc = new Scanner(System.in);
            double firstCount = sc.nextDouble();

            System.out.println("What do you need to do?");
            String symbol = sc.next();
            if (symbol != "+" || symbol != "-" || symbol != "*" || symbol != "/" ) {
                continue;
            }

            System.out.println("Please, enter your second number");
            double secondNumber = sc.nextDouble();

            switch (symbol) {
                case "+":
                    System.out.println(sum(firstCount, secondNumber));
                    break;
                case "-":
                    System.out.println(subtract(firstCount, secondNumber));
                    break;
                case "/":
                    System.out.println(divide(firstCount, secondNumber));
                    break;
                case "*":
                    System.out.println(multiply(firstCount, secondNumber));
                    break;
                default:
                    System.out.println("Your symbol is not correct");
                    break;
            }
        }
    }

    @Contract(pure = true)
    private static double sum(double newFirstNumber, double newSecondNumber) {
        double sumResult = newFirstNumber + newSecondNumber;
        return sumResult;
    }

    @Contract(pure = true)
    private static double subtract(double newFirstNumber, double newSecondNumber) {
        double subtractResult = newFirstNumber - newSecondNumber;
        return subtractResult;
    }

    @Contract(pure = true)
    private static double multiply(double newFirstNumber, double newSecondNumber) {
        double multiplyResult = newFirstNumber * newSecondNumber;
        return multiplyResult;
    }

    @Contract(pure = true)
    private static double divide(double newFirstNumber, double newSecondNumber) {
        double divideResult = newFirstNumber / newSecondNumber;
        return divideResult;
    }

}