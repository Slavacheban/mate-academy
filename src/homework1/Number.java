package homework1;

public class Number {

    public static double pow(double a, double n) {
        if(n == 0) return 1;
        else if (n == 1) return a;
        else {
            double b = a;
            for (int i = 1; i < n; i++) {
                a*=b;
            }
            return a;
        }
    }
}
