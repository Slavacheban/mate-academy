package homework5;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator.Operationable operation = (a, ch, b) -> ((BinaryOperator<Double>) calculator.map.get(ch))
                .apply(a, b);
        System.out.println(operation.calculate(5, '-', 4));
        System.out.println(operation.calculate(5, '+', 4));
    }
}
