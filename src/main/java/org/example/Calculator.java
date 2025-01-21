package org.example;

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

    public double squareRoot(double a) {
        if (a <= 0) {
            System.out.println("Square root of a negative number or 0 is undefined in real numbers.");
            return 0;
        } else {
            return Math.sqrt(a);
        }
    }
}
