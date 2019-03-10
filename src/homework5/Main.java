package homework5;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(5, '-', 4));
        System.out.println(calculator.calculate(5, '+', 4));
    }
}
