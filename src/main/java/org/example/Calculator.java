package org.example;

public class Calculator {
    public double add(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double subtraction(double... numbers) {
        double sub = 0;
        for (double num : numbers) {
            sub -= num;
        }
        return sub;
    }

    public double multiplication(double... numbers) {
        double mult = 0;
        for(double num : numbers) {
            mult *= num;
        }
        return mult;
    }

    public double division(double... numbers) {
        double div = 0;
        for(double num : numbers) {
            if(num < 0) {
                System.out.println("Division by zero is prohibited!!!");
            }
            div /= num;
        }
        return div;
    }

    public double squareRoot(double num) {
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number.");
            return 0;
        }
        return Math.sqrt(num);
    }

    public double cosine(double angle) {
        return Math.cos(angle);
    }

    public double sine(double angle) {
        return Math.sin(angle);
    }
}
