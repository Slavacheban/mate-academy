package homework5;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public double calculate(double x, char operand, double y) {
                return ( map.get(operand))
                        .apply(x, y);
            }
        };
        System.out.println(calculator.calculate(5, '-', 4));
        System.out.println(calculator.calculate(5, '+', 4));
    }
}
