package homework1;

public class FootballMatch {

    public int result(int a, int b, int c, int d) {
        return trueWinner(a, b, c, d) + trueScore(a, b, c, d);
    }

    private int trueWinner(int a, int b, int c, int d) {
        return (a > b && c > d) || (a < b && c < d) || (a == b && c == d)? 1 : 0;
    }

    private int trueScore(int a, int b, int c, int d) {
        return (a == c && b == d)? 1 : 0;
    }
}
