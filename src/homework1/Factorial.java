package homework1;

public class Factorial {

    public static int factorial(int n) {

        return (n == 1 || n == 0)? 1 : n * (factorial(n - 1));
    }
}
