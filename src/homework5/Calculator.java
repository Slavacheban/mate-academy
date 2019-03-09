package homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculator {

    Map<Character, BinaryOperator<Double>> map;

    public Calculator() {
        map = new HashMap<>();
        map.put('+', new BinaryOperator<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return a + b;
            }
        });
        map.put('-', new BinaryOperator<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return a - b;
            }
        });
        map.put('*', new BinaryOperator<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return a * b;
            }
        });
        map.put('/', new BinaryOperator<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return a / b;
            }
        });
        map.put('p', new BinaryOperator<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return Math.pow(a, b);
            }
        });
        map.put('@', new BinaryOperator<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return Math.pow((a + b) / (a + 117), b);
            }
        });
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operationable operation = (a, b, ch) -> ((BinaryOperator<Double>) calculator.map.get(ch))
                .apply(a, b);
        System.out.println(operation.calculate(5, 4, '-'));
        System.out.println(operation.calculate(5, 4, '+'));
        System.out.println(operation.calculate(5, 4, '*'));
    }

    @FunctionalInterface
    interface Operationable {
        double calculate(double x, double y, char ch);
    }
}
