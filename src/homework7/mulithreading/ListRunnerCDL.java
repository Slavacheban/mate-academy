package homework7.mulithreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class ListRunnerCDL implements Callable<Long> {

    private List<Integer> list;
    private CountDownLatch countDownLatch;
    private int st;
    private int fin;

    public ListRunnerCDL(int st, int fin, List<Integer> list, CountDownLatch countDownLatch) {
        this.list = list;
        this.countDownLatch = countDownLatch;
        this.st = st;
        this.fin = fin;
    }

    @Override
    public Long call() throws Exception {
        countDownLatch.await();
        Long start = System.currentTimeMillis();
        for (int i = st; i < fin; i++) {
            System.out.println(list.getClass().getCanonicalName() + " " + list.get(i));
        }
        Long finish = System.currentTimeMillis();
        return finish - start;
    }
}
