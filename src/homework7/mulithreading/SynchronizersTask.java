package homework7.mulithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class SynchronizersTask {

    public static void main(String[] args) throws Exception{
        List<Integer> list1 = Collections.synchronizedList(new ArrayList<>());
        List<Integer> list2 = new CopyOnWriteArrayList<>();
        fillList(list1);
        fillList(list2);
        checkList(list1);
        checkList(list2);
    }

    private static void checkList(List<Integer> list) throws Exception{
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Long> f1 = service.submit(new ListRunnerCDL(0, 50, list, countDownLatch));
        Future<Long> f2 = service.submit(new ListRunnerCDL(50, 100, list, countDownLatch));
        countDownLatch.countDown();
        System.out.println("Thread1: " + f1.get());
        System.out.println("Thread2: " + f2.get());
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

}
