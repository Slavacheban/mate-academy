package homework7.singleton;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRun implements Runnable {
    private CyclicBarrier cyclicBarrier;
    private String name;

    public CyclicBarrierRun(CyclicBarrier sem, String name) {
        this.cyclicBarrier = sem;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("running thread " + name);
        try {
            System.out.println("Thread " + name + " waiting");
            cyclicBarrier.await();
            System.out.println("Thread " + name + " get permission");
            for (int i = 0; i < 10 ; i++) {
                System.out.println(SinglCount.getInstance().inc() + " " + name);
                Thread.currentThread().sleep(100);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Thread " + name + " release permission");
    }
}
