package org.example;

import org.example.app.service.Addition;
import org.example.app.service.Division;
import org.example.app.service.Multiplication;
import org.example.app.service.Subtraction;
import org.example.app.utils.Constants;
import org.example.app.utils.Validator;

import java.util.Scanner;

public class App {

    static Scanner scanner;
    static double num1;
    static double num2;

    public static void main(String[] args) {
        System.out.println("Calculator");
        scanner = new Scanner(System.in);
        getInputs();
        doCalculation(doOption(),num1, num2);
    }

    private static void getInputs() {
        System.out.println(Constants.FIRST_NUM.getMessage());
        num1 = Validator.validateNumberInput(scanner);
        System.out.println(Constants.SEC_NUM.getMessage());
        num2 = Validator.validateNumberInput(scanner);
    }
    private static int doOption() {
        System.out.println("""
                --------------------------
                Choose an option:
                1 - Addition.
                2 - Subtraction.
                3 - Multiplication.
                4 - Division.
                0 - Close the app.
                """);
        return  Validator.validateOptionInput(scanner);
    }

    private static void doCalculation (int option, double num1, double num2) {
        String result;
        switch ((option)) {
            case 1 -> result = new Addition().getRes(num1, num2);
            case 2 -> result = new Subtraction().getRes(num1, num2);
            case 3 -> result = new Multiplication().getRes(num1, num2);
            case 4 -> result = new Division().getRes(num1, num2);
            case 0 -> {
                System.out.println((Constants.FINISH.getMessage()));
                scanner.close();
                return;
            }
            default -> result = Constants.SMTH_NOT_WRONG.getMessage();
        }
        getOutput(result);
    }
    private static  void getOutput (String  output) {
        if (output.equals(Constants.WHY_ZERO.getMessage())) {
            System.out.println(Constants.WHY_ZERO.getMessage());;
        } else {
            System.out.println("Result is " + output);
        }
    }
}



