package org.example;

import java.io.IOException;
import java.sql.SQLException;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static int quadriereZahl(int x) {
        return x * x;}


    public double squareRoot(double a) throws SQLException {
        if (a <= 0) {
            throw new SQLException("The action cannot be supported!");
        } else {
            return Math.sqrt(a);
        }

    }

    public static double calculateSinus(double angleInRadians) {
        return Math.sin(angleInRadians);
    }

    public static double calculateCosinus(double angleInRadians) {
        return Math.cos(angleInRadians);
    }
}
