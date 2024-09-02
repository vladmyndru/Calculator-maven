package org.example.app.service;

import org.example.app.utils.Rounder;

public class Addition {

    public String getRes (double num1, double num2) {
        return roundRes(add(num1, num2));
    }
    double add (double num1, double num2) {
        return num1 + num2;
    }
    String roundRes (double res) {
        return Rounder.roundValue(res);
    }
}
