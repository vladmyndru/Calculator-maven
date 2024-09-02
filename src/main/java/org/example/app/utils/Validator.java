package org.example.app.utils;

import java.util.Scanner;

public class Validator {

    public static double validateNumberInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.println(Constants.NOT_NUM);
        }
        return scanner.nextDouble();
    }

    public static int validateOptionInput(Scanner scanner) {

        int[] options = {0, 1, 2, 3, 4};

        while (!scanner.hasNextInt()) {
            System.out.println(Constants.NOT_NUM.getMessage());
        }
        int inputData = scanner.nextInt();

        while (!contains(options, inputData)) {
            System.out.println(Constants.NOW_SUCH_OPTION.getMessage());
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.println(Constants.FINISH.getMessage());
            }
            inputData = scanner.nextInt();
        }
        return inputData;
    }

    public static boolean contains(final int[] array, final int value) {
        boolean result = false;
        for (int i : array) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
