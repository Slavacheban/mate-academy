package homework7.singleton;

import java.util.concurrent.Semaphore;

public class SemaphoreRun implements Runnable {
    private Semaphore semaphore;
    private String name;

    public SemaphoreRun(Semaphore sem, String name) {
        this.semaphore = sem;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread " + name);
        try {
            System.out.println("Thread " + name + " waiting");
            semaphore.acquire();
            System.out.println("Thread " + name + " get permission");
            for (int i = 0; i < 10 ; i++) {
                System.out.println(SinglCount.getInstance().inc() + " " + name);
                Thread.currentThread().sleep(100);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Thread " + name + " release permission");
    }
}
