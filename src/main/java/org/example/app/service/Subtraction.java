package org.example.app.service;

import org.example.app.utils.Rounder;

public class Subtraction {

    public String getRes (double num1, double num2) {
        return roundRes(subtract(num1, num2));
    }

    double subtract (double num1, double num2) {
        return num1 - num2;
    }
    String roundRes (double res) {
        return Rounder.roundValue(res);
    }
}
