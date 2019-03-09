package homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public abstract class Calculator {

    Map<Character, BinaryOperator<Double>> map;

    public Calculator() {
        map = new HashMap<>();
        map.put('+', (a, b) -> (a + b));
        map.put('-', (a, b) -> (a - b));
        map.put('*', (a, b) -> (a * b));
        map.put('/', (a, b) -> (a / b));
        map.put('p', (a, b) -> Math.pow(a, b));
        map.put('@', (a, b) -> Math.pow((a + b) / (a + 117), b));
    }

    @FunctionalInterface
    interface Operationable {
        double calculate(double x, char operand, double y);
    }

    public abstract double calculate(double x, char operand, double y);
}
