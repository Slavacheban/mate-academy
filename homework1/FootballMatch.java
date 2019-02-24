package homework1;

public class FootballMatch {

    public int result(int a, int b, int c, int d) {
        return trueScore(a, b, c, d) ? 2 : trueWinner(a, b, c, d) ? 1 : 0;
    }

    private boolean trueWinner(int a, int b, int c, int d) {
        return (a > b && c > d) || (a < b && c < d) || (a == b && c == d);
    }

    private boolean trueScore(int a, int b, int c, int d) {
        return (a == c && b == d);
    }
}
