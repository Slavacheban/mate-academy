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
        System.out.println("Запуск потока " + name);
        try {
            System.out.println("Поток " + name + " ожидает разрешения");
            cyclicBarrier.await();
            System.out.println("Поток " + name + " получает разрешение");
            for (int i = 0; i < 10 ; i++) {
                System.out.println(SinglCount.getInstance().inc() + " " + name);
                Thread.currentThread().sleep(100);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Поток " + name + " освобождает разрешение");
    }
}
