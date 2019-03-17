package homework7.mulithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueTask {
    private BlockingQueue<Integer> queue;

    public QueueTask(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public Thread[] getThreads() {
        Thread thread1 = new Thread(() -> {
            produce();
        });

        Thread thread2 = new Thread(() -> {
            fixing();
        });

        return new Thread[]{thread1, thread2};
    }

    private void fixing() {
        for (int j = 0; j < 100; j++) {
            try {
                queue.take();
                System.out.println("Fixed element " + j++);
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                System.out.println("end...");
            }
        }
        Thread.currentThread().interrupt();
    }

    private void produce() {
        System.out.println("Begin of working day");
        for (int j = 0; j < 100; j++) {
            queue.add(1);
            System.out.println("Add element " + j++);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                System.out.println("end..");
            }
        }
        Thread.currentThread().interrupt();
    }

    public void doSomething(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        QueueTask queueTask = new QueueTask(new ArrayBlockingQueue<>(10));
        queueTask.doSomething(queueTask.getThreads());
    }
}
