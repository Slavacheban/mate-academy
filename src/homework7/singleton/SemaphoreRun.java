package homework7.singleton;


import java.util.concurrent.Semaphore;


public class SemaphoreRun implements Runnable {
    private Semaphore sem;
    private String name;

    public SemaphoreRun(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            for (int i = 0; i < 10 ; i++) {
                System.out.println(SinglCount.getInstance().inc() + " " + name);
                Thread.currentThread().sleep(100);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Поток " + name + " освобождает разрешение");
    }


}
