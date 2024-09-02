package org.example.app.service;

import org.example.app.utils.Constants;
import org.example.app.utils.Rounder;

public class Division {

    public String getRes (double num1, double num2) {
        if (num2 == 0) {
            return Constants.WHY_ZERO.getMessage();
        }
        return roundRes(divide(num1, num2));
    }
    double divide (double num1, double num2) {
        return num1/num2;
    }
    String roundRes (double res) {
        return Rounder.roundValue(res);
    }
}
