package homework8.forkJoin;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ForkJoinClass(0, 5000000).compute());
    }
}
