package homework8.forkJoin;

import java.util.concurrent.RecursiveTask;

public class ForkJoinClass extends RecursiveTask<Long> {
    private static final int PROCESSES = Runtime.getRuntime().availableProcessors();
    private static final Long COUNT = 1000000000L;
    private long from;
    private long to;

    public ForkJoinClass(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if (to - from <= COUNT / PROCESSES) {
            long result = 1;
            for (long i = from; i < to; i++) {
                result++;
            }
            return result;
        } else {
            long middle = (to + from) / 2;
            ForkJoinClass firstHalf = new ForkJoinClass(from, middle);
            firstHalf.fork();
            ForkJoinClass secondHalf = new ForkJoinClass(middle, to);
            long secondValue = secondHalf.compute();
            return firstHalf.join() + secondValue;
        }
    }
}
