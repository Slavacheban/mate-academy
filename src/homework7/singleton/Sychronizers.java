package homework7.singleton;


import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Sychronizers{
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Thread(new SemaphoreRun(semaphore, "a")).start();
        new Thread(new SemaphoreRun(semaphore, "b")).start();
        new Thread(new SemaphoreRun(semaphore, "c")).start();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        new Thread(new CyclicBarrierRun(cyclicBarrier, "A")).start();
        new Thread(new CyclicBarrierRun(cyclicBarrier, "B")).start();
        new Thread(new CyclicBarrierRun(cyclicBarrier, "C")).start();
        new Thread(new CyclicBarrierRun(cyclicBarrier, "D")).start();
        new Thread(new CyclicBarrierRun(cyclicBarrier, "E")).start();
        new Thread(new CyclicBarrierRun(cyclicBarrier, "F")).start();
    }
}
